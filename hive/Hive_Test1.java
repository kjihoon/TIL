package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hive_Test1 {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.111.102:10000/" 
		+ "default", "root", "111111");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM airline_delay limit 20");
		while (rs.next()) {
			System.out.println(rs.getInt(1));

		}
		conn.close();
		System.out.println("Success....");

	}

}


