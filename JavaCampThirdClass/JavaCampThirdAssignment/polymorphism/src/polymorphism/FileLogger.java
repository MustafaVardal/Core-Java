package polymorphism;

public class FileLogger extends BaseLogger {
 
	@Override
	public void log(String message) {
		System.out.println("Logged to File: " + message);
	}
}
