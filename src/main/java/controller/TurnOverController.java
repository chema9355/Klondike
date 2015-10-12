package controller;

import model.Card;
import model.CardState;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class TurnOverController extends MoveController {

	public TurnOverController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public boolean isPosibleMove(int stair) {
		Card stairCard;
		stairCard = this.getStair().lastCard(stair);
		if (stairCard.getState() == CardState.NOVISIBLE) {
			return true;
		} else {
			return false;
		}
	}

	public void turnOver(int stair) {
		this.getStair().lastCard(stair).changeState();
	}

}
