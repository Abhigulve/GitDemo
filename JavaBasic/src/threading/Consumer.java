package threading;

public class Consumer extends Thread {
	Container con;
	public Consumer(Container con2) {
	con=con2;
	}
	@Override
	public void run() {
		int value=0;
		
		for(int i=0;i<10;i++){
			value=con.get();
		System.out.println("consumer consuming "+ value);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	
	
	
}
