
public class Stack implements StackInterface {
	Object stack[]=new Object[100];
	 int top=-1;
	 int max=99;

	@Override
	public Object pop() {
		if(top!=-1)
			{top--;
			return stack[top++];
			}
		else 
			return "stack is empty";
	}

	@Override
	public void push(Object obj) {
		if(top!=max){
			stack[++top]=obj;
			System.out.println("data added");
		}
	}

	public static void main(String[] args) {
		
	Stack st=new Stack();
	st.push("abhi");
	System.out.println(st.pop());
	
	}
	
}
