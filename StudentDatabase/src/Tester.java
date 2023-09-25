import java.sql.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student's Roll No., Student's name & Student's percentage");
		int rno = sc.nextInt();
		String name = sc.next();
		Double percent = sc.nextDouble();
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/student","root","root");
		
		PreparedStatement psmt = c.prepareStatement("Insert into student values(?,?,?)");
		psmt.setInt(1, rno);
		psmt.setString(2, name);
		psmt.setDouble(3, percent);
		
		boolean s = psmt.execute();
		if(!s) {
			System.out.println("Row inserted successfully...");
		}
		c.close();
	}

}
