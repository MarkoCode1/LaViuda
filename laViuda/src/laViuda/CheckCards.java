package laViuda;

import java.util.ArrayList;

public class CheckCards extends Hand  {


	public CheckCards(String[] suits, String[] ranks) {
		super(suits, ranks);
	}

	public static void main(String[] args) {
		
		Deck deck = new Deck(Deck.suits, Deck.ranks);

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        ArrayList<String> randomCards = Hand.getRandomCards(5);

      
        int[] rankCounts = new int[ranks.length];
       
        for (String card : randomCards) {
            String rank = card.split(" ")[0];
            for (int i = 0; i < ranks.length; i++) {
                if (ranks[i].equals(rank)) {
                    rankCounts[i]++;
                    System.out.println(card);
                    break; 
                }
            }
        }

     
        int pairCount = 0;
      //check to see if there is a pair
        for (int i = 0; i < ranks.length; i++) {
            if (rankCounts[i] == 2) {
  
            	System.out.println(ranks[i] + " appears twice.");
                
               //if there is a pair add 1 to pairCount
                pairCount++;
            }
            if (rankCounts[i] == 3) {
            	System.out.println(ranks[i] + " Three of a Kind.");
            }
        }
        
        //checks to see if there are more than 1 pair and if there is get a retun
        if (pairCount == 2) {
        	 System.out.println("Two pairs found!");
        }
    }
}

	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public CheckCards(String[] suits, String[] ranks) {
//		super(suits, ranks);
//		// TODO Auto-generated constructor stub
	

//	 public static boolean isMatch(String card) {
//		
//	return card.contains("Ace"); // Check if the card string contains "Ace"
//	    }
//	
//	 
//	 public static void main(String[] args) {
//	 Hand hand = new Hand(suits, ranks);
//
//	ArrayList<String> randomCards = hand.getRandomCards(5);
//
//     // Check if any of the random cards match the criteria
//     for (String card : randomCards) {
//         if (CheckCards.isMatch(card)) {
//             System.out.println("Matching card found: " + card);
//         	}
//     	}
// 	}
//
//}	

