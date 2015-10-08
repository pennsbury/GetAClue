package compsci.independent.deck;

import java.util.ArrayList;
import java.util.Random;

public class ClueDeck {
	Random random;
	
	ArrayList<Integer> is = new ArrayList<Integer>();
	
	public ClueDeck(){
		random = new Random(System.nanoTime());
		
		for (int i = 0; i <= 20; i++){
			is.add(i);
		}
	}
	
	public int drawCard(){
		return is.remove(random.nextInt(is.size()));
	}
}
