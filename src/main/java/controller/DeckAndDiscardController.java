package controller;

import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;

public abstract class DeckAndDiscardController extends MoveController {

	public DeckAndDiscardController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}
	
	public boolean deckEmpty(){
		return this.getDeck().isEmpty();
	}
	
}
