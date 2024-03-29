package controller;

import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class ExitController extends MoveController {

	public ExitController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
