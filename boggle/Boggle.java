// V00898825 Hiebert, Tyrel
// Boggle
import java.util.*;
public class Boggle {
    static char[][] board = {  {'.','.','.','.','.','.'},
                               {'.','.','.','.','.','.'},
                               {'.','.','.','.','.','.'},
                               {'.','.','.','.','.','.'},
                               {'.','.','.','.','.','.'},
                               {'.','.','.','.','.','.'}};
    static int[] scores = {0,0,0,1,1,2,3,5,11};
    static boolean[][] visited = new boolean[6][6];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = Integer.parseInt(in.nextLine());
        // get dictionary of words to search for
        String[] dictionary = new String[w];
        for (int i = 0; i < w; i++) {
            dictionary[i] = in.nextLine();
        }
        in.nextLine();
        // number of games
        int b = Integer.parseInt(in.nextLine());
        // loop through each game board
        for (int a = 0; a < b; a++) {
            // get game board
            for (int i = 1; i < 5; i++) {
                String line = in.nextLine();
                for (int j = 1; j < 5; j++) {
                    board[i][j] = line.charAt(j - 1);
                }
            }
            if (in.hasNextLine()) in.nextLine();
            //printBoard();

            String word = "";
            String max_word = "";
            int num_words = 0;
            int points = 0;
            for (int i = 0; i < w; i++) {
                word = dictionary[i];
                if (findWord(word)) {
                    max_word = setMax(word, max_word);
                    num_words++;
                    points += scores[word.length()];
                }
            }
            System.out.println("" + points + " " + max_word + " " + num_words);
        }
    }

    static boolean findWord(String word) {
        char first_char = word.charAt(0);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (board[i][j] == first_char) {
                    visited[i][j] = true;
                    //printVisited();
                    if (checkNeighbors(i, j, 1, word)) {
                        visited[i][j] = false;
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    static boolean checkNeighbors(int i, int j, int pos, String word) {
        // check if word is found
        if (pos == word.length()) {
            return true;
        }
        char next_char = word.charAt(pos);
        // check all neighbors of current cell
        for (int a = -1; a <= 1; a++) {
            for (int b = -1; b <= 1; b++) {
                if (board[i+a][j+b] == next_char && !visited[i+a][j+b]) {
                    visited[i+a][j+b] = true;
                    if(checkNeighbors(i+a, j+b, pos+1, word)) {
                        visited[i+a][j+b] = false;
                        return true;
                    }
                    visited[i+a][j+b] = false;
                }
            }
        }
        return false;
    }

    static String setMax(String word1, String word2) {
        // return longer word
        if (word1.length() > word2.length()) {
            return word1;
        } else if (word2.length() > word1.length()) {
            return word2;
        // if words the same length, return lower alphabetically
        } else {
            int val = word1.compareTo(word2);
            if (val > 0) {
                return word2;
            }
        }
        return word1;
    }
    static void printBoard () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("" + board[i][j]);
            }
            System.out.println();
        }
    }
    static void printVisited() {
        System.out.println("Visited: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (visited[i][j]) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}

// ......
// .ABCD.
// .EFGH.
// .TGYS.
// .TYSG.
// ......