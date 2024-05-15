
public class WorkStrings2 {
	public static void main(String[] args) {

		String message = "   A page is starting with Java word.    ";

		System.out.println(message);
		String newMessage = message.replace('p', 'c');
		System.out.println(newMessage);
		System.out.println(message.substring(2));
		System.out.println(message.substring(0, 10));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}
}
