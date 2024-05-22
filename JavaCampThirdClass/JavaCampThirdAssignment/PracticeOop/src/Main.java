
public class Main {

	public static void main(String[] args) {

		/*
		 * Customer customer = new Customer(); customer.setId(1);
		 * customer.setCity("Monaco"); System.out.println(customer.getCity() + " " +
		 * customer.getId()); System.out.println("");
		 * 
		 * BusinessCustomer businessCustomer = new BusinessCustomer();
		 * businessCustomer.setTaxNumber("123456");
		 * businessCustomer.setBusinessName("Software Enviromental");
		 * businessCustomer.setCity("Dublin"); businessCustomer.setId(2);
		 * 
		 * System.out.println(businessCustomer.getBusinessName() + " "+
		 * businessCustomer.getCity() + " "+ businessCustomer.getId() + " "+
		 * businessCustomer.getTaxNumber());
		 * 
		 * System.out.println("");
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * System.out.println("");
		 * 
		 * CustomerManager customerManager1 = new CustomerManager(new
		 * BusinessCustomer()); customerManager1.save(); customerManager1.delete();
		 * 
		 * System.out.println("");
		 * 
		 * Customer c1 = new Customer(); System.out.println("");
		 * 
		 * Customer c2 = new IndividualCustomer(); System.out.println(c2.getClass());
		 * System.out.println("");
		 * 
		 * Customer c3 = new BusinessCustomer(); // This means Customer is declared in
		 * stack and the references number is // Business customer.
		 */
		
		CustomerManager customerManager  = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		// IoC Container. -- > Dependecy injection!
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager2.giveCredit();
		
	}

}
