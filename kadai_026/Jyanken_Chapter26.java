package text.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	@SuppressWarnings("resource")
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
		boolean notStarted = true;
		while (notStarted) {
			String hand = scanner.next();

			if (hand.equals("r") || hand.equals("s") || hand.equals("p")) {
				notStarted = false;
				scanner.close();
				return hand;
			} else {
				System.out.println("入力された値が正しくありません");
			}
		}
		return null;
	};

	public String getRandom() {
		String[] hands = { "r", "s", "p" };
		int index = (int) Math.floor(Math.random() * 3);
		return hands[index];
	}

	public void playGame(String myHand, String botHand) {
		HashMap<String, String> handsMap = new HashMap<>();
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		System.out.println("自分の手は " + handsMap.get(myHand) + "、対戦相手の手は" + handsMap.get(botHand));

		if (myHand.equals(botHand)) {
			System.out.println("あいこです");
		} else if ((myHand.equals("r") && botHand.equals("s"))
				|| (myHand.equals("s") && botHand.equals("p"))
				|| (myHand.equals("p") && botHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
