package se.t2055405.card.test;

import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.hamcrest.Matcher;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;
import se.t2055405.card.game.PlayerList;
import se.t2055405.card.game.Winner;
/**
 * トランプゲームのプレイヤーリストクラスのテストクラス
 */
public class PlayerListTest extends TestCase {

	private Player a, b, c;
	private Card joker, ace;
	private PlayerList ls, ls2;
	ByteArrayOutputStream out = new ByteArrayOutputStream();

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		super.setUp();
		ArrayList<Card> test2 = new ArrayList<Card>();
		ArrayList<Card> test1 = new ArrayList<Card>();
		ArrayList<Card> test3 = new ArrayList<Card>();
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Player> players2 = new ArrayList<Player>();
		ArrayList<Player> winner = new ArrayList<Player>();
		CardDeck deck1 = new CardDeck(test1);
		CardDeck deck2 = new CardDeck(test2);
		CardDeck deck3 = new CardDeck(test3);
		Winner win = new Winner(winner);
		joker = new Card(-1, 0);
		ace = new Card(0, 1);
		deck2.addCard(joker);
		deck2.addCard(ace);
		deck1.addCard(ace);
		deck3.createFullDeck();
		super.setUp();
		a = new Player("test1", deck1);
		b = new Player("test2", deck2);
		c = new Player("test3", deck3);
		ls = new PlayerList(players, 3, win);
		ls2 = new PlayerList(players2, 3, win);

	}
	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * addUser()のテスト
	 */
	public void testAddUser() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		assertEquals(3, ls.getPlayers().size());

	}

	/**
	 * addCPU()のテスト
	 */
	public void testAddCPU() {
		ls.addCPU();
		assertEquals(2, ls.getPlayers().size());

	}

	/**
	 * shuffle()のテスト
	 */
	public void testShuffle() {
		ls2.addUser(a);
		ls2.addUser(b);
		ls2.addUser(c);
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		ls2.addUser(a);
		ls2.addUser(b);
		ls2.addUser(c);
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);

		ls.shuffle();
		int t = 0;
		for (int i = 0; i < 6; ++i) {
			if (ls.getPlayers().get(i) == ls2.getPlayers().get(i)) {
				t++;
			}
		}

		assertNotSame(6, t);

	}

	/**
	 * addCard()のテスト
	 */
	public void testAddCard() {
		ls.addCard(a, ace);
		ls.addCard(b, ace);
		ls.addCard(b, ace);
		assertSame(2, a.getDeck().size());
		assertSame(4, b.getDeck().size());

	}

	/**
	 * takeCard()のテスト
	 */
	public void testTakeCard() {
		ls.takeCard(a, 1);
		ls.takeCard(b, 2);
		assertSame(0, a.getDeck().size());
		assertSame(1, b.getDeck().size());
	}

	/**
	 * checkPlayer()のテスト
	 */
	public void testCheckPlayer() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		a.getDeck().clear();
		ls.checkPlayer(a);
		assertSame(1, ls.getWinner().getWinner().size());
		assertSame(2, ls.getPlayers().size());
		assertSame(2, ls.getPlayerNumber());
	}

	/**
	 * takePlayer()のテスト
	 */
	public void testTakePlayer() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		Player target = ls.takePlayer(0);
		assertSame(2, ls.getPlayers().size());
		assertSame(a, target);

	}

	/**
	 * deckNumber()のテスト
	 */
	public void testDeckNumber() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		int a1 = ls.deckNumber(0);
		int b1 = ls.deckNumber(1);
		int c1 = ls.deckNumber(2);
		assertSame(a1, 1);
		assertSame(b1, 2);
		assertSame(c1, 52);
	}

	/**
	 * searchPerson()のテスト
	 */
	public void testSearchPerson() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		int a1 = ls.searchPerson(a);
		int b1 = ls.searchPerson(b);
		int c1 = ls.searchPerson(c);
		assertSame(a1, 0);
		assertSame(b1, 1);
		assertSame(c1, 2);
	}

	/**
	 * showPlayer()のテスト
	 */
	public void testShowPlayer() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		ls.showPlayer();
		assretThat(out.toString(), is("test3" + System.lineSeparator()));
	}

	/**
	 * 自動生成されたメソッド
	 * 
	 * @param string
	 * @param matcher
	 */
	private void assretThat(String string, Matcher<String> matcher) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * clear()のテスト
	 */
	public void testClear() {
		ls.addUser(a);
		ls.addUser(b);
		ls.addUser(c);
		ls.clear();
		assertSame(0, ls.getPlayers().size());

	}

}
