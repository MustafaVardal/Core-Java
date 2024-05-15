
public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		int i = 0;
		do { // First do works. if the condition is not suitable for the code, still it will work 1 time.
			System.out.println(i);
			i+=2;
		} while (i < 10);
		System.out.println("Do While Loop is over.");
	}

}
