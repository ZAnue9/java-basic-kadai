package text.kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {

		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		Scanner scanner = new Scanner(System.in);
		String myHand = game.getMyChoice();
		String botHand = game.getRandom();
		game.playGame(myHand, botHand);
		scanner.close();

	}

}
