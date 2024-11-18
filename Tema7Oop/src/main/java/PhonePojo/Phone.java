package PhonePojo;

public class Phone {

	private int id;
	private String manufacturer, model;
	private int size;
	
	public Phone(int id, String manufacturer, String model, int size) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
	}

	public Phone(String manufacturer, String model, int size) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
	}
	
	public Phone() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
