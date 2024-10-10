package HomeWorks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Feline {

public static void main(String[] args) throws SQLException {
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password","" );
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/oop2024",
				connectionProps);
		
		String breed = "tiger";
		int height = 105;
		int weight = 206;
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("CREATE TABLE feline ("
				+ "Breed varchar(255),"
				+ "Height int,"
				+ "weight int);");
		
		String sqlInsert = "INSERT INTO feline (Breed , Height , weight) VALUES (? , ? , ?)";
		PreparedStatement ps = conn.prepareStatement(sqlInsert);
		ps.setString(1, breed);
		ps.setInt(2, height);
		ps.setInt(3, weight);
		ps.executeUpdate();
		
		String deleteValue = "DELETE FROM feline WHERE Breed = ? ";
		PreparedStatement psd = conn.prepareStatement(deleteValue);
		psd.setString(1, breed);
		psd.executeUpdate();
		
		ResultSet rs = stmt.executeQuery("select * from feline");
		while(rs.next()) {
			String breedPrint = rs.getString("Breed");
			String heightPrint = rs.getString("Height");
			String weightPrint = rs.getString("weight");
			
			System.out.println(breedPrint + " | " + heightPrint + " | " + weightPrint);
		}
		conn.close();
	}
}
