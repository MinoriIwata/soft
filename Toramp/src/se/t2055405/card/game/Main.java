package se.t2055405.card.game;

import java.util.ArrayList;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;
import se.t2055405.card.entity.PlayerList;
import se.t2055405.card.entity.Winner;

public class Main {
	ArrayList<Player> m=new ArrayList<Player>();
	ArrayList<Player> s=new ArrayList<Player>();
	ArrayList<Card> c=new ArrayList<Card>();
	CardDeck deck=new CardDeck(c);
	int num;
	Winner win=new Winner(s);
	PlayerList ls=new PlayerList(m,num,win);
	GameApplication app=new GameApplication(ls,deck);
	Game game=new Game(app);
	
	public static void main(String[] args) {
		
		Main ls=new Main();
		
		System.out.println("ようこそ！ババ抜きシステムへ。メニューを表示します");
		int i=ls.game.menu();
		
		while(true) {
		if(i==1)
		{
			ls.game.initalize();
			ls.game.babanuki();
			System.out.println("新しくゲームを始めますか？");
			i=ls.game.menu();
		}
		else {
			System.out.println("お疲れさまでした、ゲームを終了します。ﾌﾟｼｭｰ.....");
			
			return;
		}
		
		}
	}
}
