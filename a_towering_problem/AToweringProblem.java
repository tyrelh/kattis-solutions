// V00898825 Hiebert, Tyrel

import java.util.*;

public class AToweringProblem {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main (String[] args) {
        String[] input = in.nextLine().split(" ");
        int h1, h2;
        h1 = Integer.parseInt(input[input.length-2]);
        h2 = Integer.parseInt(input[input.length-1]);
        int[] values = new int[6];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(input[i]);
        }

        int[] h1values = new int[3];
        int[] h2values = new int[3];

        for (int a = 0; a < 6; ++a) {
            for (int b = 0; b < a; ++b) {
                for (int c = 0; c < b; ++c) {
                    if ((values[a] + values[b] + values[c]) == h1) {
                        h1values[0] = values[a];
                        h1values[1] = values[b];
                        h1values[2] = values[c];
                    } else if ((values[a] + values[b] + values[c]) == h2) {
                        h2values[0] = values[a];
                        h2values[1] = values[b];
                        h2values[2] = values[c];;
                    }
                }
            }
        }
        Arrays.sort(h1values);
        Arrays.sort(h2values);

        for (int i = 2; i >= 0; i--) {
            System.out.print("" + h1values[i] + " ");
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print("" + h2values[i] + " ");
        }
    }
}