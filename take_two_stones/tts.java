import java.util.*;
public class tts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.print("Bob");
        } else {
            System.out.print("Alice");
        }
    }
}