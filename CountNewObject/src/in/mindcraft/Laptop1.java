package in.mindcraft;

public class Laptop1{
	private int lid;
	private String make;
	private double cost;
	private static int cnt;
	
	static {
		cnt = 0;
	}
	
	public Laptop1() {		// constructor name == Class Name
		lid = 101;
		make = "Dell";
		cost = 75000;
		cnt++;
	}
	
	public Laptop1(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
		cnt++;
	}

	
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	
	public static void cntShow() {
		System.out.println("Number of Objects- "+cnt);
	}
}
