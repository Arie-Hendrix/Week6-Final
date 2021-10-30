import java.util.ArrayList;
import java.util.List;

public class Player {
	 
	//Using this instead of name
	private String playerName;
	//Using this instead of score
	private int playerScore = 0;
	List<Card> hand = new ArrayList<Card>();
	
	//Getters and setters for both the front facing player name and the
	//behind the scenes score, which is used to determine who wins
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	
	//Using this instead of "draw"
	public void drawCard(Deck input) {
		hand.add(input.draw());
	}
	
	public Card flip(){
		Card temporary = hand.get(0);
		hand.remove(0);
		return temporary;
	}
	
	//Using this instead of "incrementScore"
	public void addScore() {
		playerScore += 1;
	}
	
	//Method to tell about the player, and show each card in their hand
	//Using this instead of "describe"
	public void information() {
		 System.out.println("This player's name is " + playerName + ", and their cards are:");
		 for (Card card : hand) {
			 System.out.println(card.getFaceValue() + " of " + card.getSuit());
		 }
	}
}
