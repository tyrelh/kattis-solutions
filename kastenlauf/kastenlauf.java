
// V00898825 Hiebert, Tyrel
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class kastenlauf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cases = Integer.parseInt(in.nextLine());

        // try each case
        for (; cases > 0; cases--) {
            
            // number of stops, including origin and destination
            int numStores = Integer.parseInt(in.nextLine());

            // create arrays for coords
            int[] x = new int[numStores + 2];
            int[] y = new int[numStores + 2];
            // fill x and y arrays with coords
            for (int i = 0; i < numStores + 2; i++) {
                String[] line = in.nextLine().split(" ");
                x[i] = Integer.parseInt(line[0]);
                y[i] = Integer.parseInt(line[1]);
            }

            // Queue for locations reachable from current
            Queue<Integer> reachable = new LinkedList<>();
            //create a visited array
            boolean[] visited = new boolean[numStores + 2];

            // initial conditions
            reachable.add(0);
            String result = "sad"; // they start sad! oh no!
            int distance = 0;

            while (reachable.isEmpty() != true) {
                // move to next reachable location
                int current = reachable.remove();
                // check if at the destination
                if (current == numStores + 1) result = "happy";
                if (visited[current] != true) {
                    visited[current] = true;
                    for (int i = 0; i < numStores + 2; i++) {
                        // calc distance
                        distance = Math.abs(x[current] - x[i]) + Math.abs(y[current] - y[i]);
                        // if location is reachable
                        if (distance <= 1000 && distance != 0) reachable.add(i);
                    }
                }
            }

            // print whether destination is visited or not
            System.out.println(result);
        }
    }
}
