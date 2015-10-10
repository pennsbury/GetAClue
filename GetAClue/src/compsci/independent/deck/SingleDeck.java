package compsci.independent.deck;

import java.util.ArrayList;
import java.util.Random;

import compsci.independent.card.Card;

public class SingleDeck {
	Random random;
	
	ArrayList<Integer> is = new ArrayList<Integer>();
	
	public SingleDeck(int[] without){
		random = new Random(System.nanoTime());
		
		ArrayList<Integer> w = new ArrayList<Integer>();
		
		for(int i : without){
			w.add(i);
		}
		
		for (int i = 0; i <= 20; i++){
			if(!w.contains(Integer.valueOf(i))){
				is.add(i);
			}
		}
	}
	
	public SingleDeck(){
		random = new Random(System.nanoTime());
		
		for (int i = 0; i <= 20; i++){
			is.add(i);
		}
	}
	
	public int drawCard(){		
		return is.remove(random.nextInt(is.size()));
	}
	
	public boolean removeCard(Card c){
		return is.remove(Integer.valueOf(c.getCardType()));
	}
}
