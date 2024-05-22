package oppWithNLayeredApp.business;


import java.util.List;

import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entities.Product;
import oppWithNLayeredApp.core.logging.Logger;


public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers; // get all loggers!
	
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {

		this.productDao = productDao;
		this.loggers = loggers;
	}

	// When the productManager is new, give me a productDao. Code dependent only interface .

	// We don't want to see duplicate data.
	// We say for this ! Business domain!
	// We can see this name like ProductService or ProductServiceImpl
	// when the user enter the data, we will get here.
	public void add(Product product) throws Exception { // Here we said. Be aware. This kind of error could be throw!
		// We will write down here business rules.

		// Bad implementversion of rules!!.
		// If your product price should be more than 10 dollar. throw new error.
		if (product.getUnitPrice() < 10) {
			throw new Exception("Product shouldn't be less then 10$.");
		} // this is bad example implementation code. IF condition is really costly. But
			// still is not spagetti code.

		productDao.add(product);
		
		
		for (Logger logger : loggers) { // [db, mail logger] run the loggers.
			logger.log(product.getName());
		}

		/// if it is suitable my rule let's continue...
		/*
		 * JdbcProductDao productDao = new JdbcProductDao(); productDao.add(product);
		 * This is not suitable to use sustainable code... Because now it is dependency!
		 */

		// Productdao will hold the references jdbc or hibernate.

		/*
		 * ProductDao productDao2 = new HibernateProductDao(); productDao2.add(product);
		 * This is not suitable to use sustainable code... Because now it is dependency!
		 * // OR
		 * 
		 * ProductDao productDao3 = new JdbcProductDao(); productDao3.add(product);
		 */

		// Rule!!!

		// While a layer use other layer of class, only should access with their
		// interface.!

	}
}
