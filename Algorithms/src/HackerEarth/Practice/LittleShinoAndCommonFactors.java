/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerEarth.Practice;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
/*
Little Shino loves maths. Today her teacher gave her two integers. Shino is now wondering how many integers 
can divide both the numbers. She is busy with her assignments. Help her to solve the problem.

Input:
First line of the input file contains two integers, 
a
a and 
b
b.

Output:
Print the number of common factors of 
a
a and 
b
b.

Constraints:
 1
≤
a
,
b
≤
10
12
 */
public class LittleShinoAndCommonFactors {

    public static void main(String args[]) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */

        //Scanner
        Scanner s = new Scanner(System.in);
        //  int N = s.nextInt();

       
        long a = s.nextLong();
        long b = s.nextLong();
        //  }
        long n = gcd(a, b);

        // Count divisors of n.
        long result = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            // if 'i' is factor of n
            if (n % i == 0) {
                // check if divisors are equal
                if (n / i == i) {
                    result += 1;
                } else {
                    result += 2;
                }
            }
        }

        System.out.println(result);
    }

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
