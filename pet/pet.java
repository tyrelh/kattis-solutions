import java.util.Scanner;
public class pet {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int contestants = 5;
        String[][] points = new String[contestants][4];

        for (int i = 0; i < contestants; i++) {
            String[] temp = in.nextLine().split(" ");
            points[i] = temp;
        }

        int[] finalScore = new int[contestants];
        for (int i = 0; i < contestants; i++) {
            for (int j = 0; j < 4; j++) {
                finalScore[i] += Integer.parseInt(points[i][j]);
            }
        }

        int maxScore = 0;
        int winner = 999;

        for (int i = 0; i < 5; i++) {
            if (finalScore[i] >= maxScore) {
                winner = i + 1;
                maxScore = finalScore[i];
            }
        }

        System.out.println("" + winner + " " + maxScore);
    }
}