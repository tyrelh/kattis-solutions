import java.util.Scanner;
public class fizzbuzz {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        
        for (int i = 1; i < n + 1; i++) {
            if (i % x == 0) {
                System.out.print("Fizz");
                if (i % y == 0) {
                    System.out.print("Buzz");
                }
            }
            else if (i % y == 0) {
                System.out.print("Buzz");
            }
            else {
                System.out.print("" + i);
            }
            System.out.println();
        }
    }
}