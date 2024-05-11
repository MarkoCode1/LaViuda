package laViuda;

import java.util.ArrayList;


public class Deck {
	
	       private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	       static int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	 
	       public Deck(String[] suits, int[] ranks) {
	           this.suits = suits;
	           this.ranks = ranks;
	       }

	       public static ArrayList<String> deck() {
	           ArrayList<String> deck = new ArrayList<>();

	           for (int i = 0; i < ranks.length; i++) {
	               int rank = ranks[i];
	               for (int j = 0; j < suits.length; j++) {
	                   String suit = suits[j];
	                   String card = rank + " of " + suit;
	                   deck.add(card);
	               }
	           }

	           return deck;
	       }

	       public String[] getSuits() {
	           return suits;
	       }

	       public int[] getRanks() {
	           return ranks;
	       }
	   }