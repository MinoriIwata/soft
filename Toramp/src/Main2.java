

import se.t2055405.card.game.Game;
import se.t2055405.card.game.GameApplication;

/**
 * ババ抜きメイン
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-24
 * @since JDK1.8
 *
 */
public class Main2 {
	/** ババ抜きゲームクラス */
	Game game = new Game();
/**
 * メインクラス
 * @param args
 */
	public static void main(String[] args) {
		
		Main2 ls = new Main2();
	
		GameApplication g = ls.game.set();
		ls.game = new Game(g);

		System.out.println("ようこそ！ババ抜きシステムへ。メニューを表示します");
		int i = ls.game.menu();

		while (true) {
			if (i == 1) {
				ls.game.initalize();
				ls.game.babanuki();
				System.out.println("新しくゲームを始めますか？");
				i = ls.game.menu();
			} else {
				System.out.println("お疲れさまでした、ゲームを終了します。ﾌﾟｼｭｰ.....");

				return;
			}

		}
	}
}
