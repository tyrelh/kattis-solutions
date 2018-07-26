import java.util.Scanner;
public class autori {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = in.nextLine().split("-");
        
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].charAt(0));
        }
    }
}