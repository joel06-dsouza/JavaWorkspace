class Employee {
	private int empid;
	private String name;
	private double salary;
	


	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	

	protected double getSalary() {
		return salary;
	}


	protected void setSalary(double salary) {
		this.salary = salary;
	}


	public void show() {
		System.out.println(empid+" "+name+" "+salary);
		
	}
	
}

class Manager extends Employee {
	
	public Manager(int empid, String name, double sal) {
		super(empid, name, sal); 
//		this.sal = sal;
	}
	
	double sal = getSalary();
	
	double allowances = (0.08 * sal) + (0.12 * sal) + (0.04 * sal);
	
	
	public double calSalaryManager() {
		double grossSalary = sal + allowances;
		double netSalary  = grossSalary - (0.125 * sal);
		return netSalary;
	}
	
}

class MarketingExecutive extends Employee {
	private int km;
	private double telephone_allowance = 2000;
	
	
	public MarketingExecutive(int empid, String name, double salary, int km) {
		super(empid, name, salary);
		this.km = km;
	}
	
	
	double sal = getSalary();
	
	double allowances = (5 * km) + (telephone_allowance);
	public double calSalaryExecutive() {
		double netSalary = sal + allowances;
		return netSalary;
	}
	
}

public class Tester {
	public static void printObject(Employee e) {
		e.show();
	}
	
	public static void main(String[] args) {
		Manager m1 = new Manager(101,"Joel",10000);
		printObject(m1);
		System.out.println("Salary of Manager is - "+m1.calSalaryManager());
		MarketingExecutive e1 = new MarketingExecutive(101,"Joel",10000, 10);
		System.out.println("Salary of Executive is - "+e1.calSalaryExecutive());
	}

}
