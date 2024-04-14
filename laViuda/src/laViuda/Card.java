package laViuda;

import java.util.Random;

public class Card {
	public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	public static String[] ranks =  {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	
	public String getRandomSuit() {
	    int rnd = new Random().nextInt(suits.length);
	    return suits[rnd];
	}
	
	public String getRandomRank() {
	    int rnd = new Random().nextInt(ranks.length);
	    return ranks[rnd];
	}
		
	
	public void setSuits(String[] newSuits){
	suits = newSuits;
	}
	
	public static String[] getSuits() {
	return suits;
	}
	
	public void setRanks(String[] newRanks){
	ranks = newRanks;
	}
	public static String[] getRanks() {
		return ranks;
}
}



//	String[] combinedArray = new String[suits.length + ranks.length];
//	System.arraycopy(suits, 0, combinedArray, 0, suits.length);
//	System.arraycopy(ranks, 0, combinedArray, suits.length, ranks.length);
//}

//List<String> list1 = Arrays.asList(suits);
//List<String> list2 = Arrays.asList(ranks);


//public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//public static String[] ranks =  {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
//
////public Card(String[] initSuits, String[] initRank) {
//	 // suits = initSuits;
//	 // ranks = initRank;
//	}
//
//public void setSuits(String[] newSuits){
//suits = newSuits;
//}
//
//public static String[] getSuits() {
//return suits;
//}
//
//public void setRanks(String[] newRanks){
//ranks = newRanks;
//}
//
//public static String[] getRanks() {
//return ranks;

