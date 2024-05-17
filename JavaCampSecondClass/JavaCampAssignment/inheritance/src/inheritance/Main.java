package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer();
		Employee e = new Employee();
		
		CustomerManager cm = new CustomerManager();
		EmployeeManager em = new EmployeeManager();
		
		// it did not include encapsulation!
		cm.add();
		em.add();
		cm.list();
		em.list();
		

	}

}
