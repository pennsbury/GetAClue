package compsci.independent;

import java.util.ArrayList;

import compsci.independent.card.Card;

public class Player {

	int handSize;
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Player(int size){
		handSize = size;
	}
	
}
