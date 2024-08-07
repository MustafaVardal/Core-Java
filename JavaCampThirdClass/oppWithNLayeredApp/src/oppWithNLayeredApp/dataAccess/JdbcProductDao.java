package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{ // it should obey the ProductDao Interface rules.

	// JDBCPRODUCTDAO means that JDBCPRODUCT DATA ACCESS OBJECT CLASS. It is super
	// popular to use modern java world.
	// Jdbc is one of the methods which is using for data access object.
	// Hibernate also is a method.
	// Jpa also is a method.
	// latest version of data access object method is Jpa.

	public void add(Product product) { // we need to import this package to use different package.!
		
			/// Only by only db access codes will add here... // You should know that sql :) 
		
			// We just simulated print method here. 
			System.out.println("Element was added by JBDC in database. ");
			
			
	}
}


// if we want to go new version of jdbc which is Hibernate, it could be step by step. but we have another option too. 
// Go HibernateProductDao
