package compsci.independent.card;

import java.util.ArrayList;

public class CardProbability{

	public ArrayList<Card> cards = new ArrayList<Card>();
	
	public CardProbability(Card c1, Card c2, Card c3){
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
	}
	
	public CardProbability(Card c1, Card c2){
		cards.add(c1);
		cards.add(c2);
	}
	
	public CardProbability(Card c1){
		cards.add(c1);
	}
	
	public double getCardProbability(Card check){
		for (Card card : cards){
			if (check.equals(card)){
				return 1.0 / cards.size();
			}
		}
		
		return 0;
	}
}
