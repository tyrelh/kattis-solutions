//V00898825 Hiebert, Tyrel
import java.util.*;
public class holey_n-queens {
    static int[][] board;
    static int solutions;
    static int nodes = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        board = new int[n][n];
        solutions = 0;
        while(n != 0) {
            // get holes
            if (m > 0) {
                int x, y;
                for (int i = 0; i < m; i++) {
                    input = in.nextLine().split(" ");
                    x = Integer.parseInt(input[0]);
                    y = Integer.parseInt(input[1]);
                    board[x][y] = -1; 
                }
            }
            // check for solutions
            solver(0, n);
            // print solutions
            System.out.println("sols:  " + solutions);
            System.out.println("nodes: " + nodes);
            // reset
            solutions = 0;
            // get input for next board
            input = in.nextLine().split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
            board = new int[n][n];
        }
    }

    // check if given coords are valid space
    public static boolean isSafe(int row, int col) {
        // check hole
        if (board[row][col] == -1) return false;
        int i, j;
        // check row
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }
        // check / diag
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        // check \ diag
        for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }
        // if never fails, then space is valid
        return true;
    }

    public static void solver(int col, int n) {
        nodes++;
        // check if found solution
        if (col == n) {
            solutions++;
            printBoard();
            return;
        }
        // try each row for given col
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col)) {
                // set the position of new queen
                board[row][col] = 1;
                // check next row
                solver(col + 1, n);
                // remove queen after return
                board[row][col] = 0;
            }
        }
        return;
    }

    public static void printBoard() {
        for (int row = board.length - 1; row >= 0; row--) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 0) System.out.print(". ");
                else if (board[row][col] == 1) System.out.print("Q ");
                else if (board[row][col] == -1) System.out.print("^ ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
