package laViuda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand extends Deck {
	
	private int count = 5;

	public Hand(String[] suits, String[] ranks) {
		super(suits, ranks);
		
	}

	
	public List<String> getRandomCards(int count) {
        List<String> fullDeck = deck();
        List<String> randomCards = new ArrayList<>();
        Random random = new Random();

        while (randomCards.size() < count && !fullDeck.isEmpty()) {
            int index = random.nextInt(fullDeck.size());
            randomCards.add(fullDeck.remove(index));
        }

        return randomCards;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
}
	
	
