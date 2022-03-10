package main.problems;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (row.contains(board[i][j]) && board[i][j] != '.') return false;
                row.add(board[i][j]);
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            Set<Character> col = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (col.contains(board[i][j]) && board[i][j] != '.') return false;
                col.add(board[i][j]);
            }
        }

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                if (! checkSquare(i, j, board)) return false;
            }
        }

        return true;

    }

    private boolean checkSquare(int x, int y, char[][] board) {
        Set<Character> sq = new HashSet<>();
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                if (sq.contains(board[i][j]) && board[i][j] != '.') return false;
                sq.add(board[i][j]);
            }
        }
        return true;
    }

}
