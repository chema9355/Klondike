package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import view.StairForView;

public class Stair implements StairForView {

	private Map<Integer, List<Card>> cards;

	public static final int STAIRS = 7;

	public Stair() {
		this.cards = new HashMap<>();
		for (int i = 0; i < STAIRS; i++) {
			this.cards.put(i, new ArrayList<Card>(i));
		}
	}

	public Card lastCard(int stair) {
		return cards.get(stair).get(cards.get(stair).size() - 1);
	}

	public void putCard(Card card, int stair) {
		assert card != null;
		cards.get(stair).add(card);
	}

	public Map<Integer, List<Card>> getCards() {
		return this.cards;
	}

	public boolean isEmpty(int stair) {
		return this.cards.get(stair).isEmpty();
	}

}
