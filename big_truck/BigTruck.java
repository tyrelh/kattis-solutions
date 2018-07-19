//V00898825 Hiebert, Tyrel
import java.util.*;
public class BigTruck {

    static Scanner in = new Scanner(System.in);
    static int MAXVAL = 9999999;
    static int f_distance, f_items;
    static HashMap<Integer, Vertex> graph;

    public static void main(String[] args) {
        f_distance = MAXVAL;
        f_items = MAXVAL;
        int start = 1;
        int goal;
        graph = new HashMap<>();
        // get number of vertices
        int n = Integer.parseInt(in.nextLine());
        goal = n;
        // get list of items at each vertex
        String[] input = in.nextLine().split(" ");
        for (int i = 1; i < n+1; i++) {
            graph.put(i, new Vertex(i, Integer.parseInt(input[i-1])));
        }
        // get number of edges
        int m = Integer.parseInt(in.nextLine());
        // get edge values
        for (int i = 0; i < m; i++) {
            input = in.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int d = Integer.parseInt(input[2]);
            // build each edge in either direction
            Edge A = new Edge(b, d);
            Edge B = new Edge(a, d);
            graph.get(a).edges.add(A);
            graph.get(b).edges.add(B);
        }
        // set start vertex params
        graph.get(start).visited = true;
        graph.get(start).distance = 0;
        // traverse graph
        traverse(start, goal);
        // check goal status
        if (graph.get(n).distance == MAXVAL) {
            System.out.println("impossible");
        } else {
            System.out.println(f_distance + " " + f_items);
        }
    }
    static void traverse(int start, int goal) {
        // base case
        if (start == goal) {
            if (graph.get(start).distance < f_distance) {
                f_distance = graph.get(start).distance;
                f_items = graph.get(start).items;

            } else if (graph.get(start).distance == f_distance && graph.get(start).items > f_items) {
                f_items = graph.get(start).items;
            }
            return;
        }
        // iterate over each edge connected to current node
        // traverse recursively
        Iterator iter = graph.get(start).edges.iterator();
        while (iter.hasNext()) {
            Edge edge = (Edge)iter.next();
            if (!graph.get(edge.to).visited && (edge.distance + graph.get(start).distance) <= graph.get(edge.to).distance) {
                graph.get(edge.to).visited = true;
                graph.get(edge.to).items += graph.get(start).items;
                graph.get(edge.to).distance = edge.distance + graph.get(start).distance;
                traverse(graph.get(edge.to).index, goal);
                graph.get(edge.to).items -= graph.get(start).items;
                graph.get(edge.to).visited = false;
            }
        }
    }

    static class Vertex {
        List<Edge> edges;
        boolean visited;
        int index, items, distance;
        Vertex(int in, int it) {
            visited = false;
            this.items = it;
            this.index = in;
            distance = MAXVAL;
            edges = new ArrayList<>();
        }
    }
    static class Edge {
        int to, distance;
        Edge(int t, int d) {
            distance = d;
            to = t;
        }
    }
}