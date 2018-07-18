
// V00898825 Hiebert, Tyrel

import java.util.*;

public class Weak_Vertices {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;
    static int[][] adjMatrix;
    static boolean[] triangle;
    

    public static void main(String[] args) {
        while (in.hasNext()) {
            int n = Integer.parseInt(in.nextLine());
            if (n >= 0) {
                adjMatrix = new int[n][n];
                triangle = new boolean[n];

                for (int i = 0; i < n; i++) {
                    String[] input = in.nextLine().split(" ");
                    for (int j = 0; j < n; j++) {
                        adjMatrix[i][j] = Integer.parseInt(input[j]);
                        if (debug) System.out.print("" + Integer.parseInt(input[j]) + " ");
                    }
                    if (debug) System.out.println();
                }

                TreeSet<Integer> set = new TreeSet();
                for (int i = 0; i < n; ++i) {
                    for (int r = 0; r < i; ++r) {
                        for (int c = 0; c < r; ++c) {

                            if ((adjMatrix[i][r] == 1 && adjMatrix[r][c] == 1 && adjMatrix[c][i] == 1)) {
                                triangle[i] = true;
                                triangle[r] = true;
                                triangle[c] = true;
                            }
                        }
                    }
                }

                StringBuilder result = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    if (!triangle[i]) {
                        result.append(i);
                        result.append(" ");
                    }
                }

                //result.deleteCharAt(result.length() - 1);

                System.out.println(result);
            }
        }
    }
}