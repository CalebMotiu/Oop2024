package PhoneDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DbHelper.DbHelper;
import PhonePojo.Phone;


public class PhoneDAO {

	public static Phone getById(int id) throws SQLException, ClassNotFoundException {
		Connection conn = DbHelper.getConnection();
		String query = "SELECT * FROM phone where id=?";
		PreparedStatement getSong = conn.prepareStatement(query);
		getSong.setInt(1, id);
		
		ResultSet rs = getSong.executeQuery();
		Phone phone = null;
		if(rs.next())
			phone = new Phone(rs.getInt("id"), rs.getString("manufacturer"), rs.getString("model"), rs.getInt("size"));
		DbHelper.closeConnection();
		if(phone != null)
			return phone;
		return null;
	}
	
	public static ArrayList<Phone> getAll () throws SQLException, ClassNotFoundException {
		Connection conn = DbHelper.getConnection();
		String query = "SELECT * FROM phone";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<Phone> phone = new ArrayList<Phone>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String manufacturer = rs.getString("manufacturer");
			String model = rs.getString("model");
			int size = rs.getInt("size");
			phone.add(new Phone(id, manufacturer, model, size));
		}
		DbHelper.closeConnection();
		return phone;
	}
}
