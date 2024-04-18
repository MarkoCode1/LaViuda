package laViuda;

import java.util.List;
import java.util.Scanner;

public class Player extends Hand {
	
public Player(String[] suits, String[] ranks) {
		super(suits, ranks);
		hand = new Hand(suits, ranks);
		
	}


private static Hand hand;

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to La Viuda!");

    System.out.println("Please enter your name: ");

  
    String name = scanner.nextLine();

    System.out.println("Hello, " + name + "!");
    
   
    System.out.println("Pick up a hand? (Yes/No)");
    String would = scanner.nextLine();

   
    Player player = new Player(suits, ranks);
    
    if (would.equalsIgnoreCase("Yes")) {
        
        List<String> randomHand = hand.getRandomCards(5); 
        System.out.println("This is your hand: " + randomHand);
    } else {
        System.out.println("See Ya!");
    }
}
}