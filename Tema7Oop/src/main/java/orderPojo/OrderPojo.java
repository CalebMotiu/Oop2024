package orderPojo;

import java.util.Date;

public class OrderPojo {

	private int id;
	private String streetName;
	private int streetAdress;
	private Date arrivalDate;
	
	
	public OrderPojo(int id, String streetName, int streetAdress, Date arrivalDate) {
		this.id = id;
		this.streetName = streetName;
		this.streetAdress = streetAdress;
		this.arrivalDate = arrivalDate;
	}


	public OrderPojo(String streetName, int streetAdress, Date arrivalDate) {
		this.streetName = streetName;
		this.streetAdress = streetAdress;
		this.arrivalDate = arrivalDate;
	}
	
	public OrderPojo() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public int getStreetAdress() {
		return streetAdress;
	}


	public void setStreetAdress(int streetAdress) {
		this.streetAdress = streetAdress;
	}


	public Date getArrivalDate() {
		return arrivalDate;
	}


	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
	
}
