package laViuda;

import java.util.ArrayList;
import java.util.List;

public class CheckCards {


public static void main(String[] args) {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; 

    Hand hand = new Hand(suits, ranks);
    ArrayList<String> randomCards = Hand.getRandomCards(5);

    int[] rankCounts = new int[ranks.length];

    for (String card : randomCards) {
    	int rank = Integer.parseInt(card.split(" ")[0]);
    	
    	
    	
        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i] == rank) {
                rankCounts[i]++;
                System.out.println(card);
                break;
            }
        }
    }
   

        // Call the method to check card combinations
        checkCardCombinations(rankCounts, ranks);
}

    public static void checkCardCombinations(int[] rankCounts, int[] ranks) {
        int pairCount = 0;
        
        for (int i = 0; i < ranks.length; i++) {
            // Pairs
            if (rankCounts[i] == 2) {
                System.out.println(ranks[i] + " appears twice.");
                // If there is a pair add 1 to pairCount
                pairCount++;
            }
            // Three of a kind
            if (rankCounts[i] == 3) {
                System.out.println(ranks[i] + " Three of a Kind.");
            }
            // Four of a kind
            if (rankCounts[i] == 4) {
                System.out.println(ranks[i] + " Four of a Kind.");
            }
        }

        // Two Pair
        if (pairCount == 2) {
            System.out.println("Two pairs found!");
        }
    }
}



//String rankString = "";
//if (rank == 11) {
//  rankString = "Jack";
//} else if (rank == 12) {
//  rankString = "Queen";
//} else if (rank == 13) {
//  rankString = "King";
//} else if (rank == 1) {
//  rankString = "Ace";
//} else {
//  rankString = String.valueOf(rank);
//}
//