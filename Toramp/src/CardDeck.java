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
		return null;
		
	}
	
	public Card takeCard(int i)
	{
		return null;
		
	}
	
	public Card seeCard(int i)
	{
		return null;
		
	}
	
	public int searchCard(int suit,int number)
	{
		return number;
		
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
