package overriding;

public class BaseCreditManager {
	public double calculation(double cost) {
		return cost *1.18; // Use the interest calculation here.  
	}
	
	public final String getName(String name) { // You should not be able to overridable :)
		return name + "" + name;
	}
}
