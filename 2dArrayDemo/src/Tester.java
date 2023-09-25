import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b = {{1,2,3,4},{5,6},{7,8,9}};  // jagged arrays
		int [][]c = new int[3][4];
		int [][]d = new int[3][];
		d[0] = new int[4];
		d[1] = new int[2];
		d[2] = new int[3];
		Scanner sc = new Scanner(System.in);
//		Normal Print for 2D Array
		for(int i=0; i<d.length; i++)
			for(int j=0; j<d[i].length; j++)
				d[i][j] = sc.nextInt();
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	
//		Printing by For each
//		for(int [] temp: d) {
//			for(int val: temp) {
//				System.out.print(val+" ");
//			}
//			System.out.println();
//		}
	}

}
