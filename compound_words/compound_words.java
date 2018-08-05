
// V00898825 Hiebert, Tyrel

import java.util.*;

public class compound_words {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet();
        TreeMap<Integer, String> map = new TreeMap();
        int n = 0;

        while (in.hasNext()) {
            String[] input = in.nextLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                n++;
                map.put(n, input[i]);
                if (debug) System.out.println("Word to add: " + input[i] + " n = " + n);
                
            }
        }
        StringBuilder result = new StringBuilder();
        
        Set<Integer> keys = map.keySet();
        while (n>0) {
            

            for(Integer key : keys) {

                if (n != key) {
                    StringBuilder word = new StringBuilder();
                    if (debug) System.out.println("This word :" + map.get(n) + " plus this word:" + map.get(key));
                    word.append(map.get(n));
                    word.append(map.get(key));
                    if (debug) System.out.println("Result word: " + word.toString());
                    set.add(word.toString());
                    if (debug) System.out.println("Current number of combinations: " + set.size());
                }
            }
            n--;
        }
        int i = set.size();
        while(i-->0) {
            
            result.append(set.pollFirst());
            if (debug) System.out.println("" + i);
            if (i != 0) {
                result.append("\n");
            }
        }

        System.out.println(result);

    }
}

/*
* @author Tyrel Hiebert
*/
class Node {
    private int data;
    private Node next;

    Node() {
    }

    Node(int d) {
        data = d;
    }

    Node(int d, Node n) {
        data = d;
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }
}