package text.kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {

		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

		String myhand = jyanken.getMyChoice();
		String bothand = jyanken.getRandom();
		jyanken.playGame(myhand, bothand);

	}

}
