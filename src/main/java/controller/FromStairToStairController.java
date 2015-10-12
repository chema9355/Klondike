package controller;


import model.Card;
import model.Deck;
import model.Stair;
import model.Suit;
import view.GameView;

public class FromStairToStairController extends MoveController{

	public FromStairToStairController(Deck deck, Deck discard, Stair stair, Suit suit) {
		super(deck, discard, stair, suit);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public boolean isPosibleMove(int originStair, int destinationStair) {
		Card originStairCard;
		Card destinationStairCard;
		if (this.getStair().isEmpty(destinationStair))
		{
			return true;
		}
		else
		{
			originStairCard = this.getStair().lastCard(originStair);
			destinationStairCard = this.getStair().lastCard(destinationStair);
			if(originStairCard.connect(destinationStairCard))
			{
				return true;
			}
		}
		return false;
	}
	
	public void moveFromStairToStair(int originStair, int destinationStair) {
		Card originStairCard;
		originStairCard = this.getStair().lastCard(originStair);
		this.getStair().removeLast(originStair);
		this.getStair().putCard(originStairCard, destinationStair);		
	}
	


}
