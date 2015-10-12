package view;

import controller.Controller;
import controller.FromStairToSuitController;
import model.LimitedIntDialog;
import model.Stair;
import model.Suit;

public class FromStairToSuitView {
	
private FromStairToSuitController fromStairToSuitController;
	
	public FromStairToSuitView (Controller controller){
		this.fromStairToSuitController = (FromStairToSuitController) controller;
	}
	
	public void render(){
		int suit;
		int stair;
		suit = new LimitedIntDialog("De que escalera?", 1,
				Stair.STAIRS).read();
		stair = new LimitedIntDialog("A que palo?", 1,
				Suit.SUITS).read();
		if(this.fromStairToSuitController.isPosibleMove(stair-1,suit-1))
		{
			this.fromStairToSuitController.moveFromStairToSuit(stair-1,suit-1);
		}
		else
		{
			System.out.println("Error, las cartas no conectan");
		}
		
		new DeckView(this.fromStairToSuitController.getDeck()).render();
		new DiscardView(this.fromStairToSuitController.getDiscard()).render();
		new SuitView(this.fromStairToSuitController.getSuit()).render();
		new StairView(this.fromStairToSuitController.getStair()).render();	
	}
	

}
