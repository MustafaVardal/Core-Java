package gettersetter;

public class ProductManager {
	public void add(Product product) {
		System.out.println("Product added in database. " + product.getName());
	}

	public void delete(Product product) {
		System.out.println("Product deleted in database. " + product.getName());
	}

	public void update(Product product) {
		System.out.println("Product updated in database. " + product.getName());
	}
}
