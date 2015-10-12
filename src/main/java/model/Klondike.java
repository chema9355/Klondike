package model;

import controller.ColocateControllFactory;
import controller.StartController;
import view.GameView;
import view.StartView;

public class Klondike {
	
	private Deck deck;
	
	private Deck discard;
	
	private Stair stair;
	
	private Suit suit;
	
	private StartController startController;
	
	private ColocateControllFactory colocateControllFactory;
	
	private StartView startView;
		
	private GameView gameView;
	
	public Klondike(){
		deck = new Deck();
		discard = new Deck();
		stair = new Stair();
		suit = new Suit();
		colocateControllFactory = new ColocateControllFactory(deck, discard, stair, suit);
		gameView = new GameView(colocateControllFactory);
		startController = new StartController(deck, discard, stair, suit, colocateControllFactory);
		startView = new StartView(startController);
	}
	
	public void play() {
		startView.render();
		gameView.render();
	}

	public static void main(String[] args) {
		Klondike klondike = new Klondike();
		klondike.play();
	}

}
