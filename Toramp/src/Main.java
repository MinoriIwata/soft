import java.util.ArrayList;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;

public class Main {

	ArrayList<Card> cards=new ArrayList<Card>() ;
	CardDeck deck=new CardDeck(cards);
	public static void main(String[] args) {
     Main ls=new Main();
     ls.deck.createFullDeck();
     System.out.println("== シャッフルします．==");
     ls.deck.shuffle();
     System.out.println("------ 現在の山を表示します．-------");
	 ls.deck.showAllCards();
	 System.out.println("------ 上から何枚か取ります-------");
	 Card take=ls.deck.takeCard();
	 System.out.println(take.toString());
	 for(int i=1;i<4;++i)
	 {
	  take=ls.deck.takeCard(i);
	  System.out.println(take.toString());
	 }
	 int size=ls.deck.size();
	 System.out.println("現在デッキは"+size+"枚です");
	 int t=3;
	 take=ls.deck.seeCard(t);
	 System.out.println("3枚目は"+take.toString());
	 System.out.println("------ 現在の山を表示します．-------");
	 ls.deck.showAllCards();
	 System.out.println("------ 現在の山を表示します．-------");
	 Card diamond10 = new Card(1, 10); 
	 ls.deck.addCard(1, diamond10);
	 ls.deck.addCard(4, diamond10);
	 int search=ls.deck.searchCard(1, 10);
	 System.out.println("--------------"+search+"------");
	 
	 
	 ls.deck.showAllCards();
	 ls.deck.clear();
	 boolean d=ls.deck.isEmpty();
	 if(d==true)
	 {
		 System.out.println("消せたよ！");
	 }
	 ls.deck.showAllCards();
	}
	
}
