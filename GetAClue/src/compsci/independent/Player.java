package compsci.independent;

import java.util.ArrayList;
import java.util.HashMap;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;

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
		
		for (int type = 0; type <= 20; type++){ //All different cards possible
			double oneProb = 0;
			for (CardProbability card : cards){
				double oneCard = card.getCardProbability(new Card(type));
				
				oneProb += oneCard - oneCard*oneProb;
			}
			probability.put(type, oneProb);
		}
		
		return probability;
	}
	
	public void addCardProbability(CardProbability c){
		cards.add(c);
	}
	
}
