package interfaces;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	// Create a constructor for more compact way.
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() { // You will add the parameters. 
		// Business layer codes.
		customerDal.add();
	}
}
