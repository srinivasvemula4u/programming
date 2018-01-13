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
Given a non-empty string check if it can be constructed by taking a substring of it 
and appending multiple copies of the substring together. You may assume the given string consists of 
lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.).
 */
 /*
***************************************************************************************
Solution Hint : 
The length of the repeating substring must be a divisor of the length of the input string
Search for all possible divisor of str.length, starting for length/2
If i is a divisor of length, repeat the substring from 0 to i the number of times i is contained in s.length
If the repeated substring is equals to the input str return true
 */
public class RepeatedSubstringPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int count = len / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }

            }
        }
        return false;
    }

    /* 
    Finding SubString length based on KMP prefix algorithm
     */
    public boolean repeatedSubstringPattern2(String s) {
        int[] prefix = kmp(s);
        int len = prefix[s.length() - 1];
        int n = s.length();
        return (len > 0 && n % (n - len) == 0);
    }

    private int[] kmp(String str) {
        int len = str.length();
        int[] prefix = new int[len];
        int i = 0, j = 1;
        prefix[0] = 0;
        while (i < len && j < len) {
            if (str.charAt(i) == str.charAt(j)) {
                prefix[j] = i + 1;
                i++;
                j++;
            } else if (i == 0) {
                prefix[j] = 0;
                j++;
            } else {
                i = prefix[i - 1];
            }
        }
        return prefix;
    }
}
