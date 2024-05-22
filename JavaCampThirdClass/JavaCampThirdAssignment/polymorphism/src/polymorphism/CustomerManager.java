package polymorphism;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	
	public void create() {
		System.out.println("Creative: ");
		this.baseLogger.log("Log Messages");
		/*
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.Log("New logger.");
		 * instead of this we should use constructor up this page.
		 * because program need to be a sustainable.
		 * 
		 */	}
	
	public void add() {
		System.out.println("Item Added:  ");
		this.baseLogger.log("Log Messages");
	}
	
	public void delete() {
		System.out.println("Deletion is working. ");
		this.baseLogger.log("Log Messages");
	}
}
