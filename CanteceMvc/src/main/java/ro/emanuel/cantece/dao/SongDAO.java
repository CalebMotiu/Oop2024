package ro.emanuel.cantece.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ro.emanuel.cantece.helper.DBHelper;
import ro.emanuel.cantece.pojo.Song;

public class SongDAO {

	public static Song getById(int id) throws SQLException, ClassNotFoundException {
		Connection conn = DBHelper.getConnection();
		String query = "SELECT * FROM songs where id=?";
		PreparedStatement getSong = conn.prepareStatement(query);
		getSong.setInt(1, id);
		
		ResultSet rs = getSong.executeQuery();
		Song song = null;
		if(rs.next())
			song = new Song(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getString("link_music_sheets"), rs.getString("verses"), rs.getInt("nr_votes"));
		DBHelper.closeConnection();
		if(song != null)
			return song;
		return null;
	}
	
	public static ArrayList<Song> getAll () throws SQLException, ClassNotFoundException {
		Connection conn = DBHelper.getConnection();
		String query = "SELECT * FROM songs";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<Song> songs = new ArrayList<Song>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String linMusicSheet = rs.getString("link_music_sheets");
			String verses = rs.getString("verses");
			int nrVotes = rs.getInt("nr_votes");
			songs.add(new Song(id, title, author, linMusicSheet, verses, nrVotes));
		}
		DBHelper.closeConnection();
		return songs;
	}

	public static void update(Song s) throws ClassNotFoundException, SQLException {
		String update = "update songs set title=?, author=?,"
				+ "link_music_sheets=?, verses=?, nr_votes=? where id=?";
		
		Connection conn = DBHelper.getConnection();
		
		PreparedStatement stmt = conn.prepareStatement(update);
		stmt.setString(1, s.getTitle());
		stmt.setString(2, s.getAuthor());
		stmt.setString(3, s.getLinkMusicSheet());
		stmt.setString(4, s.getVerses());
		stmt.setInt(5, s.getNrVotes());
		stmt.setInt(6, s.getId());
		
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}
	
	public static void create(Song s) throws ClassNotFoundException, SQLException {
		String createQuery = "insert into songs (title, author, link_music_sheets, verses, nr_votes) values (?,?,?,?,?)";
		Connection conn = DBHelper.getConnection();
		
		System.out.println(s);
		
		PreparedStatement stmt = conn.prepareStatement(createQuery);
		stmt.setString(1, s.getTitle());
		stmt.setString(2, s.getAuthor());
		stmt.setString(3, s.getLinkMusicSheet());
		stmt.setString(4, s.getVerses());
		stmt.setInt(5, s.getNrVotes());
		
		stmt.execute();

		DBHelper.closeConnection();
	}
	public static void delete(int id) throws ClassNotFoundException, SQLException {
		String deleteQuery = "delete from songs where id=" + id;
		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(deleteQuery);
		DBHelper.closeConnection();

	}
}