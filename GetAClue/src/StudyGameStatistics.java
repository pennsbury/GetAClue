import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import compsci.independent.Player;
import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.card.CardTypes;
import compsci.independent.deck.ClueDeck;


public class StudyGameStatistics {

	static Random random = new Random(System.nanoTime());
	
	static int trialSetting = 2;
	
	public static void main(String[] args) {
		int yes = 0, no = 0;
		int trialAmount = 0;
		long startTime = System.currentTimeMillis();
		
		while(trialAmount < 3000){
			trialAmount++;
			
			ArrayList<CardProbability> ps = new ArrayList<CardProbability>();
			ArrayList<Card> realHand = new ArrayList<Card>(); 
			ClueDeck deck = new ClueDeck();
			
			for (int i = 0; i < 4; i++){
				realHand.add(new Card(deck.drawCard()));
			}
			
			//System.out.println(realHand);
			
			int similarities = 0;
			while (similarities < trialSetting){
				CardProbability p = new CardProbability(
						new Card(randomCardFromCollection(CardTypes.PeopleMap.values())),
						new Card(randomCardFromCollection(CardTypes.WeaponsMap.values())),
						new Card(randomCardFromCollection(CardTypes.RoomsMap.values()))
						);
//				ArrayList<Integer> aCol = new ArrayList<Integer>();
//				aCol.addAll(CardTypes.WeaponsMap.values());
//				aCol.addAll(CardTypes.RoomsMap.values());
//				
//				CardProbability p = new CardProbability(
//						new Card(randomCardFromCollection(CardTypes.PeopleMap.values())),
//						new Card(randomCardFromCollection(aCol))
//						);
				
				for (Card card : realHand){
					if (p.contains(card)){
						ps.add(p);
						break;
					}
				}
				
				int[] values = new int[21];
				for (CardProbability p2 : ps){
					int count = 0;
					int which = -1;
					for (Card card : p2.cards){
						values[card.getCardType()] += 1;
						
						if(values[card.getCardType()] == trialSetting){
							count++;
							which = card.getCardType();
						}
					}
					
					if (count == 1){
						//System.out.println(which);
						//System.out.println(ps);
						boolean inHand = false;
						for (Card card2 : realHand){
							if (card2.equals(new Card(which))){
								inHand = true;
								break;
							}
						}
						if (inHand){
							yes++;
						} else{
							no++;
						}
						
						System.out.println("True: " + ((double) yes / (yes + no)) + " False: " + ((double) no / (yes + no)) + " Trials: " + (yes + no));
					}
				}
				
				int highest = 0;
				for (int val : values){
					if (val > highest){
						highest = val;
					}
				}
				similarities = highest;
			}	
			
	//		int match = -1;
	//		for(Card c : ps.get(ps.size()-1).cards){
	//			for (int i = 0; i < ps.size()-1; i++){
	//				if (ps.get(i).contains(c)){
	//					match = i;
	//					//System.out.println(match);
	//					break;
	//				}
	//			}
	//		}
	//		
	//		if (match==-1){
	//			try {
	//				throw new Exception();
	//			} catch (Exception e) {
	//				// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}
	//		}
	//		
	//		for (int i = 0; i < ps.size()-1; i++){
	//			if (i != match) ps.remove(i);
	//		}
			
	//		System.out.println(ps);
		}
		
		System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");
		
	}
	
	public static Integer randomCardFromCollection (Collection<Integer> c){
		int r = random.nextInt(c.size());
		
		return (Integer) c.toArray()[r];
	}

}
