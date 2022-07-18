package se.t2055405.card.entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * トランプのカードデッキを表すクラス.
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
public class CardDeck {

	/** カードデッキ */
	private ArrayList<Card> cards;

	/**
	 * デフォルトコンストラクタ。空のカードデッキインスタンスを生成する。
	 */
	public CardDeck() {
	}

	/**
	 * リストを指定してカードデッキインスタンスを生成する.
	 * 
	 * @param cards カードデッキリスト
	 */
	public CardDeck(ArrayList<Card> cards) {
		this.cards = cards;
	}

	/** フルデッキ(52枚)を生成する */
	public void createFullDeck() {

		System.out.println("フルデッキを生成します.");
		Card newcard ;
		
		for (int i = 0; i < 4; ++i) {
			for (int j = 1; j < 14; ++j) {
				 newcard = new Card(i, j);
				cards.add(newcard);
			}
		}
	}

	/** 自身のデッキを削除する */
	public void clear() {
		cards.clear();
	}

	/** 自身のデッキをシャッフルする */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	/**
	 * デッキの最後尾にカードを追加する.
	 * 
	 * @param card 追加するカード
	 */
	public void addCard(Card card) {
		cards.add(card);
	}

	/**
	 * デッキのi番目にカードを追加する.
	 * 
	 * @param i    番目
	 * @param card 追加するカード
	 */
	public void addCard(int i, Card card) {
		cards.add(i-1, card);
	}

	/**
	 * デッキの1番目にあるカードを引く.
	 *
	 * @return take 1番目にあるカード
	 */
	public Card takeCard() {
		Card take = cards.get(0);
		cards.remove(0);
		return take;

	}

	/**
	 * デッキのi番目にあるカードを引く.
	 * 
	 * @param i 番目
	 * @return take i番目にあるカード
	 */
	public Card takeCard(int i) {
		Card take = cards.get(i - 1);
		cards.remove(i - 1);
		return take;

	}

	/**
	 * デッキのi番目にあるカードを見ることが出来る.
	 * 
	 * @param i 番目
	 * @return take i番目にあるカード
	 */
	public Card seeCard(int i) {
		Card take = cards.get(i - 1);
		return take;

	}

	/**
	 * 絵柄と番号を与えて、そのカードがデッキの何番目にあるかを調べる。デッキにそのカードが無ければ0を返す.
	 * 
	 * @param suit   絵柄
	 * @param number 番号
	 * @return search カードがある場所
	 */
	public int searchCard(int suit, int number) {
		Card target = new Card(suit, number);
		int search = cards.indexOf(target);
		if (search >= 0) {
			return search + 1;
		} else {
			return 0;
		}

	}

	/**
	 * 現在のデッキが空かどうか判定する.
	 * 
	 * @return boolean 空かどうか
	 */
	public boolean isEmpty() {
		if (cards.isEmpty() == true) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 現在のデッキのカード枚数を返す
	 * 
	 * @return size デッキのカード枚数
	 */
	public int size() {
		int size = cards.size();
		return size;

	}

	/** 現在の全てのカードを画面に表示する. */
	public void showAllCards() {
		for (Card target : cards) {
			System.out.println(target.toString());
		}

	}

	/**
	 * 現在デッキにある全てのカードを返す.
	 * 
	 * @return cards カードのリスト
	 */
	public List<Card> getAllCards() {
		return cards;

	}

}
