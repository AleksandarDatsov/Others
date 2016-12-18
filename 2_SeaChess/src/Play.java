
public class Play {
	public static void main(String[] args) {
		SeaChess chess = new SeaChess();
		boolean playAg = true;
		String[][] board;
		do {
			board = chess.copyArr();
			chess.gameStarts();
			for (int counter = 0; counter < 10; counter++) {
				if (counter != 0 && counter % 2 == 1) {
					chess.firstPlayer(board);
				} else if (counter != 0 && counter % 2 == 0) {
					chess.secondPlayer(board);
				}
				chess.boardPrint(board);
				boolean checkRowAndDiagonal = chess.checkRowsAndDiaForWin(board);
				boolean checkCol = chess.checkColForWin(board);
				if (checkRowAndDiagonal == true) {
					break;
				}
				if (checkCol == true) {
					break;
				}
			}
			if (chess.playAgain() == false) {
				playAg = false;
			}

		} while (playAg);
	}
}
