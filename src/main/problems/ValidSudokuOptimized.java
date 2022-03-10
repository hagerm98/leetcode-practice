package main.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudokuOptimized {

    public boolean isValidSudoku(char[][] board) {

        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> sq = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            sq.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' &&
                        ( rows.get(i).contains(board[i][j])
                        || cols.get(j).contains(board[i][j])
                        || sq.get(3 * (i/3) + (j/3)).contains(board[i][j])))
                    return false;

                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                sq.get(3 * (i/3) + (j/3)).add(board[i][j]);
            }
        }

        return true;

    }

}