// V00898825 Hiebert, Tyrel

import java.util.*;

public class bishops {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main (String[] args) {
        while(in.hasNext()) {
            int n = Integer.parseInt(in.nextLine());
            int result = 0;
            if (n == 1) result = 1;
            else result = n + (n-2);
            System.out.println("" + result);
        }
    }
}