/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

/**
 *
 * @author srivemul
 */
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/
public class HammingDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hammingDistanceMethod2(4, 1));
    }
     public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    public static int hammingDistanceMethod2(int x, int y) {
        int count = 0, n = x^y;
        while(n > 0) {
            count++;
            n = n & n-1;
        }
        return count;
    }

    
}
