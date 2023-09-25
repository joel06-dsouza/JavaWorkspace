import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int [] a =  new int[5]; // intialized
//		int [] b = {10, 20, 30}; // intialized
//		float [] c = new float[5]; // un-intialized
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i< a.length; i++)
			a[i] = sc.nextInt();
		
//		for(int i=0; i< c.length; i++)
//			System.out.println(c[i]+" ");
//	
//		for(float val:c) {				// for-each -> used for printing -> read only loop
//			System.out.println(val+" ");
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
	}
	
}
