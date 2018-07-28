import java.util.Scanner;

public class nasty_hacks {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        while (cases-- > 0) {
            int adRevenue, noAdRevenue, adCost;
            String[] temp = in.nextLine().split(" ");
            noAdRevenue = Integer.parseInt(temp[0]);
            adRevenue = Integer.parseInt(temp[1]);
            adCost = Integer.parseInt(temp[2]);

            if ((adRevenue - adCost) > noAdRevenue) {
                System.out.println("advertise");
            } else if (noAdRevenue > (adRevenue - adCost)) {
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }

}