package se.t2055405.card.entity;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerList {
	private ArrayList<Player> players;
	private int playerNumber;
	
	public PlayerList() {
		
	}
	
	public PlayerList(ArrayList<Player> players,int num) {
		this.players=players;
		this.playerNumber=num;
	}


	
	public void addUser(Player user) {
		players.add(user);
	}
	
	public void addCPU() {
		for(int i=0;i<playerNumber-1;i++) {
			String name="CPU"+i;
			CpuPlayer a=new CpuPlayer(name);
			players.add(a);
		}
	}
	
	public void shuffle() {
		Collections.shuffle(players);
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public void addCard(int i,Card add) {
		players.get(i).addCard(add);
		
	}
	
	public Card takeCard(int i,int t) {
		Card take=players.get(i).takeCard(t);
		
	   return take;
	}
	
	public Player takePlayer(int i) {
		Player target=players.get(i);
		players.remove(target);
		return target;
		
	}
	
	public int deckNumber(int i)
	{
		int t=players.get(i).getDeck().size();
		return t;
	}

}
