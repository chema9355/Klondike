package view;

import controller.ColocateControllFactory;
import controller.ExitController;
import controller.FromDeckToDiscardController;
import controller.FromDiscardToDeckController;
import controller.FromDiscardToStairController;
import controller.FromDiscardToSuitController;
import controller.FromStairToStairController;
import controller.FromStairToSuitController;
import controller.FromSuitToStairController;
import controller.MoveController;
import controller.TurnOverController;
import model.LimitedIntDialog;

public class GameView implements View {

	private ColocateControllFactory colocateControllFactory;

	public GameView(ColocateControllFactory colocateControllerFactory) {
		this.colocateControllFactory = colocateControllerFactory;
	}

	public void render() {// opciones menu
		MoveController controller;
		int option;
		do {
			option = this.chosenOption();
			controller = colocateControllFactory.getController(option);
			if (controller != null) {
				controller.recibir(this);
			}
		} while (controller != null);
	}

	private int chosenOption() {
		showMenu();
		int option = new LimitedIntDialog("Que opcion quieres?", 1, MoveController.MoveControllers).read();
		return option;
	}

	private void showMenu() {
		System.out.println("1. Mover de baraja a descarte");
		System.out.println("2. Mover de descarte a baraja");
		System.out.println("3. Mover de descarte a palo");
		System.out.println("4. Mover de descarte a escalera");
		System.out.println("5. Mover de escalera a palo");
		System.out.println("6. Mover de escalera a escalera");
		System.out.println("7. Mover de palo a escalera");
		System.out.println("8. Voltear en escalera");
		System.out.println("9. Salir");

	}

	public void atender(FromSuitToStairController fromSuitToStairController) {
		new FromSuitToStairView(fromSuitToStairController).render();
	}

	public void atender(FromStairToSuitController fromStairToSuit) {
		new FromStairToSuitView(fromStairToSuit).render();
	}

	public void atender(FromStairToStairController fromStairToStairController) {
		new FromStairToStairView(fromStairToStairController).render();
	}

	public void atender(FromDiscardToSuitController fromDiscardToSuit) {
		new FromDiscardToSuitView(fromDiscardToSuit).render();
	}

	public void atender(FromDiscardToStairController fromDiscardToStairController) {
		new FromDiscardToStairView(fromDiscardToStairController).render();
	}

	public void atender(FromDiscardToDeckController fromDiscardToDeckController) {
		new FromDiscardToDeckView(fromDiscardToDeckController).render();
	}

	public void atender(FromDeckToDiscardController fromDeckToDiscardController) {
		new FromDeckToDiscardView(fromDeckToDiscardController).render();
	}

	public void atender(ExitController exitController) {
		new ExitView(exitController).render();
	}

	public void atender(TurnOverController turnOverController) {
		new TurnOverView(turnOverController).render();
	}

}
