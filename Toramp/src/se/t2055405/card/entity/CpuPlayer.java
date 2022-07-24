package se.t2055405.card.entity;

import java.util.Random;

public class CpuPlayer extends Player {

	public CpuPlayer() {
		super();
	}

	public CpuPlayer(String name, CardDeck deck) {
		super(name, deck);
	}

	@Override
	public int choiseCard(int size) {
		Random rnd = new Random();
		int t = rnd.nextInt(size)+1;

		return t;

	}

}
