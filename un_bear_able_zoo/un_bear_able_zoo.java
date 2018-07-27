
// V00898825 Hiebert, Tyrel

import java.util.*;

public class un_bear_able_zoo {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main (String[] args) {

        int c = 0;

        while (in.hasNext()) {

            int n = Integer.parseInt(in.nextLine());

            if (n != 0) {

                c++;
                TreeMap<String, Integer> data = new TreeMap();

                for(int i = 0; i < n; i++) {
                    String[] input = in.nextLine().split(" ");
                    String animal = input[input.length - 1].toLowerCase();
                    if (data.containsKey(animal)) {
                        int j = data.get(animal);
                        j++;
                        data.put(animal, j);

                    } else {
                        data.put(animal, 1);
                    }
                }

                System.out.println("List " + c + ":");
                Set<String> keys = data.keySet();
                for (String animal : keys) {
                    System.out.println(animal + " | " + data.get(animal));
                }
            }

        }
        
    }
}