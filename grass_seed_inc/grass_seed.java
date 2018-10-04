import java.util.Scanner;
import java.text.DecimalFormat;
public class grass_seed {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = Double.parseDouble(in.nextLine());
        int numLawns = Integer.parseInt(in.nextLine());
        double totalCost = 0;

        while(numLawns-- > 0) {
            String[] dimentions = in.nextLine().split(" ");
            double squareFeet = Double.parseDouble(dimentions[0]) * Double.parseDouble(dimentions[1]);
            totalCost += squareFeet * cost;
        }

        DecimalFormat df = new DecimalFormat("0.0000000");
        System.out.println("" + df.format(totalCost));
    }
}