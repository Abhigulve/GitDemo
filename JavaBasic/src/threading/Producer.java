package threading;

public class Producer extends Thread{

	Container con;
	public Producer(Container con2) {
		con=con2;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{	System.out.println("producing "+i);	
			con.put(i);
			
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
		
	}


}
