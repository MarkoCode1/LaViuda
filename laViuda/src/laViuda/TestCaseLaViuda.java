package laViuda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestCaseLaViuda {

	@Test
	void testDeck() {
		 String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	        
	        Deck deck = new Deck(suits, ranks);
	        List<String> generatedDeck = deck.deck();
	        
	        assertTrue(generatedDeck.contains("Ace of Spades"));
	        assertTrue(generatedDeck.contains("Ace of Hearts"));
	        assertTrue(generatedDeck.contains("2 of Diamonds"));
	}
	 @Test
	    public void testHandInitialization() {
	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	        
	        Hand hand = new Hand(suits, ranks);
	        
	        assertNotNull(hand);
	        assertArrayEquals(suits, hand.getSuits());
	        assertArrayEquals(ranks, hand.getRanks());
	        assertEquals(5, hand.getCount());
	    }
	    
//	    @Test
//	    public void testRandomCardsGeneration() {
//	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//	        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
//	        
//	        Hand hand = new Hand(suits, ranks);
//	        
//	        List<String> randomCards = hand.getRandomCards(5);
//	        
//	        assertNotNull(randomCards);
//	        assertEquals(5, randomCards.size());
//	        for (String card : randomCards) {
//	            assertTrue(card.matches("\\bAce\\b of (Spades|Hearts|Diamonds|Clubs)"));
//	        }
//	    }
}
