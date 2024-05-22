package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

	// regularly we could not able to copy codes. but we create a simulation for our
	// practices.

	public void add(Product product) { // it should obey the ProductDao Interface rules.

		// We just simulated print method here.
		System.out.println("Element was added by Hibernate in database. ");
		// Assume that we have lots of code here. 
	}
}
