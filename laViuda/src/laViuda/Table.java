package laViuda;

import java.util.List;
import java.util.Scanner;

public class Table extends Hand{

	public Table(String[] suits, String[] ranks) {
		super(suits, ranks);
		hand = new Hand(suits, ranks);
		
	}
	private static Hand hand;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("This is a test");
		 
		 System.out.println("Would you like to see the tbale hand? Yes / No");
		 String tableHand = scanner.nextLine();
		 
		 Table table = new Table (suits, ranks);
		 
		if (tableHand.equalsIgnoreCase("Yes")) {
			List<String> randomHand = hand.getRandomCards(5);
			System.out.println("This is your hand: " + randomHand);
	    } else {
	        System.out.println("See Ya!");
	    }	
		}
	}
