package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("Mysql Added.");
		
	}
	// Data Access Layer!
	// We write it down all Database operations.

}
