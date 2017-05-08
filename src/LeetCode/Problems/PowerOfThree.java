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
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */
public class PowerOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return (n > 0 && 1162261467 % n == 0);
    }

    public boolean isPowerOfThree2(int n) {
        return ((Math.log10(n) / Math.log10(3)) % 1 == 0);
    }

    public boolean isPowerOfThree3(int n) {
        return n == 0 ? false : (n == Math.pow(3, Math.round(Math.log(n) / Math.log(3))));
    }

}
