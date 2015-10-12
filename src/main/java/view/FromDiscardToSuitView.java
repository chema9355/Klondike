package view;

import controller.Controller;
import controller.FromDiscardToSuitController;
import model.Card;


public class FromDiscardToSuitView {
	
private FromDiscardToSuitController fromDiscardToSuitController;
	
	public FromDiscardToSuitView (Controller controller){
		this.fromDiscardToSuitController = (FromDiscardToSuitController) controller;
	}
	
	public void render(){
		Card discardCard = null;
		Card suitCard = null;
		if (this.fromDiscardToSuitController.emptyDiscard())
		{
			System.out.println("El decarte esta vacio");
		}
		else
		{
			this.fromDiscardToSuitController.getCards(discardCard, suitCard);
			if (this.fromDiscardToSuitController.isPosiblePut(discardCard, suitCard))
			{
				this.fromDiscardToSuitController.move(discardCard, suitCard);
			}	
			else
			{
				System.out.println("Movimiento no valido, la carta que se intenta mover no es un numero menor al la ultima de la escalera");
			}
		}
		System.out.println("");
	
	new DeckView(this.fromDiscardToSuitController.getDeck()).render();
	new DiscardView(this.fromDiscardToSuitController.getDiscard()).render();
	new SuitView(this.fromDiscardToSuitController.getSuit()).render();
	new StairView(this.fromDiscardToSuitController.getStair()).render();
	}
		
		
}


