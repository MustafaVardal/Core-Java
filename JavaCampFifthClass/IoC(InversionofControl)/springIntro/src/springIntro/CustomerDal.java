package springIntro;

public class CustomerDal implements ICustomerDal {

	String connectionString; // Degiskenlik gosterir cunku herbir database systemlerinin connection yapisi
								// farklidir.
	// Dolayisiyla bu dosya oracle ama mysql ile calismamiz gerekicek.
	public String getConnectionString() {
		return connectionString;
	}



	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	

	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Oracle kodlari burada olucak.");
	}



	
}
