package se.t2055405.card.test;

import junit.framework.TestCase;
import se.t2055405.card.game.Game;
import se.t2055405.card.game.GameApplication;

public class GameTest extends TestCase {

	private Game game;

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		super.setUp();
		GameApplication app = new GameApplication();
		game = new Game(app);

	}

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * set()のテスト
	 */
	public void testSet() {
		GameApplication app2 = game.set();
		assertNotNull(app2.getDeck());
		assertNotNull(app2.getLs());
	}

}
