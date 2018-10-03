import java.util.Scanner;
public class filip {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

        StringBuilder input2 = new StringBuilder();
        StringBuilder input3 = new StringBuilder();
        input2.append(input[0]);
        input3.append(input[1]);

        input2.reverse();
        input3.reverse();

        int one = Integer.parseInt(input2.toString());
        int two = Integer.parseInt(input3.toString());

        System.out.println(Math.max(one, two));
    }
}