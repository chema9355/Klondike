package controller;

import model.Deck;
import model.Stair;
import model.Suit;
import model.Type;

import java.util.Random;

import model.Card;;

public class StartController extends Controller{
	
	ColocateControllFactory colocateControllFactory;
	
	public StartController(Deck deck, Deck discard, Stair stair, Suit suit, ColocateControllFactory colocateControllFactory) {
		super(deck, discard, stair, suit);
		this.colocateControllFactory = colocateControllFactory;
	}
	
	public void control(){
		this.init();
		this.fillStairs();
		colocateControllFactory.setControllers();
	}
	
	private void init(){
		for (char elem : Card.AllowRange){
			this.deck.put(new Card(elem, Type.BASTOS));
			this.deck.put(new Card(elem, Type.OROS));
			this.deck.put(new Card(elem, Type.COPAS));
			this.deck.put(new Card(elem, Type.ESPADAS));
		}
	}
	
	private void fillStairs(){
		Random random = new Random(System.currentTimeMillis());
		int randomCard;
		Card c;
		int contador = 1;
		for (int i=0; i < Stair.STAIRS; i++)
		{
			for(int j=i; j < Stair.STAIRS; j++)
			{
				randomCard = random.nextInt(Card.TotalCards-contador);
				c=deck.getCard(randomCard);
				this.stair.putCard(c,i);
				this.deck.removeCard(deck.getCard(randomCard));
				contador++;
			}
			this.stair.lastCard(i).changeState();
			
		}
	}
	
	

	

}
