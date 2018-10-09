// Hiebert, Tyrel

import java.util.*;

public class no_dup {
    
    static private Scanner in = new Scanner(System.in);

    public static void main (String[] args) {

        String[] input = in.nextLine().split(" ");
        TreeSet<String> data = new TreeSet<>();
        boolean result = false;

        for (int i = 0; i < input.length; i++) {
            if (data.contains(input[i])) {
                result = true;
            } else {
                data.add(input[i]);
            }            
        }

        System.out.println(result ? "no" : "yes");
    }
}