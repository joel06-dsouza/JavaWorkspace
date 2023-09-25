import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	int empid;
	String name;
	double salary;


	public Employee() {
		empid = 101;
		name = "Jayesh";
		salary = 20000;
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

//	public void display() {
//		System.out.println(empid+"  "+name+"  "+salary);
//	}

	public void accept() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id - ");
		empid = sc.nextInt();
		System.out.print("Enter Employee Name - ");
		name = sc.next();
		System.out.print("Enter Employee Salary - ");
		salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}


}

public class Tester {
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("1. Add Details.");
			System.out.println("2. Display Details.");
			System.out.println("3. Update Details.");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Employee e1 = new Employee();
				e1.accept();
				e.add(e1);
				break;
			case 2:
				System.out.println("Details of the Employee:");
				System.out.println();
				for(int i=0; i<e.size();i++) {			
					System.out.println(e.get(i).empid+"  "+e.get(i).name+"  "+e.get(i).salary);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Enter Employee ID:");
				int userempid = sc.nextInt();
				double sal;
				for(int i=0; i<e.size();i++) {
					if(userempid == e.get(i).empid) {
						System.out.println("Enter the salary to be updated:");
						sal=sc.nextDouble();
						e.get(i).salary = sal;
					}
				}
				//				System.out.println("Out of Service....");
				System.out.println();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
