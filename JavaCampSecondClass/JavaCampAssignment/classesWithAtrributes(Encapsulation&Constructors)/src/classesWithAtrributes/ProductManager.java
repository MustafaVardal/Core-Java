package classesWithAtrributes;

public class ProductManager {
	public void add(Product product) {

		// Solid --- > Single responsibility principle one class, one method does 1 job.
		// Need to create this class.

		// JDBC codes will be here.

		System.out.println("Item added. " + product.getName());
	}
	 /// Encapsulation Start Here!
	
		/*
		 * public void add2(int id, String name, String description, int inStock, double
		 * price ) {
		 * 
		 * }
		 */
	
	// Instead of this methods create a new state in product class.
}
