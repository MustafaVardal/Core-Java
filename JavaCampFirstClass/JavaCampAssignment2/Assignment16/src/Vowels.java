
public class Vowels {

	public static void main(String[] args) {

		// We did good job but not perfect. Because if we enter the lowercase letter it
		// will come is not a vowel instead is a vowel.
		// So for that reason use the char array because char is an char arrays.

		/*
		 * char letter = 'E';
		 * 
		 * switch (letter) { case 'A': case 'E': case 'I': case 'O': case 'U':
		 * System.out.println(letter + " is a vowel."); break; default:
		 * System.out.println(letter + " is not a vowel."); break; }
		 */

		String letter = "a";
		String[] letters = { "A", "a", "E", "e", "O", "o", "I", "i", "U", "u" };
		boolean isVowel = false;

		for (String string : letters) {
			if (string.equals(letter)) {
				isVowel = true;
			}
		}

		if (isVowel) {
			System.out.println(letter + " is a vowel.");
		} else {
			System.out.println(letter + " is not a vowel.");
		}

	}

}
