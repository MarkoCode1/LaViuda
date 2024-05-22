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
                    // System.out.println(card);
                    break;
                }
            }
        }

        // Call the method to check card combinations
        checkCardCombinations(rankCounts, ranks);
    }

    public static String checkCardCombinations(int[] rankCounts, int[] ranks) {
        int pairCount = 0;
        String result = "";

        for (int i = 0; i < ranks.length; i++) {
            // Three of a kind
            if (rankCounts[i] == 3) {
                result += ranks[i] + " Three of a Kind.\n";
            }
            // Four of a kind
            else if (rankCounts[i] == 4) {
                result += ranks[i] + " Four of a Kind.\n";
            }
            // Pairs
            else if (rankCounts[i] == 2) {
                result += ranks[i] + " Two of a kind.\n";
                pairCount++;
            }
        }

        // Two Pair
        if (pairCount == 2) {
            result += "Two pairs found!\n";
        }

        if (result.isEmpty()) {
            return "No combinations found.";
        } else {
            return result;
        }
}
}



