package HW;
class Sudoku{
	public static void main(String[] args) {
		int sudokupuzzle[][]= { {5,3,0,0,7,0,0,0,0},
								{6,0,0,1,9,5,0,0,0},
								{0,9,8,0,0,0,0,6,0},
								{8,0,0,0,6,0,0,0,3},
								{4,0,0,8,0,3,0,0,1},
								{7,0,0,0,2,0,0,0,6},
								{0,6,0,0,0,0,2,8,0},
								{0,0,0,4,1,9,0,0,5},
								{0,0,0,0,8,0,0,7,9}};
		
		solveSudoku(sudokupuzzle);
	}
public static boolean solveSudoku(int[][] board) {
		int row = -1;
		int col = -1;
		boolean isFilled = true;
		outer: for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					isFilled = false;
					break outer;
				}
			}
		}

		if (isFilled) {
//			print the board here
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					System.out.print(board[i][j] + "\t");
				}
				System.out.println();
			}
			return true;
		}

		for (int k = 1; k <= 9; k++) {
			if (isSafeSudoku(k, row, col, board)) {
				board[row][col] = k;
				if (solveSudoku(board) == true) {
					return true;
				} else {
					board[row][col] = 0;
				}
			}
		}

		return false;
	}

	private static boolean isSafeSudoku(int k, int row, int col, int[][] board) {
		for (int i = 0; i <= row; i++) {
			if (board[i][col] == k) {
				return false;
			}
		}

		for (int j = 0; j <= col; j++) {
			if (board[row][j] == k) {
				return false;
			}
		}

		int sqrt = (int) Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;
		for (int i = boxRowStart; i < boxRowStart + sqrt; i++) {
			for (int j = boxColStart; j < boxColStart + sqrt; j++) {
				if (board[i][j] == k) {
					return false;
				}
			}
		}

		return true;
	}
}