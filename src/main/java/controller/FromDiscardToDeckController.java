package controller;

import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromDiscardToDeckController extends DeckAndDiscardController {

	public FromDiscardToDeckController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	public Card getCardFromDiscard() {
		return this.getDiscard().getLastCard();
	}

	public void moveFromDiscardToDeck() {
		Card discardCard;
		discardCard = this.getDiscard().getLastCard();
		this.getDiscard().removeCard(discardCard);
		this.getDeck().put(discardCard);
		discardCard.changeState();
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
