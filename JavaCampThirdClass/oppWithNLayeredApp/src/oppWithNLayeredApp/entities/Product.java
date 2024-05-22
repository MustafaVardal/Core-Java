package oppWithNLayeredApp.entities;

public class Product {
	// Entities are database's objects such as customer, product, etc.
	
	// all the oop1 assignment codes is collect in here. here is database.
	private int id;
	private String name;
	private double unitPrice;

	public Product() {

	}

	public Product(int id, String name, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
