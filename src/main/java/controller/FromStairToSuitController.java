package controller;

import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromStairToSuitController extends MoveController{

	public FromStairToSuitController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public boolean isEmptyStair(int stair) {
		return this.getStair().isEmpty(stair);
	}

	public boolean isPosibleMove(int stair) {
		Card cardStair;
		Card cardSuit;
		cardStair = this.getStair().lastCard(stair);
		if(this.getStair().isEmpty(stair))
		{
			return false;
		}
		else if (this.getSuit().isEmpty(cardStair.getType()) && this.getStair().lastCard(stair).getValue() == 'A')
		{
			return true;
		}
		else
		{
			cardSuit = this.getSuit().lastCard(cardStair.getType());
			if(cardSuit.connect(cardStair))
			{
				return true;
			}
		}
		return false;
	}

	public void moveFromStairToSuit(int stair) {
		Card cardStair;
		cardStair = this.getStair().lastCard(stair);
		this.getStair().removeLast(stair);
		this.getSuit().putCard(cardStair, cardStair.getType());
	}

}
