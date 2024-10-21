package oop.tema2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oop.tema2.rubiksCube.RubiksCube;
import oop.teme.helper.DBHelper;

public class RubiksCubeDao {

	public static List<RubiksCube> getRubiksCube() throws SQLException{
		List<RubiksCube> rubiksCubes = new ArrayList<>();
		
		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from rubikscube");
		while(rs.next()) {
			int id = rs.getInt("id");
			String brand = rs.getString("brand");
			double weight = rs.getDouble("weight");
			int sides = rs.getInt("sides");
			String type = rs.getString("type");
			RubiksCube rc = new RubiksCube(id, brand, weight , sides, type);
			rubiksCubes.add(rc);
		}
		DBHelper.closeConnection();
		return rubiksCubes;
		}
	
	public static int deletRubiksCube(int id) throws SQLException {
		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();
		
		int deletedRows = stmt.executeUpdate("delet from rubikscube where id" + id);
		
		DBHelper.closeConnection();
		return deletedRows;
	}
	
	public static int creatRubiksCube(RubiksCube rc) throws SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "insert into rubikscube (brand,weight,sides,type) value (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
				
		ps.setString(1, rc.getBrand());
		ps.setDouble(2, rc.getWeight());
		ps.setInt(3, rc.getSides());
		ps.setString(4, rc.getType());
		
		int affectedRows = ps.executeUpdate();
		
		DBHelper.closeConnection();

		return affectedRows;
	}
	
	public static int updateRubiksCube(RubiksCube rc ) throws SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "update rubikscube set brand = ?, weight = ? , sides = ?, type = ? where id = ?";
		PreparedStatement ps = conn.prepareStatement(query);

		ps.setString(1, rc.getBrand());
		ps.setDouble(2, rc.getWeight());
		ps.setInt(3, rc.getSides());
		ps.setString(4, rc.getType());
		ps.setInt(5, rc.getId());
		
		int rowsUpdated = ps.executeUpdate();
		DBHelper.closeConnection();
		return rowsUpdated;	
		}
	
	public static RubiksCube getRCByID(int id) throws SQLException {
		Connection conn = DBHelper.getConnection();

		List<RubiksCube> RubiksCubes = getRubiksCube();
		for(RubiksCube rc : RubiksCubes) {
			if(rc.getId() == id) {
				return rc;
			}
		}
		return null;
	}
}
