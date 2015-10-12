package view;

import controller.Controller;
import controller.FromStairToSuitController;
import model.LimitedIntDialog;
import model.Stair;

public class FromStairToSuitView {

	private FromStairToSuitController fromStairToSuitController;

	public FromStairToSuitView(Controller controller) {
		this.fromStairToSuitController = (FromStairToSuitController) controller;
	}

	public void render() {
		int stair;
		stair = new LimitedIntDialog("De que escalera?", 1, Stair.STAIRS).read();
		if (this.fromStairToSuitController.isPosibleMove(stair - 1)) {
			this.fromStairToSuitController.moveFromStairToSuit(stair - 1);
			System.out.println("Carta movida");
			System.out.println("");
		} else {
			System.out.println("Error, las cartas no conectan");
		}

		if (this.fromStairToSuitController.isGameFinish()) {
			System.out.println("VICTORIA");
		} else {
			new DeckView(this.fromStairToSuitController.getDeck()).render();
			new DiscardView(this.fromStairToSuitController.getDiscard()).render();
			new SuitView(this.fromStairToSuitController.getSuit()).render();
			new StairView(this.fromStairToSuitController.getStair()).render();
		}
	}
}
