package compsci.independent.game;

import java.util.Scanner;

import compsci.independent.Player;
import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;

public class Game {
	
		public void runGame(){
			int handSize;
			String name;
			Scanner scanner=new Scanner(System.in);
			
			System.out.print("How many players?\t");
			int numPlayers=scanner.nextInt();
			Player[] players=new Player[numPlayers];
			scanner.nextLine();
			
			for(int i=0; i<numPlayers; i++){
				System.out.print("What is Player "+(i)+"'s name?\t");
				name=scanner.nextLine();
				System.out.print("How many cards does "+name+" have?\t");
				handSize=scanner.nextInt();
				players[i]=new Player(name, handSize);
			}
			
			int g1, g2, g3, p1;
			while(true){
				System.out.print("\nWhat was the value of guessed Person?\t");
				g1=scanner.nextInt();
				if (g1 < 0) break;
				
				System.out.print("What was the value of guessed Weapon?\t");
				g2=scanner.nextInt();
				
				System.out.print("What was the value of guessed Room?\t");
				g3=scanner.nextInt();
				
				
				System.out.print("Who responds?\t");
				p1=scanner.nextInt();
				
				players[p1].addCardProbability(new CardProbability(
						new Card(g1),
						new Card(g2),
						new Card(g3)));
			}
			
			for(Player p : players){
				System.out.println("\n\nPlayer Name: " + p.getPlayerName());
				System.out.println();
				
				p.analyzeCardProbabilities(new int[] {});
			}
			
			
		}
		
		
}
