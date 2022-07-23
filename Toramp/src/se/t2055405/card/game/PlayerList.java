package se.t2055405.card.game;

import java.util.ArrayList;
import java.util.Collections;

import se.t2055405.card.entity.CpuPlayer;
import se.t2055405.card.entity.Player;

public class PlayerList {
	private ArrayList<Player> players;
	private int playerNumber;


	
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
	
	

}
