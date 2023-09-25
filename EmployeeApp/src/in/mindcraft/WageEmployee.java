package in.mindcraft;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	
	public WageEmployee() {
		hours=0;
		rate=0;
	}
	
	public WageEmployee(int id, String name, int dd, int mm, int yy, int h, int r) {
		super(id, name, dd, mm, yy);
		hours=h;
		rate=r;
	}
	
	public void show() {
		super.show();
		System.out.println("Hours: "+hours);
		System.out.println("Rate: "+rate);
		System.out.println("Salary of WageEmployee: "+hours*rate);
	}

	protected int getHours() {
		return hours;
	}

	protected void setHours(int hours) {
		this.hours = hours;
	}

	protected int getRate() {
		return rate;
	}

	protected void setRate(int rate) {
		this.rate = rate;
	}
}

