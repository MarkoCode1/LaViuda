package laViuda;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestCaseLaViuda {

	@Test
	public void testCheckCardCombinations() {
	    int[] rankCounts = {0, 0, 3, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0};
	    int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	    String expected = "3 Three of a Kind.\n4 Two of a kind.\n8 Two of a kind.\nTwo pairs found!\n";

	    String result = CheckCards.checkCardCombinations(rankCounts, ranks);

	    assertEquals(expected, result);
	}

	    @Test
	    public void testCheckCardCombinations_NoCombinations() {
	        int[] rankCounts = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0};
	        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	        String expected = "No combinations found.";

	        String result = CheckCards.checkCardCombinations(rankCounts, ranks);

	        assertEquals(expected, result);
	    }

	    @Test
	    public void testGetRandomCards() {
	    	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	    	int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	    	Hand hand = new Hand(suits, ranks);

	    	int count = 5;
	    	ArrayList<String> randomCards = hand.getRandomCards(count);

	    	assertEquals(count, randomCards.size());

	    	ArrayList<String> uniqueCards = new ArrayList<>(randomCards);
	    	uniqueCards.removeAll(randomCards);
	    	assertTrue(uniqueCards.isEmpty());

	    	ArrayList<String> deck = new ArrayList<>(Deck.deck());
	    	deck.removeAll(randomCards);
	    	assertEquals(deck.size(), Deck.deck().size() - count);
	    }
}

