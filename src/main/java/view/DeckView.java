package view;

import model.Deck;

public class DeckView {

	private Deck deck;
	
	public DeckView (Deck deck){
		this.deck = deck;
	}
	
	public void render(){
		System.out.print("Baraja: ");
		if (this.deck.isEmpty())
		{
			System.out.println("Vacio");
		}
		else
		{
			System.out.println("[X,X]");
		}
	}
	
}
