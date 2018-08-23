import java.util.Scanner;
public class spavanac {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] time = in.nextLine().split(" ");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        minutes -= 45;
        if (minutes < 0) {
            minutes = 60 + minutes;
            hours--;
        }
        if (hours < 0) {
            hours = 23;
        }
        
        System.out.println("" + hours + " " + minutes);
    }
}