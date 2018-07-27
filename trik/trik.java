import java.util.Scanner;
public class trik {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int[] location = {1,0,0};

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                int temp = location[0];
                location[0] = location[1];
                location[1] = temp;
            } else if (input.charAt(i) == 'B') {
                int temp = location[1];
                location[1] = location[2];
                location[2] = temp;
            } else if (input.charAt(i) == 'C') {
                int temp = location[0];
                location[0] = location[2];
                location[2] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (location[i] == 1) {
                System.out.println(i + 1);
            }
        }
    }
}