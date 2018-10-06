import java.util.*;
public class icpc {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int competitors = Integer.parseInt(in.nextLine());
        Queue<String> schools = new LinkedList<>();
        Queue<String> teams = new LinkedList<>();

        while(competitors-- > 0) {
            String[] input = in.nextLine().split(" ");
            if (!(schools.contains(input[0]))) {
                schools.add(input[0]);
                teams.add(input[1]);
            }
            if (schools.size() == 12) competitors = 0;
        }

        for(int i = 0; i < 12; i++) {
            System.out.println(schools.remove() + " " + teams.remove());
        }

    }
}