package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.core.logging.MailLogger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone XR", 1000); // User add all infos.

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		Logger[] loggers2 = { new DatabaseLogger(), new FileLogger(), new MailLogger()};

		// Product product2 = new Product(1, "IPhone 12", 9); // We will get an error.
		// We still don't see the api thats why userinterface will deal with Business
		// unit.
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		
		System.out.println("");
		
		ProductManager productManager2 = new ProductManager(new JdbcProductDao(), loggers2);
		productManager2.add(product1);
		// ProductManager productManager2 = new ProductManager();
		// productManager2.add(product2); Exception in thread "main"
		// java.lang.Exception: Product shouldn't be less then 10$.

		// Add all infos here and check our rules in ProductManager class.
		// If it is good for our rules, go and add database.

	}

}
