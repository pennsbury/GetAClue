package compsci.independent;

import java.util.Scanner;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;

public class Test {
	public static void main(String[] args){
		Player testPlayer=new Player(3);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter guessed card 1:\t");
		Card g1=new Card(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Enter guessed card 2:\t");
		Card g2=new Card(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Enter guessed card 3:\t");
		Card g3=new Card(scanner.nextInt());
		scanner.nextLine();
		
		testPlayer.cards.add(new CardProbability(g1, g2, g3));
		
	}
	
	
}
