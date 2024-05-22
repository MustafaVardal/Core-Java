package interfaces;

public class PostsqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("PostSQL Added.");
		
	}
	
}
