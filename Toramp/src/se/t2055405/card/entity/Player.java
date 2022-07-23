package se.t2055405.card.entity;

import se.t2055405.card.game.KeyBoard;

public class Player {
	private String name;
	private CardDeck deck;

	public Player() {

	}

	public Player(String name, CardDeck deck) {
		this.name = name;
		this.deck = deck;
	}

	public int choiseCard(int size) {
		System.out.println("何番目のカードを引きますか？相手は" + size + "枚持っています");
		int choise = KeyBoard.inputNumber();
		return choise;

	}

	public void showCard() {

		deck.showAllCards();
	}

	public int checkNumber() {
		int num = deck.size();
		return num;
	}

	public void addCard(Card add) {
		deck.addCard(add);
	}

	public Card takeCard(int i) {
		Card target = deck.takeCard(i);
		return target;
	}

	public int deckSize() {
		int size = deck.size();
		return size;
	}

	
	
	public void checkCard() {
		int size = deck.size();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int check = deck.searchCard(deck.seeCard(i).getNumber());
				if (check >= 0) {
					deck.takeCard(check);
					deck.takeCard(i);
					size = deck.size();
					i--;
					break;

				}
			}

		}
	}

	public void checkCard(Card input) {

		int check = deck.searchCard(input.getNumber());

		if (check >= 0) {
			System.out.println("一致するカードがありました！");
			deck.takeCard(check);
		} else {
			deck.addCard(input);
		}

	}
	
	
    //setter getter
    
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
}
