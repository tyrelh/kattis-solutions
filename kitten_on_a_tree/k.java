// V00898825 Hiebert. Tyrel
import java.util.Scanner;

public class k {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cat = in.nextInt();
        in.nextLine();
        int[] tree = new int[101];

        int root = cat;
        String[] line;
        while (true) {
            line = in.nextLine().split(" ");
            root = Integer.parseInt(line[0]);
            
            if (root == -1) {
                break;
            }

            int branch;
            for (int i = 1; i < line.length; i++) {
                branch = Integer.parseInt(line[i]);
                tree[branch] = root;
            }
        }

        int pos = cat;
        while (pos != 0) {
            System.out.print(pos + " ");
            pos = tree[pos];
        }
    }
}