package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		
		/// Hide the base class :D
		// abstract class never and ever can  be new!
		
		// if you want to update your game with TransGenderPlayers
		BasePlayers[] basePlayers = {new ManPlayers(), new WomanPlayers(), new KidsPlayers(), new TransGenderPlayers()};
		for (BasePlayers basePlayers2 : basePlayers) {
			basePlayers2.getType(basePlayers2);
			basePlayers2.calculate();
			basePlayers2.color();
			basePlayers2.gameOver();
			
		}
		
		
	}

}
