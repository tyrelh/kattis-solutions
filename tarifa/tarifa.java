import java.util.Scanner;
public class tarifa {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int allotment = Integer.parseInt(in.nextLine());
        int numMonths = Integer.parseInt(in.nextLine());
        int totalUsed = 0;

        for (int i = 0; i < numMonths; i++) {
            totalUsed += Integer.parseInt(in.nextLine());
        }

        System.out.println((allotment * numMonths) + allotment - totalUsed);
    }
}