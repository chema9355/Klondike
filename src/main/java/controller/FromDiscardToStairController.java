package controller;

import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromDiscardToStairController extends MoveController {

	public FromDiscardToStairController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	public boolean discardEmpty() {
		return this.getDiscard().isEmpty();
	}

	public boolean isPosibleMove(int stair) {
		Card discardCard;
		Card stairCard;
		discardCard = this.getDiscard().getLastCard();
		if (this.getStair().isEmpty(stair) && discardCard.getValue() == 'A') {
			return true;
		}
		stairCard = this.getStair().lastCard(stair);
		if (discardCard.connect(stairCard)) {
			return true;
		}
		return false;
	}

	public void moveFromDiscardToStair(int stair) {
		Card discardCard;
		discardCard = this.getDiscard().getLastCard();
		this.getDiscard().removeCard(discardCard);
		this.getStair().putCard(discardCard, stair);
	}

	public Card getDiscardCard() {
		return this.getDiscard().getLastCard();
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
