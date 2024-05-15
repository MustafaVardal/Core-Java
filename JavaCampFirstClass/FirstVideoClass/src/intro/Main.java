package intro;

public class Main {

	public static void main(String[] args) {
		
		
		/*System.out.println("Hello World! :) ");
		
		int a, b, c;
		String date = "April";
		boolean isThere = false;
		long l = 1321321321;
		float f = 1233.4565f;
		double d = 1215341.564;
		byte w = 15;
		short s = 124;
		char txt = 'c';
		 // Degisken isimleri camelCase yazilir.
		String middleText = "Interesting Opportunity";
		String belowText = "Time Experication: ";
		
		System.out.println(middleText+ "\n" + belowText);
		
		*/
		
		
		int expiryDate = 12;
		
		double dollarYesterday = 18.25;
		double dollarToday = 18.15;
		
		boolean isDDecrement = false;
		
		String arrowDirection = "";
		
		if (dollarToday < dollarYesterday) { // return true!
			arrowDirection = "down.svg";
			System.out.println("Dollar Down:  " + arrowDirection);
		} else if (dollarToday > dollarYesterday) {
			arrowDirection = "up.svg";
			System.out.println("Dollar Up: " + arrowDirection );
		}else if (dollarToday == dollarYesterday) {
			arrowDirection = "dash.svg";
			System.out.println("Dollar not change: " + arrowDirection);
		}else {
			arrowDirection = "404 Not Found";
			System.out.println("Not valid infos");
		}
		
		
		
		//Array!!!!
		
		
		String [] loans = {"Personal Loan", "Take Your Retirement Plan Loan", "Business Loan"}; 
			// We use here regular array to put data but real time job data is coming from database!
		/*
		System.out.println(loans[0]);
		System.out.println(loans[1]);
		System.out.println(loans[2]);
		*/
		// We need dynamic system! ! We should not able to enter all data manually!!!!
		
		
		for (int i = 0; i < loans.length; i++) {
			System.out.println(loans[i]);
		}
		//OR 
		
		//ForEach
		for (String string : loans) {
			System.out.println(string);
		}
		
	}

}
