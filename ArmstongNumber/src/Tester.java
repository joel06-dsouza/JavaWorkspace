import java.util.Scanner;

public class Tester {
	public static void main(String args[])
	{
		int num, sum = 0, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number: ");
		num = sc.nextInt();
		int temp = num;
		while(num > 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println(temp+ " is an Armstrong Number.");
		} else {
			System.out.println(temp +" is not an Armstrong Number.");
		}
	
	}

}
