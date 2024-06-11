package springIntro;

public class CustomerManager implements ICustomerService {
	
	
	
	
	private ICustomerDal customerDal;

	// Constructor injection/
	// public CustomerManager(ICustomerDal customerDal) {
	// this.customerDal = customerDal;
	// }
	// Customer Manager parametre olarak bir customerDal istiyor.

	// Setter injection
	// !tavsiye edilmez!

	public void setCustomerDal(ICustomerDal customerDal) { // Contructor injection sektorde daha fazla kullanildigi
															// icin. setter injection tavsiye edilmez.
		this.customerDal = customerDal; // uygulamak icin application a property eklenir.
	}

	public void add() {
		/* is kurallari */
		// Newlemeden yapilmasi icin interface olusturucagiz.
		/*
		 * CustomerDal customerDal = new CustomerDal(); customerDal.add();
		 */
		customerDal.add();
	}

}