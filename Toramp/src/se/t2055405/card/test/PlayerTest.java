package se.t2055405.card.test;

import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.hamcrest.Matcher;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;

public class PlayerTest extends TestCase {

	private Player a, b, c;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Card joker, ace;

	/**
	 * コンストラクタ
	 * 
	 * @param name
	 */
	public PlayerTest(String name) {
		super(name);
	}

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		ArrayList<Card> test2 = new ArrayList<Card>();
		ArrayList<Card> test1 = new ArrayList<Card>();
		ArrayList<Card> test3 = new ArrayList<Card>();
		CardDeck deck1 = new CardDeck(test1);
		CardDeck deck2 = new CardDeck(test2);
		CardDeck deck3 = new CardDeck(test3);
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
	}

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * showCard()のテスト
	 */
	public void testShowCard() {
		b.showCard();
		assretThat(out.toString(), is("ジョーカー" + System.lineSeparator()));
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
	 * addCard()のテスト
	 */
	public void testAddCard() {
		a.addCard(joker);
		assertEquals(2, a.deckSize());
		assertEquals(2, b.deckSize());
	}

	/**
	 * takeCard()のテスト
	 */
	public void testTakeCard() {

		assertEquals(ace, a.takeCard(1));
		assertEquals(ace, b.takeCard(2));

	}

	/**
	 * deckSize()のテスト
	 */
	public void testDeckSize() {
		assertEquals(2, b.deckSize());
		assertEquals(1, a.deckSize());
		assertEquals(52, c.deckSize());

	}

	/**
	 * checkCard()のテスト
	 */
	public void testCheckCard() {
		c.checkCard();

		assertEquals(0, c.deckSize());
	}

	/**
	 * checkCardCard()のテスト
	 */
	public void testCheckCardCard() {
		a.checkCard(ace);
		assertEquals(0, a.deckSize());
	}

}
