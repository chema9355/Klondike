package view;

import controller.Controller;
import controller.FromSuitToStairController;
import model.LimitedIntDialog;
import model.Stair;
import model.Suit;

public class FromSuitToStairView {

	private FromSuitToStairController fromSuitToStairController;

	public FromSuitToStairView(Controller controller) {
		this.fromSuitToStairController = (FromSuitToStairController) controller;
	}

	public void render() {
		int suit;
		int stair;
		suit = new LimitedIntDialog("De que Palo?", 1, Suit.SUITS).read();
		stair = new LimitedIntDialog("A que Escalera?", 1, Stair.STAIRS).read();
		if (this.fromSuitToStairController.isPosibleMove(suit - 1, stair - 1)) {
			this.fromSuitToStairController.moveFromSuitToStair(suit - 1, stair - 1);
			System.out.println("Carta movida");
		} else {
			System.out.println("Error, las cartas no conectan");
		}

		new DeckView(this.fromSuitToStairController.getDeck()).render();
		new DiscardView(this.fromSuitToStairController.getDiscard()).render();
		new SuitView(this.fromSuitToStairController.getSuit()).render();
		new StairView(this.fromSuitToStairController.getStair()).render();

	}
}
