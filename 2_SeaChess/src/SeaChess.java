
import java.util.Scanner;

public class SeaChess {
	int n;
	int m;
	String[][] ticTacToe = { { "", "", "", "", "" }, { "", "| ", "| ", "| ", "|" }, { "", "| ", "| ", "| ", "|" },
			{ "", "| ", "| ", "| ", "|" } };
	static Scanner sc = new Scanner(System.in);

	boolean checkColForWin(String[][] a) {
		int count = 0;
		int secCount = 0;
		int thirdCount = 0;
		for (int i = 1; i < 4; i++) {
			if (a[1][i].equals("|X") == true) {
				count++;
			}
			if (a[2][i].equals("|X") == true) {
				secCount++;
			}
			if (a[3][i].equals("|X") == true) {
				thirdCount++;
			}
		}
		if (count == 3 || secCount == 3 || thirdCount == 3) {
			System.out.println("Player 1 wins the game!");
			return true;
		}
		count = 0;
		secCount = 0;
		thirdCount = 0;
		for (int i = 1; i < 4; i++) {
			if (a[1][i].equals("|O") == true) {
				count++;
			}
			if (a[2][i].equals("|O") == true) {
				secCount++;
			}
			if (a[3][i].equals("|O") == true) {
				thirdCount++;
			}
		}
		if (count == 3 || secCount == 3 || thirdCount == 3) {
			System.out.println("Player 2 wins the game!");
			return true;
		}
		return false;
	}

	boolean checkRowsAndDiaForWin(String[][] a) {
		if (a[1][1].equals("|X") && a[2][2].equals("|X") && a[3][3].equals("|X")
				|| a[1][3].equals("|X") && a[2][2].equals("|X") && a[3][1].equals("|X")) {
			System.out.println("Player 1 wins the game!");

			return true;
		}
		if (a[1][1].equals("|O") && a[2][2].equals("|O") && a[3][3].equals("|O")
				|| a[1][3].equals("|O") && a[2][2].equals("|O") && a[3][1].equals("|O")) {
			System.out.println("Player 2 wins the game!");

			return true;
		}
		int count = 0;
		int secCount = 0;
		int thirdCount = 0;
		for (int i = 1; i < 4; i++) {
			if (a[i][1].equals("|X") == true) {
				count++;
			}
			if (a[i][2].equals("|X") == true) {
				secCount++;
			}
			if (a[i][3].equals("|X") == true) {
				thirdCount++;
			}
		}
		if (count == 3 || secCount == 3 || thirdCount == 3) {
			System.out.println("Player 1 wins the game!");
			return true;
		}
		count = 0;
		secCount = 0;
		thirdCount = 0;
		for (int i = 1; i < 4; i++) {
			if (a[i][1].equals("|O") == true) {
				count++;
			}
			if (a[i][2].equals("|O") == true) {
				secCount++;
			}
			if (a[i][3].equals("|O") == true) {
				thirdCount++;
			}
		}
		if (count == 3 || secCount == 3 || thirdCount == 3) {
			System.out.println("Player 2 wins the game!");
			return true;
		}
		return false;
	}

	void gameStarts() {
		System.out.println("Game starts! \n  Player 1 plays with \"X\" \n  Player 2 plays with \"O\" ");
		System.out.println("\t\t\t\t SELECT COORDINATES BETWEEN    1    AND    3   !!");
	}

	void boardPrint(String[][] ticTacToe) {

		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
				System.out.print(ticTacToe[row][col]);
			}if(row > 0){
			System.out.println("|");
		}
			System.out.println("-------");
		}
		return;

	}

	boolean playAgain() {
		System.out.println("If u wont to play again Enter Y/N");
		String playing = sc.next();
		if (playing.equalsIgnoreCase("y")) {

			return true;
		} else {
			System.out.println("GoodBye");
			return false;
		}
	}

	public void secondPlayer(String[][] ticTacToe) {

		System.out.println("Player 2's turn! Select coordinates!");
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println(n + "," + m);

		if (ticTacToe[n][m].equals("|O") || ticTacToe[n][m].equals("|X")) {
			System.out.println("Try again!");

			do {
				System.out.println("Bad coordinates!");
				n = sc.nextInt();
				m = sc.nextInt();
			} while (ticTacToe[n][m].equals("|O") || ticTacToe[n][m].equals("|X"));
			ticTacToe[n][m] = "|O";

		} else {
			ticTacToe[n][m] = "|O";
		}
	}

	public void firstPlayer(String[][] ticTacToe) {
		System.out.println("Player 1's turn! Select coordinates!");
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println(n + "," + m);

		if (ticTacToe[n][m].equals("|O") || ticTacToe[n][m].equals("|X")) {
			System.out.println("Try again!");
			do {
				System.out.println("Bad coordinates! ");
				n = sc.nextInt();
				m = sc.nextInt();

			} while (ticTacToe[n][m].equals("|O") || ticTacToe[n][m].equals("|X"));

			ticTacToe[n][m] = "|X";

		} else {
			ticTacToe[n][m] = "|X";
		}
	}

	public String[][] copyArr() {
		String[][] board = new String[ticTacToe.length][ticTacToe.length];
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe.length; j++) {
				board[i][j] = ticTacToe[i][j];
			}
		}
		return board;
	}
}
