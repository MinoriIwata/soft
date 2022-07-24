package se.t2055405.card.entity;

import java.util.ArrayList;

import junit.framework.TestCase;

public class CpuPlayerTest extends TestCase {

	private CpuPlayer a;
	public CpuPlayerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		ArrayList <Card> test1=new ArrayList<Card>();
		CardDeck deck1=new CardDeck(test1);
		a=new CpuPlayer("test1",deck1);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testChoiseCard() {
	   
	   assertEquals(1, a.choiseCard(1));
	   
	}

}
