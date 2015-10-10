package compsci.independent.deck;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public SingleDeck deck;
	int[] wo;
	
	public Deck(int[] without){
		wo = without;
		deck = new SingleDeck(wo);
	}
	
	public Deck(){
		wo = new int[] {};
		deck = new SingleDeck(wo);
	}
	
	public void refresh(){
		deck = new SingleDeck(wo);
	}
}
