
public class App {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		
		player1.setPlayerName("Matt Mercer");
		player2.setPlayerName("Sam Riegel");
		
		//passes out the deck to each player's hand
		for (int c = 0; c < 26; c++) {
			player1.drawCard(gameDeck);
			player2.drawCard(gameDeck);
		}
		
		//Goes through each match in the players' hands
		for (int r = 1; r < 27; r++) {
			if (player1.flip().getScore() > player2.flip().getScore()) {
				player1.addScore();
			}else {
				player2.addScore();
			}
		}
		//Checks to see what player scored the most points for this round
		if (player1.getPlayerScore() > player2.getPlayerScore()) {
			System.out.println(player1.getPlayerName() +" wins!");
		}else if (player2.getPlayerScore() > player1.getPlayerScore()) {
			System.out.println(player2.getPlayerName() + " wins!");
		}else {
			System.out.println("This round is a draw! Care to try again?");
		}
	}
}
