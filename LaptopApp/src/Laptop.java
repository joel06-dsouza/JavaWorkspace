class Laptop1{
	private int lid;
	private String make;
	private double cost;
	
	public Laptop1() {		// constructor name == Class Name
		lid = 101;
		make = "Dell";
		cost = 75000;
	}
	
	public Laptop1(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
	
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
}

public class Laptop {

	public static void main(String[] args) {
		Laptop1 l1 = new Laptop1();
		l1.show();
		Laptop1 l3 = new Laptop1(102, "HP", 50000);
		System.out.println(l3.getCost());
		l3.setCost(55000);
		l3.show();
	}

}
