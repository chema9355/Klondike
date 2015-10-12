package controller;


import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromDeckToDiscardController extends DeckAndDiscardController{

	public FromDeckToDiscardController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}
	
	public Card getCardFromDeck(){
		return this.getDeck().getLastCard();
	}
	
	public void moveFromDeckToDiscard(){
		Card deckCard;
		deckCard = this.getDeck().getLastCard();
		this.getDeck().removeCard(deckCard);
		this.getDiscard().put(deckCard);
		deckCard.changeState();
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
