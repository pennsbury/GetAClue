package compsci.independent.card;

import java.util.HashMap;
import java.util.Map;

public class CardTypes {
	
	public class People {
		static final int MUSTARD = 0;
		static final int PLUM = 1;
		static final int GREEN = 2;
		static final int PEACOCK = 3;
		static final int SCARLET = 4;
		static final int WHITE = 5;
	}
	
    public static final Map<String, Integer> PeopleMap;
    static
    {
    	PeopleMap = new HashMap<String, Integer>();
    	PeopleMap.put("MUSTARD", 0);
    	PeopleMap.put("PLUM", 1);
    	PeopleMap.put("GREEN", 2);
    	PeopleMap.put("PEACOCK", 3);
    	PeopleMap.put("SCARLET", 4);
    	PeopleMap.put("WHITE", 5);
    }

	public class Weapons {
		static final int KNIFE = 6;
		static final int CANDLE = 7;
		static final int REVOLVER = 8;
		static final int ROPE = 9;
		static final int PIPE = 10;
		static final int WRENCH = 11;
	}
	
    public static final Map<String, Integer> WeaponsMap;
    static
    {
    	WeaponsMap = new HashMap<String, Integer>();
    	WeaponsMap.put("KNIFE", 6);
    	WeaponsMap.put("CANDLE", 7);
    	WeaponsMap.put("REVOLVER", 8);
    	WeaponsMap.put("ROPE", 9);
    	WeaponsMap.put("PIPE", 10);
    	WeaponsMap.put("WRENCH", 11);
    }

	public class Rooms {
		static final int HALL = 12;
		static final int LOUNGE = 13;
		static final int DINING = 14;
		static final int KITCHEN = 15;
		static final int BALL = 16;
		static final int CONSERV = 17;
		static final int BILLARD = 18;
		static final int LIBRARY = 19;
		static final int STUDY = 20;
	}
	
    public static final Map<String, Integer> RoomsMap;
    static
    {
    	RoomsMap = new HashMap<String, Integer>();
    	RoomsMap.put("HALL", 12);
    	RoomsMap.put("LOUNGE", 13);
    	RoomsMap.put("DINING", 14);
    	RoomsMap.put("KITCHEN", 15);
    	RoomsMap.put("BALL", 16);
    	RoomsMap.put("CONSERV", 17);
    	RoomsMap.put("BILLARD", 18);
    	RoomsMap.put("LIBRARY", 19);
    	RoomsMap.put("STUDY", 20);
    }
}
