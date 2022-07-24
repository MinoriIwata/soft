package se.t2055405.card.test;

import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.hamcrest.Matcher;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;
import se.t2055405.card.game.Winner;

public class WinnerTest extends TestCase {

	private Player a, b, c;
	Winner win;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	protected void setUp() throws Exception {
		super.setUp();
		ArrayList<Player> winner = new ArrayList<Player>();

		ArrayList<Card> test1 = new ArrayList<Card>();
		ArrayList<Card> test2 = new ArrayList<Card>();
		ArrayList<Card> test3 = new ArrayList<Card>();
		CardDeck deck1 = new CardDeck(test1);
		CardDeck deck2 = new CardDeck(test2);
		CardDeck deck3 = new CardDeck(test3);
		win = new Winner(winner);
		a = new Player("test1", deck1);
		b = new Player("test2", deck2);
		c = new Player("test3", deck3);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddWinner() {
		win.addWinner(a);
		assertEquals(1, win.getWinner().size());
		win.addWinner(b);
		win.addWinner(c);
		assertEquals(3, win.getWinner().size());
	}



	public void testShowWinner() {
		win.addWinner(b);
		assretThat(out.toString(),is("1位:test2"+ System.lineSeparator()));
		
	}

	private void assretThat(String string, Matcher<String> matcher) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void testClear() {
		win.addWinner(a);
		win.addWinner(b);
		win.addWinner(c);
		assertEquals(3, win.getWinner().size());
		win.clear();
		assertEquals(0, win.getWinner().size());
	}

}
