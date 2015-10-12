package model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	
	public Deck(){
		this.cards = new ArrayList<Card>();
	}
	
	public boolean isEmpty(){
		return this.cards.isEmpty();
	}
	
	public Card getLastCard(){
		return this.cards.get(this.cards.size()-1);
	}
	
	public List<Card> getList(){
		return this.cards;
	}
	
	public Card getCard(int i){
		return this.cards.get(i);
	}
	
	public void removeLast(){
		this.cards.remove(this.cards.size()-1);
	}
	
	public void removeCard(Card card){
		this.cards.remove(card);
	}
	
	public void put(Card card){
		this.cards.add(card);
	}
	
	}


