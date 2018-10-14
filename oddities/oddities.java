import java.util.Scanner;
public class oddities {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = Integer.parseInt(in.nextLine());

        while (cases-- > 0) {
            int num = Integer.parseInt(in.nextLine());
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }
}