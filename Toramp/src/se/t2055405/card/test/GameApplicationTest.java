package se.t2055405.card.test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;
import se.t2055405.card.game.GameApplication;
import se.t2055405.card.game.PlayerList;
import se.t2055405.card.game.Winner;

public class GameApplicationTest extends TestCase {
	private Player a;
	private Card ace;
	private PlayerList ls;
	private GameApplication app;
	ByteArrayOutputStream out = new ByteArrayOutputStream();

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		super.setUp();

		ArrayList<Card> test1 = new ArrayList<Card>();
		ArrayList<Card> test4 = new ArrayList<Card>();
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Player> winner = new ArrayList<Player>();
		CardDeck deck1 = new CardDeck(test1);

		CardDeck deck4 = new CardDeck(test4);
		Winner win = new Winner(winner);

		ace = new Card(0, 1);
		super.setUp();
		a = new Player("test1", deck1);

		ls = new PlayerList(players, 3, win);
		app = new GameApplication(ls, deck4);
	}

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * makePlayers()のテスト
	 */
	public void testMakePlayers() {
		app.makePlayers(a);
		assertEquals(3, app.getLs().getPlayers().size());
	}

	/**
	 * babanukiDeck()のテスト
	 */
	public void testBabanukiDeck() {
		app.babanukiDeck();
		assertEquals(53, app.getDeck().size());
	}

	/**
	 * distribute()のテスト
	 */
	public void testDistribute() {
		app.makePlayers(a);
		app.babanukiDeck();
		app.distribute();
		assertEquals(18, app.getLs().getPlayers().get(0).getDeck().size());
		assertEquals(17, app.getLs().getPlayers().get(2).getDeck().size());
	}

	/**
	 * takeCard()のテスト
	 */
	public void testTakeCard() {
		app.makePlayers(a);
		app.getDeck().addCard(ace);
		app.getDeck().addCard(ace);
		app.getDeck().addCard(ace);
		app.distribute();
		app.takeCard(0);

		assertEquals(1, app.getLs().getPlayers().size());
	}

}
