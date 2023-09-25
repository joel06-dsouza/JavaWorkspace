import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Tester {


	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lid, name, cost:");
		int lid = sc.nextInt();
		String make = sc.next();
		Double cost = sc.nextDouble();
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test_schema","root","root");

		PreparedStatement psmt = c.prepareStatement("Insert into laptop values(?,?,?)");
		psmt.setInt(1, lid);
		psmt.setString(2, make);
		psmt.setDouble(3, cost);
		
		boolean status = psmt.execute();
		if(!status) {
			System.out.println("Row Inserted Successfully");
		}
//		ResultSet rset = smt.executeQuery("select * from laptop");
/*		while(rset.next()) {
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
		}
		
*/
		c.close();
	}

}
