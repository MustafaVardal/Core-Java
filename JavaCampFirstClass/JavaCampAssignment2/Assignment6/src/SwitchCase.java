
public class SwitchCase {

	public static void main(String[] args) {
		
		// Create the student notes panel depends on grade. 
		// Switch case are creating 
		
		char grade = 'F';

		switch (grade) {
		case 'A':

			System.out.println("Excellent, pass the exam.");
			break;
		case 'B':

			System.out.println("Very good, pass the exam.");
			break;
		case 'C':
			System.out.println("Good, pass the exam.");
			break;
		case 'D':
			System.out.println("Not bad, pass the exam.");
			break;
		case 'F':
		case 'G':
			System.out.println("Failed the exam.");
			break;
		default:
			System.out.println("Not acceptable grade. Please try correct format of grade.");

		}
	}

}
