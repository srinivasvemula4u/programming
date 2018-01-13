/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author srivemul
 */
/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
 /* Solution hint :
  we can simply adapt the Floyd Cycle detection algorithm
 */
public class HappyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n != 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int squareSum = 0;
            while (n > 0) {
                squareSum = squareSum + ((n % 10) * (n % 10));
                n = n / 10;
            }
            if (squareSum == 1) {
                return true;
            }
            n = squareSum;
        }
        return false;
    }

}
