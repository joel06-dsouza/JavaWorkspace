import in.mindcraft.*;
import static java.lang.System.out;

public class Tester {

	public static void main(String[] args) {
		Laptop1 l1 = new Laptop1();
		l1.show();
		Laptop1 l3 = new Laptop1(102, "HP", 50000);
		l3.show();
		Laptop1.cntShow();
		out.println("Hello its a static import");

	}

}
