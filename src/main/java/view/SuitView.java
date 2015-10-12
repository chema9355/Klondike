package view;

import model.Card;
import model.Suit;
import model.Type;

public class SuitView {
	
private Suit suit;
	
	public SuitView (Suit suit){
		this.suit = suit;
	}
	
	public void render(){
		paintSuit(Type.OROS);
		paintSuit(Type.COPAS);
		paintSuit(Type.ESPADAS);
		paintSuit(Type.BASTOS);
	
	}
	
	private void paintSuit(Type type){
		if (suit.isEmpty(type))
			{
				System.out.println("Palo" + type.getValue() + " Vacio");
			}
		else
			{
			    System.out.print("Palo" + type.getValue() + " ");
			    for(Card elem : this.suit.getCards().get(type.ordinal()))
				{
					System.out.print(elem.Paint());
				} 
			}
		}

}