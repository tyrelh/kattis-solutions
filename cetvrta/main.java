// V00898825 Hiebert, Tyrel

import java.util.*;

public class main {
    static private Scanner in = new Scanner(System.in);

    public static void main (String[] args) {
        int[] x = new int[3];
        int[] y = new int[3];

        int currentX, currentY, finalX, finalY;

        for (int i = 0; i < 3; i++) {
            String[] input = in.nextLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        if (x[0] == x[1]) {
            finalX = x[2];
        } else if (x[1] == x[2]) {
            finalX = x[0];
        } else finalX = x[1];

        if (y[0] == y[1]) {
            finalY = y[2];
        } else if (y[1] == y[2]) {
            finalY = y[0];
        } else finalY = y[1];

        System.out.println("" + finalX + " " + finalY);
    }
}
