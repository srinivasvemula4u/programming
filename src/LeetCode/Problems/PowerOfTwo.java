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
Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }

    public boolean isPowerOfTwo2(int n) {
        return (Math.log10(n) / Math.log10(2)) % 1 == 0;
    }

}
