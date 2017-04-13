/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author srivemul
 */
/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */
public class ReverseVowelsOfAString {

    /**
     * @param args the command line arguments
     */
    public String reverseVowels(String s) {
        char[] list = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0, j = list.length - 1; i < j;) {
            if (!set.contains(list[i])) {
                i++;
                continue;
            }
            if (!set.contains(list[j])) {
                j--;
                continue;
            }
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }

    public static void main(String[] args) {
        // TODO code application logic here...
    }

}
