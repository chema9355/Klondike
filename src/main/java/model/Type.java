package model;

public enum Type {
OROS('O'),
COPAS('C'),
ESPADAS('E'),
BASTOS('B');

private char value;
	
	private Type(char value){
		this.value = value;
	}
	
	public char getValue() {
		return value;
	}
	
}
