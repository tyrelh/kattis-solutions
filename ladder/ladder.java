import java.util.Scanner;
public class ladder {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int deg = Integer.parseInt(input[1]);
        double rad = (deg * Math.PI) / 180;
        int length = (int)(Math.ceil(h / Math.sin(rad)));
        System.out.println("" + length);
    }
}