package se.t2055405.card.entity;

import java.util.Random;
/**
 * CPUの参加者を表すプレイヤー拡張クラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
public class CpuPlayer extends Player {
   
	/**空のデフォルトコンストラクタ*/
	public CpuPlayer() {
		super();
	}

	/**
	 * デフォルトコンストラクタ
	 * 
	 * @param name
	 *        　名前
	 * @param deck
	 *         カードデッキ
	 * 
	 * */
	public CpuPlayer(String name, CardDeck deck) {
		super(name, deck);
	}

	@Override
	/**
	 * カードをランダム選択する
	 * @param size
	 *         相手のカード枚数
	 */
	public int choiseCard(int size) {
		Random rnd = new Random();
		int t = rnd.nextInt(size)+1;

		return t;

	}

}
