
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
		case 1:
			su = "ダイヤ";

		case 2:
			su = "ハート";

		case 3:
			su = "クラブ";

		default:
			su = "スート判別不可";
		}

		switch (number) {
		case 1:
			num = "A";
		case 11:
			num = "J";
		case 12:
			num = "Q";
		case 13:
			num = "K";
		default:
			num = Integer.toString(number);
		}

		if (suit == 0 && number == -1) {
			return "ジョーカー";
		}
		return su + num;

	}

	/**カード情報を文字列表現に変換する.*/
	@Override
	public String toString() {
		String su, num;

		switch (suit) {
		case 0:
			su = "スペード";
		case 1:
			su = "ダイヤ";

		case 2:
			su = "ハート";

		case 3:
			su = "クラブ";

		default:
			su = "スート判別不可";
		}

		switch (number) {
		case 1:
			num = "A";
		case 11:
			num = "J";
		case 12:
			num = "Q";
		case 13:
			num = "K";
		default:
			num = Integer.toString(number);
		}

		if (suit == 0 && number == -1) {
			return "ジョーカー";
		}
		return su + num;
	}

}
