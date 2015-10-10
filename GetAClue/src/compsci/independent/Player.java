package compsci.independent;

import java.util.ArrayList;
import java.util.HashMap;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.card.CardTypes;
import compsci.independent.simulation.Simulation;

public class Player {
	String playerName;
	int handSize;
	
	ArrayList<CardProbability> cards = new ArrayList<CardProbability>();
	
	public Player(int size){
		handSize = size;
	}
	
	public Player (String name, int size){
		handSize=size;
		playerName=name;
	}
	
	public HashMap<Integer, Double> analyzeCardProbabilities(){
		HashMap<Integer, Double> probability = new HashMap<Integer, Double>();
		Simulation sim = new Simulation(a, 3, new int[] {
				CardTypes.People.MUSTARD,
				CardTypes.Weapons.PIPE
				});
		
		
		return probability;
	}
	
	public void addCardProbability(CardProbability c){
		cards.add(c);
	}
	
}
