package view;

public class DeckView {

	private DeckForView deck;

	public DeckView(DeckForView deck) {
		this.deck = deck;
	}

	public void render() {
		System.out.print("Baraja: ");
		if (this.deck.isEmpty()) {
			System.out.println("Vacio");
		} else {
			System.out.println("[X,X]");
		}
	}

}
