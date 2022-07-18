package se.t2055405.card.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;

/**
 * トランプゲームのカードデッキクラスのテストクラス
 */
public class CardDeckTest extends TestCase {
    private CardDeck test,test2;
    private ArrayList<Card> cards=new ArrayList<Card>() ;
    private ArrayList<Card> cards2=new ArrayList<Card>() ;
    private Card spadeA, diamond10,joker;
	/**
	 * 各テストメソッドの実行の前処理
	 */
    protected void setUp() throws Exception{
    	test=new CardDeck(cards);
    	test2=new CardDeck(cards2);
    	joker=new Card(-1,0);
    	spadeA = new Card(0, 1); 
		diamond10 = new Card(1, 10); 
    }
	

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		// 後処理は特に無し
	}
	
	public void testCreateFullDeck() {
		test.createFullDeck();
		assertNotNull(test);
		assertEquals(52, test.size());
		
	}
	
	public void testShuffle() {
	 test.createFullDeck();
	 test2.createFullDeck();
	 test.shuffle();
	 assertNotEquals(test,test2);
	}
	
	public void testAddCard() {
		test.createFullDeck();
		test.addCard(joker);
		
		assertEquals(53, test.size());
		
		
	}
	public void testAddCard(int i,Card card) {
		test.createFullDeck();
		test.addCard(0,diamond10);
		test.addCard(4,spadeA);
		assertEquals(54, test.size());
	
	}
	
	public void testTakeCard() {
		test.createFullDeck();
		
		assertEquals(0,test.takeCard().toIndex());
		assertEquals(26,test.takeCard(26).toIndex());
		assertNotNull(test.takeCard());
		assertEquals(49, test.size());
		
	}
	
	
	public void testSeeCard() {
		test.createFullDeck();

		assertEquals(0,test.seeCard(1).toIndex());
		assertEquals(26,test.seeCard(27).toIndex());
		assertEquals(52, test.size());
	}
	public void testSearchCard(int suit,int number) {
		test.createFullDeck();
        int i=test.searchCard(0, 1);
        assertEquals(1,i);
        int t=test.searchCard(-1, 0);
        assertEquals(0,t);
	}
	
	public void testIsEmpty() {
		assertTrue(test.isEmpty());
		test.createFullDeck();
		assertFalse(test.isEmpty());
	}
	
    public void testSize() {
		int size=test.size();
		assertSame(0,size);
		test.createFullDeck();
		size=test.size();
		assertSame(52,size);
	}
		
    public void testShowAllCards() {

		test.showAllCards();
		 System.out.println("------------------------------");
		test.createFullDeck();
		 System.out.println("------------------------------");
		test.showAllCards();
   	}
		
    public void testGetAllCards() {
    	

    	test.createFullDeck();
    	List<Card> card=test.getAllCards();

    	assertNotNull(card);
    	
    	
    }
		
}
