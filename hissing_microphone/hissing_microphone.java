import java.util.Scanner;
public class hissing_microphone {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char s = 's';
        String result = "no hiss";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == s && word.charAt(i + 1) == s) {
                result = "hiss";
            }
        }
        System.out.println(result);
    }
}