package classes;

public class CustomerManager {
	String name;

	public void add() {
		System.out.println("Customer added.");
	}

	public void delete() {
		System.out.println("Customer deleted.");

	}

	public void update() {
		System.out.println("Customer updated.");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
