import java.io.IOException;
class Game {
	private static Board b = new Board();
	private static Player [] p = new Player[2];
	private static Game game;
	public Game() {
		while (true) {
			p[0] = new Player1();
			p[1] = new Player2();
		}
	}
	public static void main(String args[]) {
		b.show();
		try {
			game = new Game();
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}
}