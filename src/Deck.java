import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cardDeck = new ArrayList<Card>();
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String value;
	
	// Deck constructor
	public Deck() {
		//When making the deck, using a for loop to make 13 cards, for each suit
		for (int s = 0; s < 4; s++) {
			
			for (int v = 2; v < 16; v++) {
				Card next = new Card();
				next.setSuit(suits[s]);
					if (v < 11) {
						Integer c = v;
						next.setFaceValue(c.toString());
						next.setScore(v);
						cardDeck.add(next);
					}else if (v == 11) {
						next.setFaceValue("J");
						next.setScore(v);
						cardDeck.add(next);
					}else if (v == 12) {
						next.setFaceValue("Q");
						next.setScore(v);
						cardDeck.add(next);
					}else if (v == 13) {
						next.setFaceValue("K");
						next.setScore(v);
						cardDeck.add(next);
					}else if (v == 14) {
						next.setFaceValue("A");
						next.setScore(v);
						cardDeck.add(next);
					}
			}
		}
	}
	
	public Card draw() {
		Card temporary = cardDeck.get(0);
		cardDeck.remove(0);
		return temporary;
	}
	
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
}