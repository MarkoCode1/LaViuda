package laViuda;

public class HandTest extends Deck {

		
	 public HandTest(String[] suits, String[] ranks) {
		super(suits, ranks);
		
	}

	public static void main(String[] args) {
	        
	        Hand hand = new Hand(suits, ranks);

	       
	        Player player = new Player(hand);
	    }
	}