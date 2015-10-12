package view;

import controller.Controller;
import controller.FromStairToStairController;
import model.LimitedIntDialog;
import model.Stair;

public class FromStairToStairView {
	
private FromStairToStairController fromStairToStairController;
	
	public FromStairToStairView (Controller controller){
		this.fromStairToStairController = (FromStairToStairController) controller;
	}
	
	public void render(){
		int originStair;
		int destinationStair;
		originStair = new LimitedIntDialog("A que escalera?", 1,
				Stair.STAIRS).read();
		destinationStair = new LimitedIntDialog("A que escalera?", 1,
				Stair.STAIRS).read();
		if (originStair == destinationStair)
		{
			System.out.println("No es posible mover a la misma escalera");
		}
		else
		{
			if (this.fromStairToStairController.isPosibleMove(originStair, destinationStair))
			{
				this.fromStairToStairController.moveFromStairToStair(originStair, destinationStair);
			}
			else
			{
				System.out.println("No es posible el movimiento");
			}
		}
		new DeckView(this.fromStairToStairController.getDeck()).render();
		new DiscardView(this.fromStairToStairController.getDiscard()).render();
		new SuitView(this.fromStairToStairController.getSuit()).render();
		new StairView(this.fromStairToStairController.getStair()).render();	
	}

	

}
