package compsci.independent.game;

import java.util.Scanner;

import compsci.independent.Player;

public class Game {
	
		public void runGame(){
			int handSize;
			String name;
			Scanner scanner=new Scanner(System.in);
			
			System.out.print("How many players?\t");
			int numPlayers=scanner.nextInt();
			Player[] players=new Player[numPlayers];
			scanner.nextLine();
			
			for(int i=0; i<numPlayers;){
				System.out.print("What is Player "+(i+1)+"'s name?\t");
				name=scanner.nextLine();
				System.out.print("How many cards does "+name+" have?\t");
				handSize=scanner.nextInt();
				players[i]=new Player(name, handSize);
			}
			
			int g1, g2, g3;
			while(true){
				System.out.print("What was the value of guessed Person");
				g1=scanner.nextInt();
				System.out.print("What was the value of guessed Weapon");
				g2=scanner.nextInt();
				System.out.print("What was the value of guessed Room");
				g3=scanner.nextInt();
			}
			
			
		}
		
		
}
