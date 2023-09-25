package in.mindcraft;

public class Employee {

	private int empid;
	private String ename;
	private Date dob;	// reference 
	
	public Employee() {
		empid=101;
		ename="John";
		dob = new Date();
	}

	public Employee(int eid, String name, int dd, int mm, int yy) {
		empid = eid;
		ename = name;
		dob = new Date(dd, mm, yy);
	}
	
	public void show() {
		System.out.println("Employee Id:  "+empid);
		System.out.println("Employee Name: "+ename);
		dob.show();
	}

	
}
