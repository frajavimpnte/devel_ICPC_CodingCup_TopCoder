
/*  ITESS-TICS 
 *  ICPC & TecNM & TopCoder constest  
 *  10/05/2024
 *  2023_ICPC maratona_en.pdf
 *  Problem A. Amusement Park Adventure
 *  Solucion by FJMP 
 *  javac  A.java
 *  java A < datos1.txt
 *  java A < datos1.txt
 */

import java.util.*;
import java.io.*;

public class A {
    // requiredd to read data
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // problem data, declare static
    private static int N;               // Number of rides in the park
    private static int rides[];         // Array of minimun on each ride
    private static int H;               // Carlito's height
    private static int carlitosRides;   // Rides Carlito's can take

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
        // read input first line
        String s = in.readLine();           // read fisrtline
        String[] sArr = s.split(" ");       // split line by spance " "
        
        N = Integer.parseInt(sArr[0]);      // number of rides
        H = Integer.parseInt(sArr[1]);      // Carlito's height

        // read input, second line
        rides = new int[N];               // save N minimal height

        s = in.readLine();                  // read ride minimal's height
        sArr = s.split(" ");        
        for(int i=0; i < N; i++) {
            rides[i] = Integer.parseInt(sArr[i]);
        }
    }

    // method to solve the problem
    public static void solve() {         
        // for each ride minimal's height compare with height Carlito's 
        for (int i = 0; i < N; i++) {  
            if (rides[i] <= H ) 
                carlitosRides++;
        }
        // print ouput
        System.out.println(carlitosRides);
    }

    // method to verify input data
    public static void print() {
        System.out.println(N);
    }
}
