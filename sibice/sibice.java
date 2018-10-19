import java.util.Scanner;

public class sibice {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] firstLine = in.nextLine().split(" ");
        int cases = Integer.parseInt(firstLine[0]);
        double maxLength = Math.sqrt(Math.pow(Double.parseDouble(firstLine[1]), 2)
            + Math.pow(Double.parseDouble(firstLine[2]), 2));
        while(cases-- > 0) {
            if (Integer.parseInt(in.nextLine()) <= maxLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}