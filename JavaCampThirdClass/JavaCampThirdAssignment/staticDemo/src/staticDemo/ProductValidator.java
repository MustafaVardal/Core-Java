package staticDemo;

import java.security.PublicKey;

public class ProductValidator {
	
	
	static {
		System.out.println("Static Constructor running");
	}
	
	public ProductValidator() {
			System.out.println("Constructor running...");
	}
	
	
	public static boolean isValid(Product product) { // static ifadesi bir nesnenin ornegini olusturur. Bir kere olusur ve butun kullanicilar onu 1 kere kullabilir.
			// Static bellekten atilmaz!
			// bir methodu static yapilirsa class ismi ile cagirilir yani. ProductValidator.isValid
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}

		else {
			return false;
		}
		
	}
	
	public void something() {
		
	}
	
	
	public static class AnotherClass{ // inner class. When you do grouping, programmer use this structor class. 
		public static void Delete() {
			
		}
	}
}
