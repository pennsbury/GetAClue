import java.util.ArrayList;

import compsci.independent.card.Card;
import compsci.independent.card.CardProbability;
import compsci.independent.card.CardTypes;
import compsci.independent.simulation.Simulation;


public class Test {

	public static void main(String[] args) {
		ArrayList<CardProbability> a = new ArrayList<CardProbability>();
		a.add(new CardProbability(
				new Card(CardTypes.People.MUSTARD),
				new Card(CardTypes.Rooms.BILLARD),
				new Card(CardTypes.Weapons.KNIFE)));
		
		a.add(new CardProbability(
				new Card(CardTypes.People.MUSTARD),
				new Card(CardTypes.Rooms.BALL),
				new Card(CardTypes.Weapons.PIPE)));
		
		a.add(new CardProbability(
				new Card(CardTypes.People.MUSTARD),
				new Card(CardTypes.Rooms.CONSERV),
				new Card(CardTypes.Weapons.REVOLVER)));
		
		Simulation sim = new Simulation(a);
		sim.runSim(3000);
		
	}

}
