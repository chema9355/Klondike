package view;

import controller.StartController;

public class StartView {

	private StartController startController;

	public StartView(StartController startController) {
		this.startController = startController;
	}

	public void render() {
		startController.control();
		System.out.println("BIENVENIDO");
		new DeckView(startController.getDeck()).render();
		new DiscardView(startController.getDiscard()).render();
		new SuitView(startController.getSuit()).render();
		new StairView(startController.getStair()).render();
	}

}
