// V00898825 Hiebert, Tyrel

import java.util.*;

public class odd_man_out {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main (String[] args) {
        int cases = Integer.parseInt(in.nextLine());
        for (int a = 0; a < cases; a++) {
            // key = num, value = repeats
            TreeMap<Integer, Boolean> map = new TreeMap();
            int n = Integer.parseInt(in.nextLine());
            String[] input = in.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                int j = Integer.parseInt(input[i]);
                if (map.containsKey(j)) {
                    map.replace(j, true);
                } else {
                    map.put(j, false);
                }
            }
            Set<Integer> keys = map.keySet();

            int j = a + 1;
            for(Integer key : keys) {
                if (map.get(key) == false) System.out.println("Case #" + j + ": " + key);
            }

        }
    }
}