import java.util.Scanner;
public class rbs {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        String binary = Integer.toBinaryString(x);
        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            result += Integer.parseInt(Character.toString(binary.charAt(i))) * Math.pow(2, i);
        }

        System.out.println("" + (int)result);
    }
}