package laViuda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LaViudaTest {

//	@Test
//    public void testDeck() {
//        Deck deck = new Deck(new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}, 
//        		new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"});
//
//        // Test that the deck is shuffled.
//        int[] expectedDeck = new int[52];
//        for (int i = 0; i < expectedDeck.length; i++) {
//            expectedDeck[i] = i;
//        }
//
//        boolean shuffled = false;
//        for (int i = 0; i < deck.deck.length; i++) {
//            if (deck.deck[i] != expectedDeck[i]) {
//                shuffled = true;
//                break;
//            }
//        }
//
//        assertTrue(shuffled);
//    }


	    @Test
	    public void testGetRandomSuit() {
	        // Create a new Card object
	        Card card = new Card();

	        // Get a random suit
	        String suit = card.getRandomSuit();

	        // Assert that the suit is valid
	        assertTrue(suit.equals("Spades") || suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs"));
	    }

	    @Test
	    public void testGetRandomRank() {
	        // Create a new Card object
	        Card card = new Card();

	        // Get a random rank
	        String rank = card.getRandomRank();

	        // Assert that the rank is valid
	        assertTrue(rank.equals("Ace") || rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("10") || rank.equals("Jack") || rank.equals("Queen") || rank.equals("King"));
	    }
	}
