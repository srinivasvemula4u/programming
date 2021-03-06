/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author srivemul
 */
/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest 
palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int longestPalindrome(String s) {
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                maxLen += 2;
                map.remove(s.charAt(i));
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        if (!map.isEmpty()) {
            maxLen += 1;
        }
        return maxLen;
    }

}
