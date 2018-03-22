/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillenza.com;

import java.util.Scanner;

/**
 *
 * @author sv186040 Consider the following algorithm:
 *
 * input n
 *
 * print n
 *
 * if n = 1 then STOP
 *
 * if n is odd then: n ← 3n + 1
 *
 * else: n ← n/2
 *
 * GOTO 2
 *
 * Suppose n is 20. The following sequence is printed: 20, 10, 5, 16, 8, 4, 2
 * and 1.
 *
 * It’s known that the sequence will terminate with 1 being the last digit for
 * all integers up to at least 2^60.
 *
 * The number of numbers printed including the 1 for a given n is referred to as
 * the cyclelength of n.
 *
 * In above example, the cycle length of 20 is 8.
 *
 * Given a number b > 1, determine the maximum cycle length of all numbers
 * between 1 and b inclusive.
 *
 * Input
 *
 * The first line of input contains an integer T which is the number of test
 * cases. Then T lines follow containing two space-separated integers 1 and b
 * where 1 < b < 10^5
 *
 * Output
 *
 * For each test case print out, in different lines, the maximum cycle length.
 *
 * Constraints
 *
 * 0 < T < 1000
 *
 * 0 < n,b < 100000
 *
 * Sample Input
 *
 * 2
 * 1 10 1 8 Sample Output
 *
 * 20 17
 *
 * Sample stdin 1 2 1 10 1 8 Sample stdout 1 20 17
 */
public class CollatingTrouble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int maxCycleLen = 0;
            int n = scan.nextInt();
            int b = scan.nextInt();
            while (n <= b) {
                int cycleLen = findCycle(n);
                if (cycleLen > maxCycleLen) {
                    maxCycleLen = cycleLen;
                }
                n++;
            }
            System.out.println(maxCycleLen);
        }

    }

    private static int findCycle(int n) {
        int count = 0;
        do {
            count++;
            if (n == 1) {
                return count;
            }
            if (n % 2 != 0) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
        } while (n > 0);

        return count;
    }
}
