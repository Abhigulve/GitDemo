package threading;

import java.io.IOException;

class SlaveMode {
	public void EXECUTEUSERPROGRAM(MasterMode1 master) throws IOException {
		boolean exit=false;
		int mlocation;
		// TODO: loop terminate condition
		while (!exit) {
			MasterMode1.IR = MasterMode1.MEMORY[MasterMode1.IC];
			MasterMode1.IC++;
			
			switch (MasterMode1.IR[0]) {
			case 'G': {
				if (MasterMode1.IR[1] == 'D') {
					master.MOS(1,getLocation()); //call master mode with SI 1
				}
				break;
			}
			case 'P': {
				if (MasterMode1.IR[1] == 'D') {
					master.MOS(2,getLocation()); //call master mode with SI 2
				}
				break;
			}
			case 'S': {
				if (MasterMode1.IR[1] == 'R') {
					mlocation=getLocation();
					MasterMode1.MEMORY[mlocation]=MasterMode1.R;
				}
				break;
			}
			case 'L': {
				if (MasterMode1.IR[1] == 'R') {
					mlocation=getLocation();
					MasterMode1.R=MasterMode1.MEMORY[mlocation];
				}
				break;
			}
			case 'C': {
				if (MasterMode1.IR[1] == 'R') {
					mlocation=getLocation();
					if(MasterMode1.R[0]==MasterMode1.MEMORY[mlocation][0] &&
							MasterMode1.R[1]==MasterMode1.MEMORY[mlocation][1] &&
							MasterMode1.R[2]==MasterMode1.MEMORY[mlocation][2] &&
							MasterMode1.R[3]==MasterMode1.MEMORY[mlocation][3]){
						MasterMode1.C=true;
					}else
						MasterMode1.C=false;
				}
				break;
			}
			case 'B': {
				if (MasterMode1.IR[1] == 'T') {
					if(MasterMode1.C){
						MasterMode1.IC=(short) getLocation();
					}
				}
				break;
			}
			case 'H': {
				master.MOS(3,0); //call master mode with SI 3
				exit=true;
				break;
			}
			}

		}
		return;
	}

	private int getLocation() {
		int mlocation=0,tempM=0,tempL=0;
		//Extract the memory location from IR
		tempM=(int)MasterMode1.IR[2]-48;
		tempL=(int)MasterMode1.IR[3]-48;
		mlocation=((tempM*10)+tempL);
		return mlocation;
	}
}

