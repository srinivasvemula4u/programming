/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
Implement int sqrt(int x).

Compute and return the square root of x.
 */
 /* Solution Hint : Quite a few people used Newton already, but I didn't see someone make it this short. 
ame solution in every language. Explanation under the solutions.
 */
public class SquareRootOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }

}
