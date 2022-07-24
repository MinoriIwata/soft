package se.t2055405.card.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.CpuPlayer;
/**
 * トランプゲームのCPUプレイヤークラスのテストクラス
 */
public class CpuPlayerTest extends TestCase {

	private CpuPlayer a;
	/**
	 * コンストラクタ
	 * @param name
	 *         名前
	 */
	public CpuPlayerTest(String name) {
		super(name);
	}
	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		super.setUp();
		ArrayList<Card> test1 = new ArrayList<Card>();
		CardDeck deck1 = new CardDeck(test1);
		a = new CpuPlayer("test1", deck1);
	}
	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * choiseCard()のテスト
	 */
	public void testChoiseCard() {

		assertEquals(1, a.choiseCard(1));

	}

}
