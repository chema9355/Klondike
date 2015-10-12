package view;

import controller.Controller;
import controller.FromDeckToDiscardController;

public class FromDeckToDiscardView {

	private FromDeckToDiscardController fromDeckToDiscardController;

	public FromDeckToDiscardView(Controller controller) {
		this.fromDeckToDiscardController = (FromDeckToDiscardController) controller;
	}

	public void render() {
		if (fromDeckToDiscardController.deckEmpty()) {
			System.out.println("No se puede, la baraja está vacia");
		} else {
			this.fromDeckToDiscardController.moveFromDeckToDiscard();
			System.out.println("Carta movida de bajara a descarte");
		}
		System.out.println("");
		new DeckView(fromDeckToDiscardController.getDeck()).render();
		new DiscardView(fromDeckToDiscardController.getDiscard()).render();
		new SuitView(fromDeckToDiscardController.getSuit()).render();
		new StairView(fromDeckToDiscardController.getStair()).render();
	}

}
