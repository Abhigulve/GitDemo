package threading;

public class Container {
private int content;
boolean available=false;

public synchronized int get(){
	
	while(available==false){
		try{
			wait();
		}catch(InterruptedException e){			
		}
	}
		available=false;
		notifyAll();
		return content;
}
public synchronized void put(int number){
	while(available==true){
		try{
			wait();
		}catch(InterruptedException e){			
		}
	}
	content=number;
	available=true;
	notifyAll();
}



public static void main(String[] args) {
	Container  con = new Container();
	Producer p=new Producer(con);
	Consumer c=new Consumer(con);
	p.start();
	c.start();
	
}
}
