/**
 * トランプのカードの機能を表すクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
public class Card {
	/** スート */
	private int suit;
	/** 番号 */
	private int number;

	/**
	 * デフォルトコンストラクタ。空のカードインスタンスを生成する。
	 */
	public Card() {

	}

	/**
	 * スート、番号を指定してカードインスタンスを生成する.
	 * 
	 * @param suit   スート
	 * @param number 番号
	 */
	public Card(int suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	/**スートを取得する */
	public int getSuit() {
		return suit;
	}
	/**数字を取得する */
	public int getNumber() {
		return number;
	}

	/**
	 * カード情報を整数表現に変換する.
	 * スペード→ダイヤ→ハート→クラブの1~13を、この順番で0から51までの通し番号をつける.
	 * ジョーカーは-1である.
	 */
	public int tolndex() {
		int t = (this.suit * 13) + this.number - 1;
		if (t < 0) {
			return -1;
		} else {
			return t;
		}
	}
	
	/**カード情報を画面に出力する.*/
	public void show() {

		String carddata = this.toString();

		System.out.println(carddata);
	}

	/**
	 * 与えられた絵柄と数字を基に、対応するカードの整数表現を返す
	 * 
	 * @param suit   スート
	 * @param number 番号
	 */
	public static int getIndex(int suit, int number) {
		int t = (suit * 13) + number - 1;
		if (t < 0) {
			return -1;
		} else {
			return t;
		}

	}
	
	/**
	 * 与えられた絵柄と数字を基に、対応するカードの文字列表現を返す
	 * 
	 * @param suit   スート
	 * @param number 番号
	 */
	public static String getString(int suit, int number) {
		String su, num;

		switch (suit) {
		case 0:
			su = "スペード";
			break;
		case 1:
			su = "ダイヤ";
            break;
		case 2:
			su = "ハート";
            break;
		case 3:
			su = "クラブ";
            break;
		default:
			su = "スート判別不可";
			break;
		}

		switch (number) {
		case 1:
			num = "A";
			break;
		case 11:
			num = "J";
			break;
		case 12:
			num = "Q";
			break;
		case 13:
			num = "K";
			break;
		default:
			num = Integer.toString(number);
			break;
		}

		if (suit == 0 && number == -1) {
			return "ジョーカー";
		}
		return su + num;

	}

	/**カード情報を文字列表現に変換する.*/
	@Override
	public String toString() {
		return getString(suit,number); 
	}
}
