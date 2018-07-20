import java.util.*;
public class abc {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        String order = in.nextLine();

        for (int i = 0; i < 3; i++) {
            if (order.charAt(i) == 'A') {
                System.out.print("" + nums[0] + " ");
            } else if (order.charAt(i) == 'B') {
                System.out.print("" + nums[1] + " ");
            } else {
                System.out.print("" + nums[2] + " ");
            }
        }
    }
}