import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        while (cases >= 0) {
            int distance = 0;
            int previousTime = 0;
            int currentTime = 0;
            for (int i = 0; i < cases; i++) {
                String[] temp = in.nextLine().split(" ");
                int speed = Integer.parseInt(temp[0]);
                currentTime = Integer.parseInt(temp[1]) - previousTime;
                distance += currentTime * speed;
                previousTime = Integer.parseInt(temp[1]);
            }
            System.out.println(distance + " miles");
            cases = Integer.parseInt(in.nextLine());

        }
    }
}