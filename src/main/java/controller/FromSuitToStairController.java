package controller;

import model.Card;
import model.CardState;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromSuitToStairController extends MoveController {

	public FromSuitToStairController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	public boolean isPosibleMove(int suit, int stair) {
		Card suitCard;
		Card stairCard;
		if (this.getSuit().isEmpty(suit)) {
			return false;
		} else {
			stairCard = this.getStair().lastCard(stair);
			suitCard = this.getSuit().lastCard(suit);
			if (suitCard.connect(stairCard) || this.getStair().lastCard(stair).getState() == CardState.NOVISIBLE) {
				return true;
			}
		}
		return false;
	}

	public void moveFromSuitToStair(int suit, int stair) {
		Card suitCard;
		suitCard = this.getSuit().lastCard(suit);
		this.getStair().putCard(suitCard, stair);
		this.getSuit().removeLast(suit);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}
}
