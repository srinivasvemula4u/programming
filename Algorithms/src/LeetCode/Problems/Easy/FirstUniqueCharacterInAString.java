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
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */
public class FirstUniqueCharacterInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(firstUniqCharUsingMap("loveleetcode"));
    }

    /*
    Using Java API
     */
    public int firstUniqChar(String s) {

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i])) {
                return i;
            }
        }
        return -1;
    }

    /*
    The idea is to use a slow pointer to point to the current unique character and a fast pointer to scan the string. 
    The fast pointer not only just add the count of the character. Meanwhile, when fast pointer finds the 
    identical character of the character at the current slow pointer, 
    we move the slow pointer to the next unique character or not visited character. (20 ms)
     */
    public int firstUniqCharUsingFastAndSlowPointer(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int len = s.length();
        if (len == 1) {
            return 0;
        }
        char[] cc = s.toCharArray();
        int slow = 0, fast = 1;
        int[] count = new int[256];
        count[cc[slow]]++;
        while (fast < len) {
            count[cc[fast]]++;
            // if slow pointer is not a unique character anymore, move to the next unique one
            while (slow < len && count[cc[slow]] > 1) {
                slow++;
            }
            if (slow >= len) {
                return -1; // no unique character exist
            }
            if (count[cc[slow]] == 0) { // not yet visited by the fast pointer
                count[cc[slow]]++;
                fast = slow; // reset the fast pointer
            }
            fast++;
        }
        return slow;
    }

    /*
   1) Get the frequency of each character.
    2) Get the first character that has a frequency of one.
     */
    public int firstUniqCharStraightForward(String s) {
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharUsingMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
