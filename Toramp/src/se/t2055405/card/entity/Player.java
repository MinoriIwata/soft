package se.t2055405.card.entity;

import se.t2055405.card.game.KeyBoard;

public class Player {
	private String name;
	private CardDeck deck;
	
	public Player(){
		
	}
	
	public Player(String name,CardDeck deck) {
		this.name=name;
		this.deck=deck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CardDeck getDeck() {
		return deck;
	}

	public void setDeck(CardDeck deck) {
		this.deck = deck;
	}

	public int choiseTramp() {

		int choise = KeyBoard.inputNumber();
		return choise;

	}

	
	public void showTramp() {

		deck.showAllCards();
	}

	public void checkTramp() {
		int size = deck.size();
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++) {
				Card taget=deck.seeCard(i);
				
			}
		}

	}

	public void checkTramp(Card input) {

		int check = deck.searchCard(input.getNumber());

		if (check >= 0) {

		}

	}

}
