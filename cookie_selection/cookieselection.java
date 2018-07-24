
// v00898825 Hiebert, Tyrel
import java.util.*;

public class cookieselection {

    /* Here your underlying algorithm should be O(n log n).
     Try to solve this with a creative use of priority queues implemented as binary heaps.
     There is no need to write your own priority queue code;
     simply use the Java PriorityQueue class. */

    static Scanner in = new Scanner(System.in);

    // one queue reversed so that they both point to the middle
    static Queue<Integer> bottomBin = new PriorityQueue<>(Collections.reverseOrder());
    static Queue<Integer> topBin = new PriorityQueue<>();
    static int median = 0;

    public static void main(String[] args) {

        while (in.hasNext()) {
            String next = in.nextLine();
            if (next.equals("#")) {
                packageCookie();
            } else {
                queueCookie(next);
            }
        }
    }

    public static void packageCookie() {
        if (bottomBin.size() == topBin.size()) {
            System.out.println(topBin.poll());
        } else {
            System.out.println(bottomBin.poll());
        }
    }

    public static void queueCookie(String cookie) {
        Integer currentCookie = Integer.parseInt(cookie);
        // base case if there are no cookies in bin
        if (median == 0) {
            bottomBin.add(currentCookie);
            median = currentCookie;
        }
        // if new cookie is higher than the median
        else if (currentCookie > median) {
            topBin.add(currentCookie);
            if ((bottomBin.size() - topBin.size()) < 0) {
                median = topBin.poll();
                bottomBin.add(median);
            } 
        }
        // if new cookie is lower than the median
        else {
            bottomBin.add(currentCookie);
            if((bottomBin.size() - topBin.size()) > 1) {
                median = bottomBin.poll();
                topBin.add(median);
            }
        } 
    }
}