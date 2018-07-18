//V00898825 Hiebert, Tyrel
import java.util.*;
public class kornislav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] arr = new int[4];
        arr[0] = Integer.parseInt(input[0]);
        arr[1] = Integer.parseInt(input[1]);
        arr[2] = Integer.parseInt(input[2]);
        arr[3] = Integer.parseInt(input[3]);

        Arrays.sort(arr);
        int result = arr[0] * arr[2];
        System.out.println("" + result);
    }
}
