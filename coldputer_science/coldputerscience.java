import java.util.Scanner;
public class coldputerscience {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = Integer.parseInt(in.nextLine());
        int numNegative = 0;
        String[] values = in.nextLine().split(" ");
        for (int i = 0; i < numbers; i++) {
            if (Integer.parseInt(values[i]) < 0) numNegative++;
        }
        System.out.println("" + numNegative);
    }
}