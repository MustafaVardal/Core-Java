package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseProgrammingManager = new PythonProgrammingManager();
		customerManager.getCustomers();
		customerManager.baseProgrammingManager.getOver();
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.baseProgrammingManager = new JavaProgrammingManager();
		customerManager2.getCustomers();

	}

}
