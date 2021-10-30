
public class Card {

	//Setting the variables for each card to have
	
	//Using these instead of "name"
	private String faceValue;
	private String suit;
	//Using this instead of "value"
	private int score;

	public String getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	//Using this instead of "describe"
	public String info() {
		return (faceValue + " of " + suit);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
