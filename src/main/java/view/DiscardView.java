package view;

import model.Card;
import model.Deck;

public class DiscardView {
	
	private Deck discard;
	
	public DiscardView (Deck discard){
		this.discard = discard;
	}
	
	public void render(){
		System.out.print("Descarte: ");
		if (this.discard.isEmpty())
		{
			System.out.println("Vacio");
		}
		else
		{
			for (Card elem : this.discard.getList())
			{
				System.out.print(elem.Paint());
			}
		}
		System.out.println("");
	}

}
