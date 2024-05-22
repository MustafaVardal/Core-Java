import java.lang.Thread.Builder.OfVirtual;

public abstract class BaseCreditManager implements ICreditManager{
	
	
	// Abstract siniflar bizim icin ortak operasyonlari tutar ama ayni zamanda 
	// tamamlanmamis yani abstract methodlari da tutar.
	
	// Bir sinif veya abstract sinif extends edilebilir. 
	public abstract void calculate();
	
	public void save() {
		System.out.println("Saved.");
	}
}
