package interfaces;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * ICustomerDal customerDal = new OracleCustomerDal(); // Interfaces can hold
		 * references. customerDal.add();
		 */
		
		// We have layer architecture
		// Data Access Layer DAL -- >> We can write it down database operations.
		// Business Layer -->  Managers -->> Control mechanism
		// User Interfaces --> Javax, swing, and android apps. Or Html
		
		// We will create connect with interfaces for each layers communication. 
		
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		//customerManager.customerDal = new PostsqlCustomerDal();
		customerManager.add();
		
	}
}
