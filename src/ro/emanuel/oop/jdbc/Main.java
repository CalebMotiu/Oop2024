package ro.emanuel.oop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password","" );
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/oop2024",
				connectionProps);
		
		String bName = "Salt";
		String bAddress = "Arad";
		String bSwift = "208fdbhva3";
		
		
		Statement stmt = conn.createStatement();
		
//		String sqlInsert = "INSERT INTO bank (name , address , swift) VALUES (? , ? , ?)";
//		PreparedStatement ps = conn.prepareStatement(sqlInsert);
//		ps.setString(1, bName);
//		ps.setString(2, bAddress);
//		ps.setString(3, bSwift);
//		ps.executeUpdate();
		
//		String update = "UPDATE bank SET address = ? WHERE id = ?";
//		PreparedStatement psu = conn.prepareStatement(update);
//		psu.setString(1, bAddress);
//		psu.setInt(2, 1);
//		psu.executeUpdate();
		
		String deleteValue = "DELETE FROM bank WHERE ID >= ?";
		PreparedStatement psd = conn.prepareStatement(deleteValue);
		psd.setInt(1, 4);
		System.out.println(psd.executeUpdate());
		
		System.out.println(" rows updated");
		
		ResultSet rs = stmt.executeQuery("select * from bank");
		while(rs.next()) {
			int id = rs.getInt("id");
			String bankName = rs.getString("name");
			String bankAddress = rs.getString("address");
			String bankSwift = rs.getString("swift");
			
			System.out.println(id + " | " + bankName + " | " + bankAddress+" | " + bankSwift);
		}
		conn.close();
	}
}
