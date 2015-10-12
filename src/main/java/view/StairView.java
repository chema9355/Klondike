package view;

import model.Card;
import model.Stair;


public class StairView {
	
	private Stair stair;
	
	public StairView (Stair stair){
		this.stair = stair;
	}
	
	public void render(){
		for (int i=0; i < Stair.STAIRS; i++)
		{
			paintStair(i);
		}
	
	}
	
	private void paintStair(int stair){
		int showStair = stair+1;
		if (this.stair.isEmpty(stair))
			{
				System.out.println("Escalera " + showStair + " Vacia");
			}
		else
			{
			    System.out.print("Escalera" + showStair + " ");
			    for(Card elem : this.stair.getCards().get(stair))
				{
					System.out.print(elem.Paint());
				}
			}
		System.out.println("");
		}
	

}
