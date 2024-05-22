package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * RetirementPlanManager retirementPlanManager = new RetirementPlanManager();
		 * retirementPlanManager.getPromotion();
		 */
		
		PlanUI planUI = new PlanUI();
		planUI.planGetPromotion(new RetirementPlanManager());
		planUI.planB(new BusinessPlanManager());
		planUI.planGetPromotion(new HouseHoldPlanManager());
		planUI.planC(new HouseHoldPlanManager());
		
		
		

	}

}