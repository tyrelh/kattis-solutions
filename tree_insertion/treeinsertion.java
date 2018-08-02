//V00898825 Hiebert, Tyrel
import java.util.*;
import java.math.BigInteger;

public class treeinsertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(in.nextLine());
            if (n == 0) break;
            String[] input = in.nextLine().split(" ");
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = Integer.parseInt(input[i]);
            }

            Node tree = createTree(n, values);

            Pascal bleh = new Pascal();
            BigInteger result = bleh.traverse(tree);
            System.out.println(result.toString());
        }
    }
    public static Node createTree(int n, int[] v) {
        Node tree = new Node(v[0]);
        for (int i = 1; i < n; i++) {
            tree.add(v[i]);
        }
        return tree;
    }
}

class Pascal {
    int[][] triangle = new int[101][101];
    Pascal() {}
    BigInteger traverse(Node n) {
        //int num = 0;
        if (n.getLeft() == null && n.getRight() == null) {
            return BigInteger.valueOf(1);
        }
        if (n.getLeft() != null && n.getRight() == null) {
            return traverse(n.getLeft());
        }
        if (n.getLeft() == null && n.getRight() != null) {
            return traverse(n.getRight());
        }
        else {
            BigInteger multiplier, numerator, denominator;
            multiplier = traverse(n.getLeft()) .multiply (traverse(n.getRight())); // Tl * Tr
            numerator = fac(n.getLeft().getSize() + n.getRight().getSize()); // (l + r)!
            denominator = fac(n.getLeft().getSize()).multiply(fac(n.getRight().getSize())); // l! * r!
            return multiplier.multiply(numerator.divide(denominator));
        }
    }
    public static BigInteger fac(int x) {
        BigInteger result = BigInteger.valueOf(1);
        if (x <= 1) return result;
        BigInteger q = BigInteger.valueOf(x);
        BigInteger new_result = q.multiply(fac(x - 1));
        return new_result;
    }
}

class Node {
    BigInteger data;
    Node leftChild = null;
    Node rightChild = null;
    int size = 0;
    Node() {}
    Node(int d) {
        data = BigInteger.valueOf(d);
        size = 1;
    }
    void setData(int d) {
        data = BigInteger.valueOf(d);
    }
    int getSize() {
        return size;
    }
    void iterateSize() {
        size++;
    }
    Node getLeft() {
        return leftChild;
    }
    Node getRight() {
        return rightChild;
    }
    BigInteger getData() {
        return data;
    }
    void add(int d) {
        this.iterateSize();
        BigInteger bigD = BigInteger.valueOf(d);
        if (bigD.compareTo(data) < 0) { // d < data
            if (leftChild != null) {
                leftChild.add(d);
            } else {
                leftChild = new Node(d);
            }
        } else {
            if (rightChild != null) {
                rightChild.add(d);
            } else {
                rightChild = new Node(d);
            }
        }
    }
}