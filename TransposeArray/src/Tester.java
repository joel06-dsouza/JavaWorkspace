import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int [][]a = new int[3][3];
		int [][]b = new int[3][3];
		int [][]c = new int[3][3];
		int [][]d = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for 3x3 matrix: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The Original Matrix is: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The Transpose Matrix is: ");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
					b[j][i] = a[i][j];
				}
			}
		
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Resultant: ");
		for(int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i = 0; i<c.length; i++) {
			for(int j = 0; j<c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
