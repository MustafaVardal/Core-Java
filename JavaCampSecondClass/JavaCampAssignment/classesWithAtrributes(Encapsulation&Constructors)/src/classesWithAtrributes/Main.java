package classesWithAtrributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();

		Product product1 = new Product(2, "Laptop", "Asus", 1500.00, 2, "Black-Red");// Constructor use!

		System.out.println(product1.getId() + "\t" + product1.getName() + "\t" + product1.getDescription() + "\t"
				+ product1.getPrice() + "\t" + product1.getInStock() + "\t" + product1.getColor() + "\t"
				+ product1.getCode());
		product.setId(1);
		product.setName("Airfrier");
		product.setDescription("Fry your potatoes.");
		product.setPrice(69.99);
		// Assume that we want to put specific rule this price when we transfer this
		// attribute.
		// Example : product.price = -9; it should not be negative number any items.
		product.setInStock(5);
		product.setColor("Blue");
		// Encapsulation

		/// Create a schema
		// id name description price inStock
		// 123 Airfrier Fry your potatoes. 69.99 5

		System.out.println(
				product.getId() + "\t" + product.getName() + "\t" + product.getDescription() + "\t" + product.getPrice()
						+ "\t" + product.getInStock() + "\t" + product.getColor() + "\t" + product.getCode());

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		/*
		 * /// Start Encapsulation here! /// Assume that you need to add new specific
		 * ///state so this is not useful method to use. It will be super time costly.
		 * productManager.add2(1, "", "", 2, 200); productManager.add2(1, "", "", 2,
		 * 200); productManager.add2(1, "", "", 2, 200); productManager.add2(1, "", "",
		 * 2, 200); productManager.add2(1, "", "", 2, 200); productManager.add2(1, "",
		 * "", 2, 200);
		 */

	}

}
