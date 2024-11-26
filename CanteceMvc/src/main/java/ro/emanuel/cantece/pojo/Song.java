package ro.emanuel.cantece.pojo;

public class Song {

	private int id;
	private String title;
	private String author;
	private String linkMusicSheet;
	private String verses;
	private int nrVotes;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	public Song(int id, String title, String author, String linkMusicSheet, String verses, int nrVotes) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.linkMusicSheet = linkMusicSheet;
		this.verses = verses;
		this.nrVotes = nrVotes;
	}
	
	public Song(String title, String author, String linkMusicSheet, String verses, int nrVotes) {
		this.title = title;
		this.author = author;
		this.linkMusicSheet = linkMusicSheet;
		this.verses = verses;
		this.nrVotes = nrVotes;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getLinkMusicSheet() {
		return linkMusicSheet;
	}

	public String getVerses() {
		return verses;
	}

	public int getNrVotes() {
		return nrVotes;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setLinkMusicSheet(String linkMusicSheet) {
		this.linkMusicSheet = linkMusicSheet;
	}

	public void setVerses(String verses) {
		this.verses = verses;
	}

	public void setNrVotes(int nrVotes) {
		this.nrVotes = nrVotes;
	}

	public String toString () {
		return id +","+title+","+author+","+linkMusicSheet+","+verses+","+nrVotes;
	}

}