package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

public interface ProductDao { 
	// We create interface because we have 2 alternative methods.
	// HibernateProductDao and JdbcProductDao.
	void add(Product product);
}
