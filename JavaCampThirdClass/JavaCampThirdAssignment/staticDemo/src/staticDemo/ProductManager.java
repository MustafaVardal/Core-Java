package staticDemo;

public class ProductManager {
	
	public void add(Product product){
		//ProductValidator validator = new ProductValidator();
		
		//if (validator.isValid(product)) 
		if (ProductValidator.isValid(product)) {
		System.out.println("Added.");
		} else {
			System.out.println("Product infos not valid.");
		}
		
		
		/*
		 * ProductValidator productValidator = new ProductValidator();
		 * productValidator.something();
		 */
		
	}
}
