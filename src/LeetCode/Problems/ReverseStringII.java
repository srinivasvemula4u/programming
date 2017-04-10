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
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting 
from the start of the string. If there are less than k characters left, reverse all of them. 
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
 */
public class ReverseStringII {

    /**
     * @param args the command line arguments
     */
    public String reverseStr(String s, int k) {
        //  String[] tokens = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < s.length(); i += k) {
            if (flag) {
                if (i + k - 1 < s.length()) {
                    for (int j = i + k - 1; j >= i; j--) {
                        sb.append(s.charAt(j));
                    }
                } else {
                    for (int j = s.length() - 1; j >= i; j--) {
                        sb.append(s.charAt(j));
                    }
                }
                flag = false;
            } else {
                if (i + k - 1 < s.length()) {
                    for (int j = i; j <= i + k - 1; j++) {
                        sb.append(s.charAt(j));
                    }
                } else {
                    for (int j = i; j < s.length(); j++) {
                        sb.append(s.charAt(j));
                    }
                }

                flag = true;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
