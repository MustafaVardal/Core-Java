package oop1;

public class Main {
	public static void main(String[] args) {
		/*
		 * // String message = "Price ratio: ";
		 * 
		 * Product product1 = new Product(); Product product2 = new Product(); Product
		 * product3 = new Product();
		 * 
		 * // These are coming from database in real life. // set value
		 * product1.setName("Eureka WhirlWind Bagless Canister 2.5L Vacuum Cleaner");
		 * product1.setProductId("123456"); product1.setUnitPrice(69.99);
		 * product1.setYear(2024); product1.setRating(4.7);
		 * product1.setUnitsInStock(100); product1.setDiscount(17.00);
		 * product1.setImageUrl("EurekaWhirlWind.svg");
		 * 
		 * product2.setName("Shark IX141 Pet Cordless Stick Vacuum ");
		 * product2.setProductId("IX141"); product2.setUnitPrice(179.99);
		 * product2.setYear(2024); product2.setRating(4.3);
		 * product2.setUnitsInStock(70); product2.setDiscount(31.00);
		 * product2.setImageUrl("SharkIX141Pet.svg");
		 * 
		 * product3.setName("BISSELL CleanView Rewind Upright Bagless Vacuum ");
		 * product3.setProductId("3534"); product3.setUnitPrice(109.99);
		 * product3.setYear(2024); product3.setRating(4.5);
		 * product3.setUnitsInStock(120); product3.setDiscount(15.00);
		 * product3.setImageUrl("BISSELLCleanViewRewind.svg");
		 * 
		 * Product[] products = { product1, product2, product3 };
		 * System.out.println("<ul>"); // it is coming from html codes. Nowadays
		 * developers are using library like react.
		 * 
		 * // <ul></ul> mean it will create list. // <li></li> means one of the list
		 * member. for (Product product : products) { System.out.println("<li>" +
		 * product.getName() + "</li>"); } System.out.println("</ul>"); // bring data on
		 * the screen with using html.
		 * 
		 * System.out.println(""); // get value System.out.println("Name: " +
		 * product1.name + "\nProduct Id: " + product1.productId + "\nPrice: " +
		 * product1.unitPrice + "\nRating: " + product1.rating + "\nDiscount: -%" +
		 * product1.discount);
		 * 
		 * 
		 */
		
		IndividualCustomer individualCustomer = new  IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setFirstName("MakeACake");
		individualCustomer.setLastName("Kitchen W.");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("1234567");
		corporateCustomer.setPhoneNumber("8887897878");
		corporateCustomer.setCompanyName("Google");
		corporateCustomer.setTaxNumber("1234654878");
		
		Customer [] customers = {individualCustomer, corporateCustomer};
		
		
	}
}
