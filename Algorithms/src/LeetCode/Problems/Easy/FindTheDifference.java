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
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
 */
public class FindTheDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
            for (int i = 0; i < t.length(); i++) {
                if ((map.containsKey(t.charAt(i))) && (map.get(t.charAt(i)) > 0)) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else {
                    return t.charAt(i);
                }
            }

        }
        return ' ';
    }

    public char findTheDifference2(String s, String t) {
        // Initialize variables to store sum of ASCII codes for 
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
            charCodeS += (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            charCodeT += (int) t.charAt(i);
        }
        // Return the difference between 2 strings as char
        return (char) (charCodeT - charCodeS);
    }
    /*
    UPDATE:
  "1 optimization: As t.length() is just 1 character longer than s.length(), 
    we can use 1 pass to process both strings (20% better runtime performance)."
     */
    public char findTheDifference3(String s, String t) {
        int charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
              charCode -= (int)s.charAt(i);
              charCode += (int)t.charAt(i); 
        }
        return (char)charCode;
    }
}
