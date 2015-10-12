package view;

import controller.Controller;
import controller.TurnOverController;
import model.LimitedIntDialog;
import model.Stair;

public class TurnOverView {

	private TurnOverController turnOverController;

	public TurnOverView(Controller controller) {
		this.turnOverController = (TurnOverController) controller;
	}

	public void render() {
		int stair;
		stair = new LimitedIntDialog("A que Escalera?", 1, Stair.STAIRS).read();
		if (this.turnOverController.isPosibleMove(stair - 1)) {
			this.turnOverController.turnOver(stair - 1);
			System.out.println("Carta volteada");
		} else {
			System.out.println("No se puede");
		}
		new DeckView(this.turnOverController.getDeck()).render();
		new DiscardView(this.turnOverController.getDiscard()).render();
		new SuitView(this.turnOverController.getSuit()).render();
		new StairView(this.turnOverController.getStair()).render();
	}

}
