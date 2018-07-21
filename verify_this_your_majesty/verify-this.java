//V00898825 Hiebert, Tyrel
import java.util.*;
public class verify-this {
    static boolean[] a = new boolean[30000];  // row free?
    static boolean[] b = new boolean[30000];  // / diag free?
    static boolean[] c = new boolean[30000];  // \ diag free?
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        boolean correct = true;
        String[] input;
        for (int i=0; i<2*n+2; ++i) a[i] = b[i] = c[i] = true;
        for (int i = 0; i < n; i++) {
            input = in.nextLine().split(" ");
            if (!gen(Integer.parseInt(input[0]), Integer.parseInt(input[1]))) {
                correct = false;
            }
        }
        if (correct) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }

    static boolean gen ( int col , int row) {
        if (a[row] && b[row+col] && c[row-col+n]) { 
            a[row] = b[row+col] = c[row-col+n] = false;
        }
        else return false;
        return true;     
     }
}

// class QueenA {

//     static int[] x = new int[128];          // solution
//     static boolean[] a = new boolean[128];  // row free?
//     static boolean[] b = new boolean[128];  // / diag free?
//     static boolean[] c = new boolean[128];  // \ diag free?
//     static int count = 0;
//     static int N;
    
//     static void PrintSoln() {
//       ++count;
//       for (int i=0; i<N; ++i) System.out.print( x[i] );
//       System.out.println();
//     }
    
//     static void gen ( int col ) {
//        for ( int row = 0; row < N; ++row ) {
//           if (a[row] && b[row+col] && c[row-col+N]) { 
//              x[col] = row;
//              a[row] = b[row+col] = c[row-col+N] = false;
//              if (col < N-1) gen( col+1 ); else PrintSoln(); 
//              a[row] = b[row+col] = c[row-col+N] = true;
//           }
//        }      
//     }
    
//     public static void main( String[] args ) {
//        N = Integer.parseInt( args[0] );
//        for (int i=0; i<2*N+2; ++i) a[i] = b[i] = c[i] = true;
//        gen( 0 );
//        System.out.println( count );
//     }
    
//     }
