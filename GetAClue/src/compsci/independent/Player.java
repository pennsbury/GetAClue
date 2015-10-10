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
	
	public HashMap<Integer, Double> analyzeCardProbabilities(int[] removeFromDeck){	
		Simulation sim = new Simulation(cards, handSize, removeFromDeck);
		
		return sim.runSim(3000);
	}
	
	public void addCardProbability(CardProbability c){
		cards.add(c);
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getHandSize() {
		return handSize;
	}
	
	
	
}
