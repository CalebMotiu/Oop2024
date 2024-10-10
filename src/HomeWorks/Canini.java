package HomeWorks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Canini {
public static void main(String[] args) throws SQLException {
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password","" );
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/oop2024",
				connectionProps);
		
		String breed = "German shepherd";
		int height = 64;
		int weight = 36;
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("CREATE TABLE canini ("
				+ "Id int PRIMARY KEY AUTO_INCREMENT,"
				+ "Breed varchar(255),"
				+ "Height int,"
				+ "weight int);");
		
		String sqlInsert = "INSERT INTO canini (Breed , Height , weight) VALUES (? , ? , ?)";
		PreparedStatement ps = conn.prepareStatement(sqlInsert);
		ps.setString(1, breed);
		ps.setInt(2, height);
		ps.setInt(3, weight);
		ps.executeUpdate();
		
		String deleteValue = "DELETE FROM canini WHERE Id = ? ";
		PreparedStatement psd = conn.prepareStatement(deleteValue);
		psd.setInt(1, 3);
		psd.executeUpdate();
		
		ResultSet rs = stmt.executeQuery("select * from Canini");
		while(rs.next()) {
			String breedPrint = rs.getString("Breed");
			String heightPrint = rs.getString("Height");
			String weightPrint = rs.getString("weight");
			
			System.out.println(breedPrint + " | " + heightPrint + " | " + weightPrint);
		}
		conn.close();
	}
	
}
