package compsci.independent.card;

public class Card {

	int cardType;
	
	public Card(int type){
		cardType = type;
	}
	
	public boolean equals(Card check){
		return (check.cardType == this.cardType);
	}
}
