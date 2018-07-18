//V00898825 Hiebert, Tyrel
import java.util.*;
public class Arbitrage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currencies = Integer.parseInt(in.nextLine());

        while(currencies > 0) {
            String[] codes = in.nextLine().split(" ");
            int num_currency_pairs = Integer.parseInt(in.nextLine());
            String[][] currency_pairs = new String[num_currency_pairs][2];
            double[] weights = new double[num_currency_pairs];
            for (int i = 0; i < num_currency_pairs; i++) {
                String[] pair = in.nextLine().split(" ");
                currency_pairs[i][0] = pair[0];
                currency_pairs[i][1] = pair[1];
                String[] temp = pair[2].split(":");
                weights[i] = calcWeight(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
            
            if (BellmanFord(codes, currency_pairs, weights, num_currency_pairs)) {
                System.out.println("Ok");
            } else {
                System.out.println("Arbitrage");
            }
            currencies = Integer.parseInt(in.nextLine());
        }
    }
    public static boolean BellmanFord(String[] vertices, String[][] edges, double[] weights, int num_edges) {
        HashMap<String, Double> dist = new HashMap<>();

        for (int k = 0; k < vertices.length; k++) {

            // initialize distances
            for (int i = 0; i < vertices.length; i++) {
                double inf = Double.POSITIVE_INFINITY;
                dist.put(vertices[i], inf);
            }
            dist.put(vertices[k], (double)0);

            // relax edges n-1 times
            for (int i = 0; i < vertices.length - 1; i++) {
                for (int j = 0; j < num_edges; j++) {
                    if (dist.get(edges[j][0]) + weights[j] < dist.get(edges[j][1])) {
                        dist.put(edges[j][1], dist.get(edges[j][0]) + weights[j]);
                    }
                }
            }

            // check for negative-weight cycles
            for (int j = 0; j < num_edges; j++) {
                if (dist.get(edges[j][0]) + weights[j] < dist.get(edges[j][1])) {
                    return false;
                }
            }

        }
        return true;
    }

    public static double calcWeight(int a, int b) {
        return -(Math.log( (double)b / a));
    }
}
