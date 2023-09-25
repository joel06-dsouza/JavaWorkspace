import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int []a =  new int[5];
		int []b = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i< a.length; i++)
			a[i] = sc.nextInt();
	
//		Find a max and min value within array
		int max, min;
		int c = 0;
		for(int i=0; i< a.length; i++)
			if(a[i] > c) {
				c = a[i];
			}
			max = c;
		
		System.out.println("Maximum: "+max);
		
		for(int i=0; i< a.length; i++)
			if(a[i] < c) {
				c = a[i];
			}
			min = c;
		
		System.out.println("Minimum: "+min);
		
//		Multiplying the Array
		for(int i=0; i<a.length; i++)
			b[i] = a[i] * 5;
			
		System.out.println("After Multiplying, Resultant is: ");
		for(int i=0; i< b.length; i++)
			System.out.print(b[i]+" ");
	}
	
}
