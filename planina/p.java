import java.util.Scanner;
public class p {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int baseCase = 2;
        int solution = baseCase * 2;

        if (num != 0) {
            int side = (baseCase * baseCase) - 1;
            for (int i = 0; i < num; i++) {
                solution = side * side;
                side = (side * 2) - 1;
            }
        }
        System.out.print("" + solution);
    }
}