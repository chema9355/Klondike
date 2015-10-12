package controller;

import model.Deck;
import model.Stair;
import model.Suit;

public abstract class Controller {
	
	protected Deck deck;
	protected Deck discard;
	protected Stair stair;
	protected Suit suit;
	
	public Controller(Deck deck, Deck discard, Stair stair, Suit suit){
		this.deck = deck;
		this.discard = discard;
		this.stair = stair;
		this.suit = suit;
	}
	
	public Deck getDeck(){
		return deck;
	}
	
	public Deck getDiscard(){
		return discard;
	}
	
	public Stair getStair(){
		return stair;
	}
	
	public Suit getSuit(){
		return suit;
	}

}
