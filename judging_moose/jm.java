import java.util.Scanner;
public class jm {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int left = Integer.parseInt(input[0]);
        int right = Integer.parseInt(input[1]);
        String same = "Even";
        int age = 999;

        if (left != right) same = "Odd";

        if (left == 0 & right == 0) {
            System.out.println("Not a moose");
        }
        else if (left > right) {
            System.out.println(same + " " + left * 2);
        } else {
            System.out.println(same + " " + right * 2);
        }
    }
}