package laViuda;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCaseLaViuda {

	@Test
	void testDeck() {
		 String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		 int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	        
	        Deck deck = new Deck(suits, ranks);
	        List<String> generatedDeck = Deck.deck();
	        
	        assertTrue(generatedDeck.contains("1 of Spades"));
	        assertTrue(generatedDeck.contains("3 of Hearts"));
	        assertTrue(generatedDeck.contains("2 of Diamonds"));
	}
//	 @Test
//	    public void testHandInitialization() {
//	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//	        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
//	        
//	        Hand hand = new Hand(suits, ranks);
//	        
//	        assertNotNull(hand);
//	        assertArrayEquals(suits, hand.getSuits());
//	        assertArrayEquals(ranks, hand.getRanks());
//	        
//	    }
//	
	 @Test
	 public void testCheckCards() {
		 
	 }
}