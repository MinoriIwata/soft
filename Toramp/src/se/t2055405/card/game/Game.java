package se.t2055405.card.game;

import se.t2055405.card.entity.Player;

public class Game {
	private GameApplication app;
	
	public Game() {
		
	}
	
	public Game(GameApplication app) {
		this.app=app;
	}
	
	public void initalize(int i ,Player user) {
		app.setPlayers(i);
		app.makePlayers(user);
		System.out.println("ババ抜きのデッキを作成します");
		app.babanukiDeck();
		System.out.println("トランプを配ります.");
		app.distribute();
	}
	
	public void babanuki() {
		
	while(app.getLs().getPlayers().size()>1) {
		
	}
		
	}

	public GameApplication getApp() {
		return app;
	}

	public void setApp(GameApplication app) {
		this.app = app;
	}
	

}
