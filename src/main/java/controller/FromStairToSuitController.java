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

	public boolean isPosibleMove(int stair, int suit) {
		Card cardStair;
		Card cardSuit;
		if(this.getStair().isEmpty(stair))
		{
			return false;
		}
		else if (this.getSuit().getCards().get(suit).isEmpty() && this.getStair().lastCard(stair).getValue() == 'A')
		{
			return true;
		}
		else
		{
			cardStair = this.getStair().lastCard(stair);
			cardSuit = this.getSuit().lastCard(suit);
			if(cardStair.sameSuit(cardSuit) && cardSuit.connect(cardStair))
			{
				return true;
			}
		}
		return false;
	}

	public void moveFromStairToSuit(int stair, int suit) {
		Card cardStair;
		cardStair = this.getStair().lastCard(stair);
		this.getStair().removeLast(stair);
		this.getSuit().getCards().get(suit).add(cardStair);
	}

}
