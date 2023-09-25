import in.mindcraft.pack1.TestStudent;
import in.mindcraft.pack2.TestBatch;

public class Tester {

	public static void main(String[] args) {
		TestStudent ts1 = new  TestStudent();
		TestBatch tb1 = new TestBatch();
		TestStudent ts2 = new  TestStudent(112,"Ash King");
		TestBatch tb2 = new TestBatch("Java",16);
		TestStudent ts3 = new  TestStudent(113,"Sonu");
		TestBatch tb3 = new TestBatch("DBMS", 10);
		ts1.show();
		tb1.show();
		ts2.show();
		tb2.show();
		ts3.show();
		tb3.show();
	}

}
