package view;

import controller.Controller;
import controller.FromDiscardToDeckController;
import model.Card;

public class FromDiscardToDeckView {
	
	private FromDiscardToDeckController fromDiscardToDeckController;
	
	public FromDiscardToDeckView (Controller controller){
		this.fromDiscardToDeckController = (FromDiscardToDeckController) controller;
	}
	
	public void render(){
		Card card;
		if(this.fromDiscardToDeckController.deckEmpty())
		{
			card = this.fromDiscardToDeckController.getCardFromDiscard();
			this.fromDiscardToDeckController.moveFromDiscardToDeck(card);
			System.out.println("Carta movida de descarte a baraja");
		}
		else
		{
			System.out.println("No se puede la baraja no esta vacia");
		}
		System.out.println("");
		new DeckView(fromDiscardToDeckController.getDeck()).render();
		new DiscardView(fromDiscardToDeckController.getDiscard()).render();
		new SuitView(fromDiscardToDeckController.getSuit()).render();
		new StairView(fromDiscardToDeckController.getStair()).render();
	}

}


