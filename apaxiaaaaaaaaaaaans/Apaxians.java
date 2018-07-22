//V00898825 Hiebert, Tyrel
import java.util.*;
public class Apaxians {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int strlen = input.length();
        for (int i = 0; i < strlen; i++) {
            if (i == strlen - 1 ||input.charAt(i) != input.charAt(i + 1)) {
                System.out.print(input.charAt(i));
            }
        }
    }
}