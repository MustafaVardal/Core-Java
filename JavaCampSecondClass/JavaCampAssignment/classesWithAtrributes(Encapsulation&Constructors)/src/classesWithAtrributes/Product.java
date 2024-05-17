package classesWithAtrributes;

public class Product {

	// Constructor!!!!!!!!!!!!!!!!!!!!!
	public Product() {
		System.out.println("Constructor block is working.");
	}

	public Product(int id, String name, String description, double price, int inStock, String color) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
		this.color = color;
	}

	// Encapsulation is starting here.
	// attributes or fields.
	// these are now all public access modifier. if we sign with private. only using
	// in this block.
	// block means where is previous curly braces near to Product class. so this
	// mean it can access Product class block.
	/*
	 * int id; String name; String description; double price; int inStock; String
	 * color;
	 */
	private int id;
	private String name;
	private String description;
	private double price;
	private int inStock;
	private String color;
	private String code; // user cannot be access this. Should be only read.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;// read only id
	}

	public void setName(String name) {
		this.name = name;// write only id
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

}
