package javaProject.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged in Database: " + data);
		
	}

}
