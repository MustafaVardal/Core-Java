
public class WorkStrings {

	public static void main(String[] args) {
		String message = "What a beatiful day.";
		System.out.println(message);
		
		System.out.println("Number of Element: " + message.length());
		System.out.println("3. element : " + message.charAt(2));
		System.out.println(message.concat(" Let's go outside!"));
		System.out.println("--------------------");
		System.out.println(message);
		System.out.println("--------------------");
		System.out.println(message.startsWith("W")); // boolean value will return.
		System.out.println(message.endsWith(",")); // boolean value will return.
		char[] characters = new char[5];
		message.getChars(0, 4, characters,0);
		System.out.println(characters);
		System.out.println(message.indexOf('a')); // first a char is coming up on its location.
		System.out.println(message.lastIndexOf('a')); // searching is starting right.

	}

}
