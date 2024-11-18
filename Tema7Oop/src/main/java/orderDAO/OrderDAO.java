package orderDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import DbHelper.DbHelper;
import orderPojo.OrderPojo;


public class OrderDAO {

	public static OrderPojo getById(int id) throws SQLException, ClassNotFoundException {
		Connection conn = DbHelper.getConnection();
		String query = "SELECT * FROM order where id=?";
		PreparedStatement getSong = conn.prepareStatement(query);
		getSong.setInt(1, id);
		
		ResultSet rs = getSong.executeQuery();
		OrderPojo order = null;
		if(rs.next())
			order = new OrderPojo(rs.getInt("id"), rs.getString("street_name"), rs.getInt("street_number"), rs.getDate("arrival_date"));
		DbHelper.closeConnection();
		if(order != null)
			return order;
		return null;
	}
	
	public static ArrayList<OrderPojo> getAll () throws SQLException, ClassNotFoundException {
		Connection conn = DbHelper.getConnection();
		String query = "SELECT * FROM order";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<OrderPojo> order = new ArrayList<OrderPojo>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String streetName = rs.getString("street_name");
			int streetNumber = rs.getInt("street_number");
			Date dueDate = rs.getDate("arrival_date");
			order.add(new OrderPojo(id, streetName, streetNumber, dueDate));
		}
		DbHelper.closeConnection();
		return order;
	}
}
