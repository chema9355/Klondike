package controller;

import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromDiscardToSuitController extends MoveController{

	public FromDiscardToSuitController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}
	
	public void moveFromDiscardToSuit (){
		Card discardCard;
		discardCard = this.getDiscard().getLastCard();
		this.getDiscard().removeCard(discardCard);
		this.getSuit().putCard(discardCard, discardCard.getType());
	}
	
	public boolean isPosibleMove (){
		Card discardCard = this.getDiscard().getLastCard();
		if (this.getDiscard().isEmpty())
		{
			return false;
		}
		else if(this.getSuit().isEmpty(discardCard.getType()) && discardCard.getValue()=='A')
		{
			return true;
		}
		else
		{
			if (this.getSuit().lastCard(discardCard.getType()).connect(discardCard) && this.getSuit().lastCard(discardCard.getType()).sameSuit(discardCard))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public boolean emptyDiscard(){
	return this.getDiscard().isEmpty();
	}
	
	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
