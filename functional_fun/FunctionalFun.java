//V00898825 Hiebert, Tyrel
import java.util.*;
public class FunctionalFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            TreeMap<String, Integer> domain = new TreeMap();
            TreeMap<String, Integer> codomain = new TreeMap();

            // get domain
            String[] domain_input = in.nextLine().split(" ");
            for (int i = 1; i < domain_input.length; i++) {
                domain.put(domain_input[i], 0);
            }

            // get codomain
            String[] codomain_input = in.nextLine().split(" ");
            for (int i = 1; i < codomain_input.length; i++) {
                codomain.put(codomain_input[i], 0);
            }

            boolean injective = true;
            boolean surjective = true;
            boolean function = true;

            // read mappings
            int num_mappings = Integer.parseInt(in.nextLine());
            for (int i = 0; i < num_mappings; i++) {
                String[] mapping = in.nextLine().split(" ");
                String a = mapping[0];
                String b = mapping[2];
                if (domain.containsKey(a)) {
                    if (codomain.containsKey(b)) {
                        codomain.put(b, codomain.get(b) + 1);
                        domain.put(a, domain.get(a) + 1);
                    }
                    else {
                        function = false;
                    }
                } else {
                    function = false;
                }
            }

            Set<String> keys = codomain.keySet();
            for (String key : keys) {
                if (codomain.get(key) == 0) {
                    surjective = false;
                }
                else if (codomain.get(key) > 1) {
                    injective = false;
                }
            }
            keys = domain.keySet();
            for (String key : keys) {
                if (domain.get(key) > 1) {
                    function = false;
                }
            }

            if (function && surjective && injective) {
                System.out.println("bijective");
            }
            else if (function && surjective) {
                System.out.println("surjective");
            }
            else if (function && injective) {
                System.out.println("injective");
            }
            else if (function) {
                System.out.println("neither injective nor surjective");
            }
            else {
                System.out.println("not a function");
            }
        }
    }
}