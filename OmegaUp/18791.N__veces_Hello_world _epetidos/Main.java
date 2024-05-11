
/*  ITESS-TICS 
 *  ICPC & TecNM & TopCoder constest  
 *  2024
 *  OmegaUp 18791.N__veces_Hello_world _epetidos
 *  Solucion by FJMP 
 *  javac  Main.java
 *  java Main < datos1.txt
 *  java Main < datos1.txt
 */

import java.util.*;
import java.io.*;

public class Main {
    // requiredd to read data
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // problem data, declare static
    private static int N;

    public static void main(String [] args) throws java.io.IOException {
        
        // Uncomment this block to test input data
        /*
        read();
        print();
        */
        
        
        // comment this if you want to test input data
        read();
        solve();


    }

    // method to read input data
    public static void read() throws java.io.IOException {
        // read input, one number
        N = Integer.parseInt(in.readLine());
    }

    // method to solve the problem
    public static void solve() { 
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(" hello world");
            }
            System.out.println(); 
        }
    }

    // method to verify input data
    public static void print() {
        System.out.println(N);
    }
}
