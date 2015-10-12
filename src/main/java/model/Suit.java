package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import view.SuitForView;

public class Suit implements SuitForView {

	private Map<Integer, List<Card>> cards;

	public static final int SUITS = 4;

	public Suit() {
		this.cards = new HashMap<>();
		for (int i = 0; i < SUITS; i++) {
			this.cards.put(i, new ArrayList<Card>());
		}
	}

	public Card lastCard(Type type) {
		assert type != null;
		return cards.get(type.ordinal()).get(cards.get(type.ordinal()).size() - 1);
	}

	public Card lastCard(int suit) {
		return cards.get(suit).get(cards.get(suit).size() - 1);
	}

	public boolean finish() {
		int totalCards = 0;
		for (int i = 0; i < SUITS; i++) {
			totalCards += cards.get(i).size();
		}
		return totalCards == Card.TotalCards;
	}

	public void putCard(Card card, Type type) {
		assert card != null;
		assert type != null;
		cards.get(type.ordinal()).add(card);
	}

	public void removeLast(Type type) {
		cards.get(type.ordinal()).remove(cards.get(type.ordinal()).size() - 1);
	}

	public void removeLast(int suit) {
		cards.get(suit).remove(cards.get(suit).size() - 1);
	}

	public boolean isEmpty(Type type) {
		return this.cards.get(type.ordinal()).isEmpty();
	}

	public boolean isEmpty(int suit) {
		return this.cards.get(suit).isEmpty();
	}

	public Map<Integer, List<Card>> getCards() {
		return this.cards;
	}
}
