package multithreading;

/**********************************************
Assignment 1
**********************************************/

import java.io.*;

public class MasterMode1 {

	static char[][] MEMORY;		//Main Memory. 2D Array(100x4), 400 bytes
	static char[] IR;			//Instruction register. 4 bytes
	static short IC;			// Instruction Counter 2 bytes
	static char[] R;			//General Purpose Register 4 bytes
	static boolean C;			//Toggle Register 1 Byte
	private File inputFile;		//Input File
	private File outputFile;	//Output File
	static BufferedReader reader;//Reader for File
	static BufferedWriter writer;//Writer for File
	static int u, l;			//Keep track of memory
	static SlaveMode slave;		//Object of slave mode

	// constructor for masterMode
	public MasterMode1() {
		C = false;
		IC = 0;
		u = 0;
		l = 0;
		MEMORY = new char[100][4];
		R = new char[4];
		IR = new char[4];
		inputFile = new File("input.txt");
		outputFile = new File("output.txt");
		slave = new SlaveMode();
		
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));
			outputFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void flush() {
		C = false;
		IC = 0;
		u = 0;
		l = 0;
		MEMORY = new char[100][4];
		R = new char[4];
		IR = new char[4];
	}

	private void load(MasterMode1 master) {
		try {
			String data = "";
			char[] inst = new char[100];
			// reading the file line by line
			while ((data = reader.readLine()) != null) {
				// start reading from next line load instructions in MEMORY till
				// next line is $data
				if (data.startsWith("$AMJ")) {
					flush();
					while (!(data = reader.readLine()).startsWith("$DTA")) {

						inst = data.toCharArray();
						for (int i = 0; i < inst.length; i++) {
							MEMORY[u][l++] = inst[i];
							l = (l < 4) ? l : 0;
							u = (l == 0) ? u + 1 : u;
						}
					}
					STARTEXECUTION(master);
				}

			}

			writer.close();
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/*
	 * This method initialize IC and calls slave mode to execute user program.
	 */

	private void STARTEXECUTION(MasterMode1 master) {
		IC = 0;
		try {
			slave.EXECUTEUSERPROGRAM(master);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void MOS(int SI, int mlocation) throws IOException {
		String data = "";

		// memory location
		char[] temp = new char[40];
		switch (SI) {
		// SI 1 : Read Interrupt
		case 1: {

			// start writing the data to memory
			if (!(data = reader.readLine()).startsWith("$END")) {
				l = 0;
				temp = data.toCharArray();
				for (int i = 0; i < temp.length; i++) {
					MEMORY[mlocation][l++] = temp[i];
					l = (l < 4) ? l : 0;
					mlocation = (l == 0) ? mlocation + 1 : mlocation;
				}
			}
			return;

		}
		// SI 2 : Write Interrupt
		case 2: {
			for (int i = 0; i < 10; i++) {
				writer.append(MEMORY[mlocation][0]);
				writer.append(MEMORY[mlocation][1]);
				writer.append(MEMORY[mlocation][2]);
				writer.append(MEMORY[mlocation++][3]);
			}
			writer.newLine();
			break;
		}
		// SI 3 : Terminate Interrupt
		case 3: {
			writer.newLine();
			writer.newLine();
			break;
		}

		}
		return;
	}

	public static void main(String[] args) {
		MasterMode1 master = new MasterMode1();
		master.load(master);

	}
}

