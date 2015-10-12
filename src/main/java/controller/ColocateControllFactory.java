package controller;

import model.Deck;
import model.Stair;
import model.Suit;

public class ColocateControllFactory {
	
	private Deck deck;

	private Deck discard;
	
	private Stair stair;
	
	private Suit suit;
	
	private MoveController[] moveControllers;
	
	public ColocateControllFactory(Deck deck, Deck discard, Stair stair, Suit suit) {
		assert deck != null;
		assert discard != null;
		assert stair != null;
		assert suit != null;
		this.deck = deck;
		this.discard = discard;
		this.stair = stair;
		this.suit = suit;
		this.moveControllers = new MoveController[MoveController.MoveControllers];
	}
	
	public void setControllers(){
		this.moveControllers[0] = new FromDeckToDiscardController(deck, discard, stair, suit);
		this.moveControllers[1] = new FromDiscardToDeckController(deck, discard, stair, suit);
		this.moveControllers[2] = new FromDiscardToSuitController(deck, discard, stair, suit);
		this.moveControllers[3] = new FromDiscardToStairController(deck, discard, stair, suit);
		this.moveControllers[4] = new FromDiscardToSuitController(deck, discard, stair, suit);
		this.moveControllers[5] = new FromStairToStairController(deck, discard, stair, suit);
		this.moveControllers[6] = new FromSuitToStairController(deck, discard, stair, suit);
		this.moveControllers[7] = new TurnOverController(deck, discard, stair, suit);
		this.moveControllers[8] = new ExitController(deck, discard, stair, suit);
		
	}
	
	public MoveController getController(int option) {
		if (suit.finish()){
			return null;
		}		
		return moveControllers[option-1];
	}
	
	

}
