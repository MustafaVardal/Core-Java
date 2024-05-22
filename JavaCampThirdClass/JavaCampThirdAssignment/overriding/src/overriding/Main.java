package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] baseCreditManagers = new BaseCreditManager[] {new StudentCreditManager(), new MilitaryCreditManager(), new IndividualCreditManager()};
		
		for (BaseCreditManager baseCreditManager : baseCreditManagers) {
			System.out.println( baseCreditManager.calculation(1000)); 
		}

	}

}
