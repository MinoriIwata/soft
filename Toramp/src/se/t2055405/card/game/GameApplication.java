package se.t2055405.card.game;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.PlayerList;

public class GameApplication {

	private PlayerList ls;
	private CardDeck deck;

	public GameApplication() {

	}

	public GameApplication(PlayerList ls, CardDeck deck) {
		this.ls = ls;
		this.deck = deck;
	}

	
	public void setPlayers(int num) {
		ls.setPlayerNumber(num);
	}
	
	
	public void distribute() {
		int size = deck.size();
		for (int i = 0; i < size; i++) {
          ls.addCard(i%ls.getPlayerNumber(), deck.takeCard());
		}
	}

	public Card takeCard(int target,int t) {
		Card take=ls.takeCard(target, t);
        return take;
	}
	


	public PlayerList getLs() {
		return ls;
	}

	public void setLs(PlayerList ls) {
		this.ls = ls;
	}

	public CardDeck getDeck() {
		return deck;
	}

	public void setDeck(CardDeck deck) {
		this.deck = deck;
	}

}
