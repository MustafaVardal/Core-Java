package abstractClasses;

public abstract class BasePlayers {
	public abstract void color();
	
	public void calculate() {
		System.out.println("Your point: 100");
	}
	
	public final void gameOver() {
		System.out.println("Game Over.");
	}
	
	public final void getType(BasePlayers basePlayers) {
		System.out.println(basePlayers.getClass());
	}
	
	
}