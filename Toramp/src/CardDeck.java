import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	private  ArrayList<Card> cards;
	
	public CardDeck() {
	}
	
	public void createFullDeck() {
		
		System.out.println("フルデッキを生成します.");
		Card newcard;
		for(int i=0;i<4;++i)
		{
			for(int j=0;j<13;++j)
			{
			 newcard=new Card(i,j);
			 cards.add(newcard);
			}
		}
	}
	
	public void clear() {
		cards.clear();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void addCard(Card card)
	{
		cards.add(card);
	}
	

	public void addCard(int i,Card card)
	{
		cards.add(i-1,card);
	}
	
	public Card takeCard() {
		Card take=cards.get(0);
		cards.remove(0);
		return take;
		
	}
	
	public Card takeCard(int i)
	{
		Card take=cards.get(i-1);
		cards.remove(i-1);
		return take;
		
	}
	
	public Card seeCard(int i)
	{
		Card take=cards.get(i-1);
		return take;
		
	}
	
	public int searchCard(int suit,int number)
	{
		Card target=new Card(suit,number);
		int search=cards.indexOf(target);
		if(search>=0)
		{
			return search+1;
		}
		else
		{
			return 0;
		}
		
	}
	
	/**現在のデッキが空かどうか判定する.*/
	public boolean isEmpty()
	{
		if(cards.isEmpty()==true)
		{
		return true;
		}
		else
		{
		return false;
		}
		
	}
	
	/**現在のデッキのカード枚数を返す.*/
	public int size()
	{
		int size=cards.size();
		return size;
		
	}
	
	public void showAllCards()
	{
		
	}
	
	public List<Card> getAllCards()
	{
		return cards;
		
	}
	
}
