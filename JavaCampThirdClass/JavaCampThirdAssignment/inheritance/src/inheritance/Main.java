package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		
		Person person  = new Customer();
		Person person2 = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.getBestEmployee();
		customerManager.add();
	}

}
