package laViuda;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	       public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	       public static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	 
	     public Deck(String[] suits, String[] ranks) {
	    	 this.suits = suits;
	    	 this.ranks = ranks;
	     }
	
	      
	     public List<String> deck() {
	    	    List<String> deck = new ArrayList<>();

	    	    for (String rank : ranks) {
	    	        String firstElement = rank;
	    	        
	    	        for (String suit : suits) {
	    	        	
	    	            String card = firstElement + " of " + suit;
	    	            deck.add(card);
	    	        }
	    	    }

	    	    return deck;
	    	}
	      
	      public String[] getSuits() {
	    	  return suits;
	      }
	      
	      public String[] getRanks() {
	    	  return ranks;
	      }
	      
	     
	      
	      
}
	 