//V00898825 Hiebert, Tyrel
import java.util.*;
public class dicebetting {

    static public double[][] table = new double[10001][501];
    static public int n, s, k;

    static public double diceProb(int r, int d) {
        double value;
        if (d >= k) {
            table[r][d] = 1;
            return 1;
        }
        if (r + d < k) {
            table[r][d] = 0;
            return 0;
        }
        if (table[r][d] == -1) {
            value = (((double)d / s) * diceProb(r - 1, d)) + 
            (1 - ((double)d / s)) * diceProb(r - 1, d + 1);
            //System.out.println("" + value);
            table[r][d] = value;
        } else {
            value = table[r][d];
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        n = Integer.parseInt(input[0]);// number of throws 3
        s = Integer.parseInt(input[1]);// number of sides on the die 3
        k = Integer.parseInt(input[2]);// number of distinct values needed to win 2
        // initialize table
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < 501; j++) {
                table[i][j] = -1;
            }
        }
        double result = diceProb(n, 0);
        System.out.println(result);
    }
}