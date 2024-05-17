package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		// All algorithms and programs should be resistant in the future. 
		/*
		 * AgriculturalCreditManager agriculturalCreditManager = new
		 * AgriculturalCreditManager(); InstructorCreditManager instructorCreditManager
		 * = new InstructorCreditManager(); agriculturalCreditManager.Calculate();
		 * instructorCreditManager.Calculate();
		 */
		
		CreditUI creditUI = new CreditUI();
		creditUI.CreditCalculate(new InstructorCreditManager()); // this is polymorphism.
		
		// We will see spaghetti code, if you use if clause everywhere in class.
	}

}
