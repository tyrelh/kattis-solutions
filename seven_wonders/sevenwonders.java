import java.util.Scanner;
public class sevenwonders {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int numT = 0;
        int numC = 0;
        int numG = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'T') { numT++; }
            else if (input.charAt(i) == 'C') { numC++; }
            else { numG++; }
        }

        int result = (int)(Math.pow(numT, 2) + Math.pow(numC, 2) + Math.pow(numG, 2));
        int min = Math.min(Math.min(numT, numC), numG);
        if (min > 0) {
            result += min * 7;
        }

        System.out.println("" + result);
    }
}