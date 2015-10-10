import java.util.ArrayList;

import compsci.independent.Player;
import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.card.CardTypes;
import compsci.independent.simulation.Simulation;


public class Test {

	public static void main(String[] args) {
		Player player = new Player("Joiquin", 3);
		
		
		player.addCardProbability(new CardProbability(
				new Card(CardTypes.People.MUSTARD),
				new Card(CardTypes.Weapons.KNIFE)));
		
		player.addCardProbability(new CardProbability(
				new Card(CardTypes.People.MUSTARD),
				new Card(CardTypes.Rooms.BALL),
				new Card(CardTypes.Weapons.PIPE)));
		
		player.addCardProbability(new CardProbability(
				new Card(CardTypes.Weapons.CANDLE)));
		
		
		Simulation sim = new Simulation(a, 3, new int[] {
				CardTypes.People.MUSTARD,
				CardTypes.Weapons.PIPE
				});
		
		sim.runSim(2000);
		
	}

}
