
public class Card {
	private int suit;
	private int number;
	 
	 public Card (int suit, int number) {
		 
	 }

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	 
	public int tolndex() {
		return number;
		
	}
	
	public void show() {
		
	}
	
	public static int getIndex(int suit,int number)
	{
		return number;
		
	}
	
	
	public static String getString(int suit,int number)
	{
		return null;
		
	}
	

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", number=" + number + "]";
	}
	
 
	
	 
	 

}
