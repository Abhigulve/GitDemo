
public class CallByValue {

	static void swap(Employee e1,Employee e2 ){
		//Employee temp=e1;
		/*e1=e2;
		e2=temp;
		*/
		e1.setName("new");
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("abhi");
		Employee e2=new Employee();
		e2.setName("sham");
		swap(e1,e2);
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
	}
	
}




