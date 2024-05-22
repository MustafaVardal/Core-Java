package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * EmailLogger emailLogger = new EmailLogger(); 
		 * emailLogger.Log("OOP");
		 * 
		 * Output: 
		 * Logged to email: OOP
		 */
		
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(), new ConsoleLogger()}; // Plug and play! // Injection!
		 * for (BaseLogger baseLogger : loggers) { baseLogger.Log("Log Message"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.create();
		customerManager.delete();
		customerManager.add();
		
		
		
	}

}
