package compsci.independent;

import java.util.ArrayList;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;

public class Player {

	int handSize;
	
	ArrayList<CardProbability> cards = new ArrayList<CardProbability>();
	
	public Player(int size){
		handSize = size;
	}
	
}
