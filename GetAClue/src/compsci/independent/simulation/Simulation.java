package compsci.independent.simulation;

import java.text.MessageFormat;
import java.util.ArrayList;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.card.CardTypes;
import compsci.independent.deck.ClueDeck;

public class Simulation {

	ArrayList<CardProbability> templates;
	int handSize;
	int[] without;
	
	public Simulation(ArrayList<CardProbability> ps, int h, int[] w){
		templates = ps;
		handSize = h;
		without = w;
	}
	
	public double[] runSim(int trials){
		int total = 0;
		int[] times = new int[21];
		
		for (int foo = 0; foo < trials; foo++){
			ArrayList<Card> realHand;
			
			search:
			while (true){
				realHand = new ArrayList<Card>(); 
				ClueDeck deck = new ClueDeck(without);
				
				for (int i = 0; i < handSize; i++){
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
			
			for (int i = 0; i <= 20; i++){
				for (Card c : realHand){
					if (c.equals(new Card(i))){
						times[i]++;
						break;
					}
				}
			}
			total++;
		}
		
		double[] probs = new double[21];
		for (int i = 0; i <= 20; i++){
			probs[i] = ((double) times[i])/total;
		}
		
		for(int i = 0; i <= 20; i++){
			System.out.println(((String) CardTypes.CardNameMap.get(i)) + ": \t" +
					((((String) CardTypes.CardNameMap.get(i)).length() < 6)?"\t":"") +
					MessageFormat.format("{0,number,#.#%}", probs[i]));
		}
		
		return probs;
		
	}
}
