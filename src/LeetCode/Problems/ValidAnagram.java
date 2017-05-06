/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author srivemul
 */
/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/
public class ValidAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
          return false;
         Map<Character,Integer> map = new HashMap<>();
         for(int i=0; i < s.length(); i++) {
             if(map.containsKey(s.charAt(i))) {
                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
             } else {
                 map.put(s.charAt(i),1);
             }
         }
          for(int i=0; i < t.length(); i++) {
             if(map.containsKey(t.charAt(i)) &&  map.get(t.charAt(i)) != 0) {
                 map.put(t.charAt(i),map.get(t.charAt(i))-1);
             } else {
                 return false;
             }
         }
         return true;
    }
    
}
