import java.util.*;
public class ibem {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        while (cases-- > 0) {
            Queue<String> q = new LinkedList<>();
            int n = Integer.parseInt(in.nextLine());

            while (n-- > 0) {
                String next = in.nextLine();
                if (!(q.contains(next))) {
                    q.add(next);
                }
            }

            System.out.println("" + q.size());
        }
    }
}