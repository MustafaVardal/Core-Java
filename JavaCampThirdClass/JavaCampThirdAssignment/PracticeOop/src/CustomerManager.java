
public class CustomerManager {

	private Customer customer;
	ICreditManager iCreditManager;
	
	
	public CustomerManager() {

	}

	public CustomerManager(Customer customer, ICreditManager iCreditManager) { // interfaceler referans tiptir. 
		// interfaceler referans tip oldugu icin her kim implement ederse o referansi tutar.
		this.customer = customer;
		this.iCreditManager = iCreditManager;
	}

	public void save() {
		System.out.println("Customer is saved." + customer.getClass());
	}

	public void delete() {
		System.out.println("Customer is deleted." + customer.getClass());
	}
	
	public void giveCredit() {
		this.iCreditManager.calculate();
		this.iCreditManager.save();
	}
}
/*
 * public void Save() { System.out.println("Customer is saved." +
 * this.customer.getFirstName() ); }
 * 
 * public void Delete() { System.out.println("Customer is deleted." +
 * this.customer.getFirstName()); } }
 */
