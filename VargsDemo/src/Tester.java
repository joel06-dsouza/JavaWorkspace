// Variable Argument List

public class Tester {
	public static int add(int ...a) { // a becomes array
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4,5));
		System.out.println(add(1,2,3,4,5,6));
		System.out.println(add(1,2,3,4));
	}

}
