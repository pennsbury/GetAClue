package compsci.independent.card;

import java.util.HashMap;
import java.util.Map;

public class CardTypes {
	
	public class People {
		public static final int MUSTARD = 0;
		public static final int PLUM = 1;
		public static final int GREEN = 2;
		public static final int PEACOCK = 3;
		public static final int SCARLET = 4;
		public static final int WHITE = 5;
	}

	public class Weapons {
		public static final int KNIFE = 6;
		public static final int CANDLE = 7;
		public static final int REVOLVER = 8;
		public static final int ROPE = 9;
		public static final int PIPE = 10;
		public static final int WRENCH = 11;
	}

	public class Rooms {
		public static final int HALL = 12;
		public static final int LOUNGE = 13;
		public static final int DINING = 14;
		public static final int KITCHEN = 15;
		public static final int BALL = 16;
		public static final int CONSERV = 17;
		public static final int BILLARD = 18;
		public static final int LIBRARY = 19;
		public static final int STUDY = 20;
	}
	
    public static final Map<Integer, String> CardNameMap;
    static
    {
    	CardNameMap = new HashMap<Integer, String>();
    	CardNameMap.put(0, "MUSTARD");
    	CardNameMap.put(1, "PLUM");
    	CardNameMap.put(2, "GREEN");
    	CardNameMap.put(3, "PEACOCK");
    	CardNameMap.put(4, "SCARLET");
    	CardNameMap.put(5, "WHITE");
    	CardNameMap.put(6, "KNIFE");
    	CardNameMap.put(7, "CANDLE");
    	CardNameMap.put(8, "REVOLVER");
    	CardNameMap.put(9, "ROPE");
    	CardNameMap.put(10, "PIPE");
    	CardNameMap.put(11, "WRENCH");
    	CardNameMap.put(12, "HALL");
    	CardNameMap.put(13, "LOUNGE");
    	CardNameMap.put(14, "DINING");
    	CardNameMap.put(15, "KITCHEN");
    	CardNameMap.put(16, "BALL");
    	CardNameMap.put(17, "CONSERV");
    	CardNameMap.put(18, "BILLARD");
    	CardNameMap.put(19, "LIBRARY");
    	CardNameMap.put(20, "STUDY");
    }
}
