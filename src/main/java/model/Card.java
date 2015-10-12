package model;

import java.util.Arrays;
import java.util.List;


public class Card {
	
	private char caracter;
	private Type type;
	private CardState cardState;
	
	public static final List<Character> AllowRange = Arrays.asList('A','2','3','4','5','6','7','8','9','J','Q','K');
	public static final int TotalCards = 48;
	
	public Card(){
	}
	
	public Card (char caracter, Type type){
		assert AllowRange.contains(caracter);
		this.caracter=caracter;
		this.type=type;
		this.cardState=CardState.NOVISIBLE;
	}
	
	public boolean connect (Card card){
		if (AllowRange.indexOf(card.caracter)-AllowRange.indexOf(this.caracter)== 1 || card == null)
		{
			return true;
		}
		return false;
	}
	
	public void changeState(){
		if (this.cardState==CardState.NOVISIBLE)
		{
			this.cardState=CardState.VISIBLE;
		}
		else
		{
			this.cardState=CardState.NOVISIBLE;
		}
	}
	
	public String Paint(){
		if (this.cardState==CardState.NOVISIBLE)
		{
			return "[";
		}
		else
		{
			return"[" + this.caracter + "," + this.type.getValue() + "]";
		}
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	public char getValue(){
		return this.caracter;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caracter;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (caracter != other.caracter)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
