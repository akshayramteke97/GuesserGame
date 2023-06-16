import java.util.*;

class GuesserPlayer {
	int guessNum(String type) {
		Scanner scan = new Scanner(System.in);
		System.out.println(type+" kindly guess the number");
		return scan.nextInt();
	}
}
class Umpire {
	int numFromGuesser, numFromPlayer1,numFromPlayer2,numFromPlayer3;

	void collectNumFromGuesser() {
		numFromGuesser = new GuesserPlayer().guessNum("guesser");
	}

	void collectNumFromPlayers() {
		GuesserPlayer p1 = new GuesserPlayer();
		numFromPlayer1 = p1.guessNum("Player1");
		numFromPlayer2 = p1.guessNum("Player2");
		numFromPlayer3 = p1.guessNum("Player3");
	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 & Player2 won");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 & Player3 won");
			} else {
				System.out.println("Player 1 won the game");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 & Player3 won");
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("Game lost Try Again!");
		}
	}
}
public class LaunchGame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
