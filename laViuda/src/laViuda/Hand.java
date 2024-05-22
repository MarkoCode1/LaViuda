package laViuda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Hand extends Deck {

    public Hand(String[] suits, int[] ranks) {
        super(suits, ranks);
    }

    public static ArrayList<String> getRandomCards(int count) {
        ArrayList<String> deck = deck(); 
        Collections.shuffle(deck, new Random());
        return new ArrayList<>(deck.subList(0, count));
    }
    
}