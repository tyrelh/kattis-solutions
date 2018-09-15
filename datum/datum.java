import java.util.*;

public class datum {
    static private Scanner in = new Scanner(System.in);
    static private Boolean debug = false;

    public static void main (String[] args) {
        String[] input = in.nextLine().split(" ");
        int d = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int offset = 3;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfYear = 0;

        for (int i = 0; i < m - 1; i++) {
            dayOfYear += monthLength[i];
        }

        dayOfYear = dayOfYear + d + offset;

        int dayOfWeek = dayOfYear % 7;

        System.out.println(days[dayOfWeek]);
    }
}
