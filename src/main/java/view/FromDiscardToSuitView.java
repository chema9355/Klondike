package view;

import controller.Controller;
import controller.FromDiscardToSuitController;


public class FromDiscardToSuitView {
	
private FromDiscardToSuitController fromDiscardToSuitController;
	
	public FromDiscardToSuitView (Controller controller){
		this.fromDiscardToSuitController = (FromDiscardToSuitController) controller;
	}
	
	public void render(){
		if (this.fromDiscardToSuitController.isPosibleMove())
		{
			this.fromDiscardToSuitController.moveFromDiscardToSuit();
			System.out.println("Carta movida");
		}	
		else
		{
			System.out.println("Movimiento no valido");
		}
		System.out.println("");
	
	new DeckView(this.fromDiscardToSuitController.getDeck()).render();
	new DiscardView(this.fromDiscardToSuitController.getDiscard()).render();
	new SuitView(this.fromDiscardToSuitController.getSuit()).render();
	new StairView(this.fromDiscardToSuitController.getStair()).render();
	}
		
		
}


