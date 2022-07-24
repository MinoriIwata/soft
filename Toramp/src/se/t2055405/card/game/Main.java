package se.t2055405.card.game;

public class Main {
	
	Game game=new Game();
	
	public static void main(String[] args) {
		
		Main ls=new Main();
		GameApplication g=ls.game.set();
		ls.game=new Game(g);
		
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
