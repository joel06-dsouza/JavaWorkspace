class Stack<G>
{
	private int top;
	private int size;
	private G []arr;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		size=5;
		top=-1;
		arr=(G[])new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int s) {
		this.size=s;
		top=-1;
		arr=(G[])new Object[size];
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(G val) throws Exception {
		if(!isFull()) {
			top++;
			arr[top] = val;
		}
		else {
			throw new Exception("Stack Full");			
		}
	}
	
	public G pop() throws Exception {
		if(!isEmpty()) {
			return arr[top--];			
		}
		else {
			throw new Exception("Underflow!!...");
		}
	}
	
	public G peep() {
		return arr[top];
	}
	
	public void display() {
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		try {
			s1.push(12);
			s1.push(22);
			s1.push(32);
			s1.push(42);
			s1.push(52);
			System.out.println(s1.pop());
			System.out.println(s1.peep());
			System.out.println(s1.pop());
			s1.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		Stack<String> s2 = new Stack<>();
		try {
			s2.push("O");
			s2.push("A");
			s2.push("B");
			s2.push("C");
			s2.push("D");
			System.out.println(s2.pop());
			System.out.println(s2.peep());
			System.out.println(s2.pop());
			s2.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
