package controller;

import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public abstract class MoveController extends Controller {

	public static final int MoveControllers = 9;

	public MoveController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	public boolean isGameFinish() {
		return this.suit.finish();
	}

	public abstract void recibir(GameView gameView);

}
