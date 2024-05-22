package overriding;

public class IndividualCreditManager extends BaseCreditManager{
	@Override
	public double calculation(double cost) {
		return cost *1.50; // Use the interest calculation here.  
	}

}
