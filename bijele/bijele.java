import java.util.Scanner;
public class bijele {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] neededPieces = {1,1,2,2,2,8};
        String[] currentPieces = in.nextLine().split(" ");

        for (int i = 0; i < 6; i++) {
            neededPieces[i] -= Integer.parseInt(currentPieces[i]);
            System.out.print("" + neededPieces[i] + " ");
        }
    }
}