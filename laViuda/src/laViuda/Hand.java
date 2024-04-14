package laViuda;

public class Hand extends Card {
	
	private static Card card;
	
	public Hand(Card card) {
		this.card = card;
	}
	
	public static void main(String[] args) {
		System.out.println("Your card is the " + card.getRandomSuit() + " of " + card.getRandomRank());
	}
	
}
	
	
