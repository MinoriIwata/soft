package se.t2055405.card.game;

import java.util.ArrayList;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;

public class Game {
	private GameApplication app;

	public Game() {

	}

	public Game(GameApplication app) {
		this.app = app;
	}

	public Player userin() {
		System.out.println("ババ抜きを始めます.ユーザー登録を行います\n名前を教えてください");
		String name = KeyBoard.inputString();
		ArrayList<Card> c = new ArrayList<Card>();
		CardDeck deck = new CardDeck(c);
		Player user = new Player(name, deck);
		return user;
	}

	public int menu() {
		System.out.println("1.ババ抜きを開始する　2.システムを終了する");
		int t = KeyBoard.inputNumber();
		return t;
	}

	public int playNumber() {
		System.out.println("今回は何名でゲームを始めますか？(自分自身も含めた数をお答えください)");
		int t = KeyBoard.inputNumber();
		return t;
	}

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

	public GameApplication getApp() {
		return app;
	}

	public void setApp(GameApplication app) {
		this.app = app;
	}

}
