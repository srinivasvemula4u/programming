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
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            flag = true;
        }
        num = Math.abs(num);
        while (num > 0) {
            sb.insert(0, num % 7 + "");
            num /= 7;
        }
        if (flag) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }

    public String convertTo7(int num) {
        if (num < 0) {
            return '-' + convertTo7(-num);
        }
        if (num < 7) {
            return num + "";
        }
        return convertTo7(num / 7) + num % 7;
    }

}
