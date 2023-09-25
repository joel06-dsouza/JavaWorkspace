package in.mindcraft.pack1;

public class TestStudent {

	private int rollno;
	private String student_name;
	
	public TestStudent() {
		rollno=101;
		student_name="Joel Dsouza";
	}
	
	public TestStudent(int rollno, String student_name) {
		this.rollno=rollno;
		this.student_name=student_name;
	}
	
	public void show() {
		System.out.println("Student Roll Number: "+rollno);
		System.out.println("Student Roll Number: "+student_name);
	}

}
