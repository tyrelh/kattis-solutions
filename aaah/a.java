import java.util.Scanner;
public class a {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        if (second.length() <= first.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}