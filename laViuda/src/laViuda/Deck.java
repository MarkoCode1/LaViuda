package laViuda;

import java.util.ArrayList;


public class Deck {
	
	       public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	       public static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	 
	     public Deck(String[] suits, String[] ranks) {
	    	 Deck.suits = suits;
	    	 Deck.ranks = ranks;
	     }
	
	      
	     public static ArrayList<String> deck() {
	    	    ArrayList<String> deck = new ArrayList<>();

	    	    for (String rank : ranks) {
	    	        
	    	        for (String suit : suits) {
	    	        	
	    	            String card = rank + " of " + suit;
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
	 