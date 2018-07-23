// V00898825 Hiebert, Tyrel
import java.util.*;
public class baconeggsspam {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        while (n != 0) {
            TreeMap<String, TreeSet<String>> container = new TreeMap<>();
            // get all data for the day
            for (int i = 0; i < n; i++) {
                // read next line
                String[] input = in.nextLine().split(" ");
                for (int j = 1; j < input.length; j++) {
                    // key (food) is in treemap, add value (name) to treeset
                    if (container.containsKey(input[j])) {
                        // add name to food key j
                        container.get(input[j]).add(input[0]);
                    }
                    // if key (food) is not in treemap, add key (food), then add value (name) to new key
                    else {
                        TreeSet<String> tempSet = new TreeSet<>();
                        tempSet.add(input[0]);
                        container.put(input[j], tempSet);
                    }
                }
                // go to next line
            }
            // print the keys (foods) in natural order along with the treeset values (people)
            // for each key (food)
            Set<String> keys = container.keySet();
            for(String key: keys){
                // print key (food)
                System.out.print(key);
                // print all values (names) associated with key (food)
                TreeSet<String> people = container.get(key);
                for (String person: people) {
                    System.out.print(" " + person);
                }
                System.out.println("");
            }
            System.out.println("");
            n = Integer.parseInt(in.nextLine());
        }
    }
}
