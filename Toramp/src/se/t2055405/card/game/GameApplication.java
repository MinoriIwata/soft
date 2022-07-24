package se.t2055405.card.game;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.CpuPlayer;
import se.t2055405.card.entity.Player;

/**
 * ババ抜きゲームの機能を管理するクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-24
 * @since JDK1.8
 *
 */
public class GameApplication {
	/** 参加者リスト */
	private PlayerList ls;
	/** カードデッキ */
	private CardDeck deck;

	/** 空のデフォルトコンストラクタ */
	public GameApplication() {

	}

	/**
	 * コンストラクタ
	 * 
	 * @param ls   参加者リスト
	 * @param deck カードデッキ
	 */
	public GameApplication(PlayerList ls, CardDeck deck) {
		this.ls = ls;
		this.deck = deck;
	}

	/**
	 * 参加者数をセットする
	 * 
	 * @param num 参加者数
	 */
	public void setPlayers(int num) {
		ls.setPlayerNumber(num);
	}

	/**
	 * 卓を作る
	 * 
	 * @param user 参加するユーザー
	 */
	public void makePlayers(Player user) {
		ls.addUser(user);
		ls.addCPU();
		ls.shuffle();

		System.out.println("------------------今回の参加者一覧です.--------------------");
		ls.showPlayer();
	}

	/**
	 * ババ抜き用の山札を作る
	 */
	public void babanukiDeck() {
		deck.createFullDeck();
		Card joker = new Card(-1, 0);
		getDeck().addCard(joker);
		getDeck().shuffle();
	}

	/**
	 * 山札からカードを分配する
	 */
	public void distribute() {
		int size = deck.size();
		System.out.println("------------------配布.--------------------");
		for (int i = 0; i < size; i++) {
			Player target = ls.getPlayers().get(i % ls.getPlayerNumber());
			ls.addCard(target, deck.takeCard());
			

		}
	}

	/**
	 * カードを引いて、それが手持ちにあるかどうか判定する.手持ちが0になった場合勝者リストへ移動する
	 * 
	 * @param hiku 引き手の番号
	 */
	public void takeCard(int hiku) {
		Player take = new Player();
		Player taken = new Player();
		int hikare;
		if (hiku != 0) {
			hikare = hiku - 1;
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(hikare);

		} else {
			hikare = ls.getPlayerNumber() - 1;
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(hikare);

		}
		int t = take.choiseCard(taken.deckSize());
		Card card = ls.takeCard(taken, t);
		if (take instanceof CpuPlayer) {
			take.getDeck().shuffle();
			
		} else {

			System.out.println("引いたカードは" + card.toString() + "です");
			System.out.println("-------現在の手札------");
			take.showCard();

		}

		take.checkCard(card);
		ls.checkPlayer(taken);
		ls.checkPlayer(take);
		

	}

	/**
	 * 勝敗を表示する
	 */
	public void showList() {
		System.out.println("-------今回の勝者------");
		ls.getWinner().showWinner();
		System.out.println("-------今回の敗者------");
		ls.showPlayer();
	}

	// setter getter
	/**
	 * 参加者リストを取得する
	 * 
	 * @return ls 参加者リスト
	 */
	public PlayerList getLs() {
		return ls;
	}

	/**
	 * 参加者リストをセットする
	 * 
	 * @param ls 参加者リスト
	 */
	public void setLs(PlayerList ls) {
		this.ls = ls;
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
