package controller;



import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import model.Type;
import view.GameView;

public class FromDiscardToSuitController extends MoveController{

	public FromDiscardToSuitController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}
	
	public void move (Card discardCard, Card suitCard){
		this.getDiscard().removeCard(discardCard);
		this.getSuit().AddCard(discardCard, discardCard.getType());
	}
	
	public boolean isPosiblePut (Card discardCard, Card suitCard){
		if (this.getSuit().isEmpty(discardCard.getType()) && discardCard.getValue()=='A')
		{
			return true;
		}
		else
		{
			if (suitCard.connect(discardCard))
			{
				return true;
			}
		}
		return false;
	}
	
	public void getCards(Card discardCard, Card suitCard){
		discardCard = this.getDiscard().getLastCard();
		suitCard = this.getSuit().lastCard(discardCard.getType());
	}
	
	public boolean emptyDiscard(){
	return this.getDiscard().isEmpty();
	}
	
	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
