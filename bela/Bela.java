//V00898825 Hiebert, Tyrel
import java.util.*;
public class Bela {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Store card data
        int[][] values = {{11  ,4   ,3   ,20  ,10  ,14  ,0   ,0},
                          {11  ,4   ,3   ,2   ,10  ,0   ,0   ,0}};
        char[] cards =    {'A' ,'K' ,'Q' ,'J' ,'T' ,'9' ,'8' ,'7'};

        String[] input = in.nextLine().split(" ");
        int numCards = Integer.parseInt(input[0]) * 4;
        char dominantSuit = input[1].charAt(0);

        int score = 0;

        for (;numCards > 0; numCards--) {
            String card = in.nextLine();
            for (int i = 0; i < cards.length; i++) {
                if (card.charAt(0) == cards[i]) {
                    if (card.charAt(1) == dominantSuit) {
                        score += values[0][i];
                    } else {
                        score += values[1][i];
                    }
                }
            }
        }
        System.out.println("" + score);
    }
}