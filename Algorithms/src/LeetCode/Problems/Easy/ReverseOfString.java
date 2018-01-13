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
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

*/
public class ReverseOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
         for (int j = s.length() - 1; j >= 0; j--) {
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }
    
}
