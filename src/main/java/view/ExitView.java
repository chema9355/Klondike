package view;

import controller.ExitController;

public class ExitView {

	private ExitController exitController;

	public ExitView(ExitController exitController) {
		this.exitController = exitController;
	}

	public void render() {
		if (this.exitController.isGameFinish() == false) {
			System.out.println("Juego no finalizado");
		}
		System.out.println("Adios");
		System.exit(0);
	}

}
