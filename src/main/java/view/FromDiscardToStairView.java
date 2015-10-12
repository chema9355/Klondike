package view;

import controller.Controller;
import controller.FromDiscardToStairController;
import model.LimitedIntDialog;
import model.Stair;

public class FromDiscardToStairView {

	private FromDiscardToStairController fromDiscardToStairController;

	public FromDiscardToStairView(Controller controller) {
		this.fromDiscardToStairController = (FromDiscardToStairController) controller;
	}

	public void render() {
		int stair;
		if (this.fromDiscardToStairController.discardEmpty()) {
			System.out.println("El decarte esta vacio");
		} else {
			stair = new LimitedIntDialog("A que escalera?", 1, Stair.STAIRS).read();
			if (this.fromDiscardToStairController.isPosibleMove(stair - 1)) {
				this.fromDiscardToStairController.moveFromDiscardToStair(stair - 1);
				System.out.println("Carta movida de descarte a escalera");
			} else {
				System.out.println(
						"Movimiento no valido, la carta que se intenta mover no es un numero menor al la ultima de la escalera");
			}
		}
		System.out.println("");

		new DeckView(this.fromDiscardToStairController.getDeck()).render();
		new DiscardView(this.fromDiscardToStairController.getDiscard()).render();
		new SuitView(this.fromDiscardToStairController.getSuit()).render();
		new StairView(this.fromDiscardToStairController.getStair()).render();
	}
}
