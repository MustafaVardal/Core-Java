package springIntro;

//IOC MANTIGI ACIKLANIYOR.

// import edilicek ClassPathXmlApplicationContext
public class Main {

	public static void main(String[] args) {
		
		
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
							
		// CustomerManager customerManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		// 																				// alt yapisiyla yapicak.
		// customerManager.add();
		// Buradaki mantik newlenme yontemini gostermek yani aslindan new CustomerManager da dogru degil.
		
		
		// ICustomerServices customerService = context.getBean("service", ICustomerService.class) 
		// customerService.add();
		// Constructor in da parametre oldugu icin newleyemez. application context e git.
		
		
		//CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); // Referans kismini komple spring
																						// yapicak ve newlememiz
																						// gerekmiyicek. Spring'in IOC
																						// alt yapisiyla yapicak.
		//customerManager.add();
	}

}
