
public class recapDemo1 {

	public static void main(String[] args) {
		// Find the most popular website !
		int visitorCount = 500;
		int visitorCount1 = 600;
		int visitorCount2 = 300;
		int biggestNumber = visitorCount;

		if (biggestNumber < visitorCount1) {
			biggestNumber = visitorCount1;
		}

		if (biggestNumber < visitorCount2) {
			biggestNumber = visitorCount2;
		}

		System.out.println("Biggest Number: " + biggestNumber);

	}

}
