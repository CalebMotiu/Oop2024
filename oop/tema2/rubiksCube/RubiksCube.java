package oop.tema2.rubiksCube;

public class RubiksCube {

	private int id;
	private String brand;
	private double weight;
	private int sides;
	private String type;
	
	public RubiksCube(int id, String brand, double weight, int sides, String type) {
		this.id = id;
		this.brand = brand;
		this.weight = weight;
		this.sides = sides;
		this.type = type;
	}

	public RubiksCube(String brand, double weight, int sides, String type) {
		this.brand = brand;
		this.weight = weight;
		this.sides = sides;
		this.type = type;
	}

	public String toString() {
		return "Rubiks Cube [id=" + id + ", brand=" + brand + ", weight=" + weight + ", sides=" + sides + ", type=" + type + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
