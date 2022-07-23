package se.t2055405.card.entity;

import java.util.ArrayList;

public class Winner {
	private ArrayList<Player> winner;

	public Winner() {

	}

	public Winner(ArrayList<Player> winner) {
		this.setWinner(winner);
	}

	public void addWinner(Player a) {
		winner.add(a);
	}

	public void deleteWinner() {
		winner.clear();
	}

	public void showWinner() {
		int i = 1;
		for (Player target : winner) {
			System.out.println(i + "位:" + target.getName());
			i++;
		}

	}

	public ArrayList<Player> getWinner() {
		return winner;
	}

	public void setWinner(ArrayList<Player> winner) {
		this.winner = winner;
	}

}
