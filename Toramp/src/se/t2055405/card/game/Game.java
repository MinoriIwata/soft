package se.t2055405.card.game;

import java.util.ArrayList;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;

/**
 * ババ抜きを動かすクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-24
 * @since JDK1.8
 *
 */
public class Game {
	/** ババ抜きアプリ */
	private GameApplication app;

	/** 空のデフォルトコンストラクタ */
	public Game() {

	}

	/**
	 * クラス宣言
	 * 
	 * @param app ババ抜きアプリ
	 */
	public Game(GameApplication app) {
		this.app = app;
	}

	/**
	 * 必要な宣言を纏めて行う
	 * 
	 * @return app ババ抜きアプリクラス
	 */

	public GameApplication set() {
		ArrayList<Player> m = new ArrayList<Player>();
		ArrayList<Player> s = new ArrayList<Player>();
		ArrayList<Card> c = new ArrayList<Card>();
		CardDeck deck = new CardDeck(c);
		int num = 0;
		Winner win = new Winner(s);
		PlayerList ls = new PlayerList(m, num, win);
		GameApplication app = new GameApplication(ls, deck);

		return app;
	}

	/**
	 * ユーザー登録を行う
	 * 
	 * @return user プレイヤーとして参加するユーザー
	 */
	public Player userin() {
		System.out.println("ババ抜きを始めます.ユーザー登録を行います\n名前を教えてください");
		String name = KeyBoard.inputString();
		ArrayList<Card> c = new ArrayList<Card>();
		CardDeck deck = new CardDeck(c);
		Player user = new Player(name, deck);
		return user;
	}

	/**
	 * ババ抜きのメニュー
	 * 
	 * @return t メニュー選択
	 */
	public int menu() {
		System.out.println("1.ババ抜きを開始する　2.システムを終了する");
		int t = KeyBoard.inputNumber();
		return t;
	}

	/**
	 * 何人で遊ぶかを尋ねるクラス
	 * 
	 * @return t 参加者数
	 */

	public int playNumber() {
		System.out.println("今回は何名でゲームを始めますか？(自分自身も含めた数をお答えください)");
		int t = KeyBoard.inputNumber();
		return t;
	}

	/**
	 * ババ抜きを始めるための事前準備をするクラス
	 */
	public void initalize() {
		Player user = userin();
		int i = playNumber();
		app.setPlayers(i);
		app.makePlayers(user);
		System.out.println("参加者テーブルを作成しました");
		System.out.println("ババ抜きのデッキを作成します");
		app.babanukiDeck();
		System.out.println("トランプを配ります.");
		app.distribute();
		System.out.println("同じ数字のカードがあれば捨ててください");
		for (Player s : app.getLs().getPlayers()) {
			s.checkCard();
			s.showCard();
		}
	}

	/**
	 * ババ抜きをするクラス
	 */
	public void babanuki() {

		System.out.println("ババ抜きを始めます,スタートプレイヤーは" + app.getLs().getPlayers().get(0).getName() + "さんです");

		while (app.getLs().getPlayers().size() > 1) {
			int member = app.getLs().getPlayers().size();
			for (int i = 0; i < member; i++) {
				System.out.println("--プレイヤーは" + app.getLs().getPlayers().get(i).getName() + "さんです--");
				app.takeCard(i);

				member = app.getLs().getPlayers().size();
			}
		}
		app.showList();
		app.getLs().clear();

	}

	/**
	 * ババ抜きアプリを取得するクラス
	 * 
	 * @return app ババ抜きアプリ
	 */
	public GameApplication getApp() {
		return app;
	}

	/**
	 * ババ抜きアプリをセットするクラス
	 * 
	 * @param app ババ抜きアプリ
	 */
	public void setApp(GameApplication app) {
		this.app = app;
	}

}
