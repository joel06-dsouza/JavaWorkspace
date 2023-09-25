package in.mindcraft;

public class SalesEmployee extends WageEmployee {
	private int sales;
	private int commision;
	
	public SalesEmployee() {
		sales=0;
		commision=0;
	}
	
	public SalesEmployee(int id, String name, int dd, int mm, int yy, int h, int r, int s, int c) {
		super(id, name, dd, mm, yy, h,r);
		sales=s;
		commision=c;
	}
	
	int hrs=getHours();
	int rate=getRate();
	
	
	public void show() {
		super.show();
		System.out.println("Sales: "+sales);
		System.out.println("Commision: "+commision);
		System.out.print("Salary of SalesEmployee: ");
		System.out.println((sales * commision)+(hrs*rate));
	}
}

