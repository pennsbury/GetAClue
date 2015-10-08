package compsci.independent.simulation;

import java.util.ArrayList;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.deck.ClueDeck;

public class Simulation {

	ArrayList<CardProbability> templates;
	
	public Simulation(ArrayList<CardProbability> ps){
		templates = ps;
	}
	
	public void runSim(int trials){
		int yes = 0, total = 0;
		
		for (int foo = 0; foo < trials; foo++){
			ArrayList<Card> realHand;
			
			search:
			while (true){
				realHand = new ArrayList<Card>(); 
				ClueDeck deck = new ClueDeck();
				
				for (int i = 0; i < 4; i++){
					realHand.add(new Card(deck.drawCard()));
				}
				
				for (CardProbability p : templates){
					boolean inHand = false;
					for (Card c : realHand){
						if(p.contains(c)){
							inHand = true;
							break;
						}
					}
					if (!inHand) continue search;
				}
				
				break;
			}
			
			for (Card c : realHand){
				if (c.equals(new Card(0))){
					yes++;
					break;
				}
			}
			total++;
		}
		
		System.out.println("Yes: " + ((double) yes / total));
	}
}
