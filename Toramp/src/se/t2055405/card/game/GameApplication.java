package se.t2055405.card.game;

import se.t2055405.card.entity.Card;
import se.t2055405.card.entity.CardDeck;
import se.t2055405.card.entity.CpuPlayer;
import se.t2055405.card.entity.Player;
import se.t2055405.card.entity.PlayerList;


/**
 * ババ抜きゲームの機能を管理するクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
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

		System.out.println("------------------今回の参加者一覧です.--------------------");
		ls.showPlayer();
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
			System.out.println("------------------配布.--------------------");
			
		}
	}

	public void takeCard(int hiku) {
		Player take = new Player();
		Player taken = new Player();
		int hikare;
		if (hiku != 0) {
			hikare=hiku-1;
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(hikare);

		} else {
			hikare=ls.getPlayerNumber() - 1;
			take = ls.getPlayers().get(hiku);
			taken = ls.getPlayers().get(hikare);

		}
		int t = take.choiseCard(taken.deckSize());
		Card card = ls.takeCard(taken, t);
		if(take instanceof CpuPlayer)
		{
			take.getDeck().shuffle();
		}
		else
		{
			
			System.out.println("引いたカードは"+card.toString()+"です");
			System.out.println("-------現在の手札------");
			take.showCard();
			
		}
		
		take.checkCard(card);
		ls.checkPlayer(taken);
		ls.checkPlayer(take);
	}

	
	public void showList() {
		System.out.println("-------今回の勝者------");
		ls.getWinner().showWinner();
		System.out.println("-------今回の敗者------");
		ls.showPlayer();
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
