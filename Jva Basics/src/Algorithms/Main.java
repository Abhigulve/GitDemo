package Algorithms;


class Main
{	
	void checkforprime(int start,int end){
		
	if(start%2==0 && start!=2){
		start=start+1;
	}
	else if(start==2){
		System.out.print(start+" ");
		start+=1;
	}
	for(int i=start;i<=end;i=i+2){
		if((isPrime(i) && i!=1)|| i==2){
			System.out.print(i+" ");
		}

	}
}
	
		private  boolean isPrime(int num){
		if(num==2){
			return true;
		}
		if(num%2==0){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			 if(num%i==0){
				 return false;
			 }
		}
		return true;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception{
	
		Main m=new Main();
		m.checkforprime(2,10);
		
	}
}