package se.t2055405.card.entity;

import se.t2055405.card.game.KeyBoard;

/**
 * ゲームプレイヤーを表すクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
public class Player {
	/** 名前 */
	private String name;
	/** デッキ */
	private CardDeck deck;

	/** 空のデフォルトコンストラクタ */
	public Player() {

	}

	/**
	 * 引数を用いて宣言する
	 * 
	 * @param name 名前
	 * @param deck カードデッキ
	 */
	public Player(String name, CardDeck deck) {
		this.name = name;
		this.deck = deck;
	}

	/**
	 * カードを選ぶクラス
	 * 
	 * @param size 相手が持っているカードの枚数
	 * @return choise 選ぶカードの番号
	 */
	public int choiseCard(int size) {
		System.out.println("何番目のカードを引きますか？相手は" + size + "枚持っています");
		int choise = KeyBoard.inputNumber();
		while(choise>size)
		{
			System.out.println("そんなにカードはないよ!" );
			System.out.println("何番目のカードを引きますか？相手は" + size + "枚持っています");
			choise = KeyBoard.inputNumber();
		}
		return choise;

	}

	/**
	 * 手持ちのカードを全部表示する
	 */
	public void showCard() {

		deck.showAllCards();
	}

	/**
	 * カードを追加する
	 * 
	 * @param add 追加するカード
	 */
	public void addCard(Card add) {
		deck.addCard(add);
	}

	/**
	 * カードを撮る
	 * 
	 * @param i 取るカードの番号
	 * @return target 取ったカード
	 */
	public Card takeCard(int i) {
		Card target = deck.takeCard(i);
		return target;
	}

	/**
	 * 手持ちのカードの枚数を数える
	 * 
	 * @return size カードの枚数
	 */
	public int deckSize() {
		int size = deck.size();
		return size;
	}

	/**
	 * 手持ちの中に同じ数字のカードがないか確認し、あれば2枚とも捨てる
	 * 
	 */

	public void checkCard() {
		int size = deck.size();

		for (int i = 0; i < size; i++) {
			int check = deck.searchCard(deck.seeCard(i + 1).getNumber());
			if (check >= 0 && check != i) {
				deck.takeCard(check + 1);
				deck.takeCard(i);
				size = deck.size();
				deck.showAllCards();
				System.out.println("----------------------------");
				i = i - 1;

			}

		}
	}

	/**
	 * 手持ちの中に対象のカードと同じ数字のカードがないか確認し、あれば2枚ともすて、無ければ対象カードを手持ちに加える
	 * 
	 * @param input 対象のカード
	 */
	public void checkCard(Card input) {

		int check = deck.searchCard(input.getNumber());

		if (check >= 0) {
			System.out.println("一致するカードがありました！");
			deck.takeCard(check + 1);
		} else {
			deck.addCard(input);
		}

	}

	// setter getter
	/**
	 * 名前を取得する
	 * 
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前をセットする
	 * 
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * カードデッキを取得する
	 *
	 * @return deck カードデッキ
	 */
	public CardDeck getDeck() {
		return deck;
	}

	/**
	 * カードデッキをセットする
	 * 
	 * @param deck カードデッキ
	 */
	public void setDeck(CardDeck deck) {
		this.deck = deck;
	}
}
