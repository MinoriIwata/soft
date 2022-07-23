package se.t2055405.card.game;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.Player;
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

	public void makePlayers(Player user) {
		ls.addUser(user);
		ls.addCPU();
		ls.shuffle();
	}

	public void babanukiDeck() {
		deck.createFullDeck();
		Card joker = new Card(-1, 0);
		getDeck().addCard(joker);
		getDeck().shuffle();
	}

	public void distribute() {
		int size = deck.size();
		for (int i = 0; i < size; i++) {
			Player target = ls.getPlayers().get(i % ls.getPlayerNumber());
			ls.addCard(target, deck.takeCard());
		}
	}

	public void takeCard(int hiku) {
		Player take = new Player();
		Player taken = new Player();
		if (hiku != 0) {
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(hiku - 1);

		} else {
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(ls.getPlayerNumber() - 1);

		}
		int t = take.choiseCard(taken.deckSize());
		Card card = ls.takeCard(taken, t);

		take.checkCard(card);
		ls.checkPlayer(hiku);
	}

	// setter getter

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
