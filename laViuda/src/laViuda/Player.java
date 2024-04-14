package laViuda;

public class Player  {
	
	public String name;
	public Hand hand;
	
	 public Player(String name) {
	        this.name = name;
	        this.hand = new Hand();
	        
	    }
	 
	 @Override
	    public String toString() {
	        return "Player" + name + "has the hand:" + hand + ".";
}
