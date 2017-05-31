/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeFight.ArcadeUniverse;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author srivemul
 */
/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    boolean checkPalindrome(String inputString) {
        if (inputString.length() == 1) {
            return true;
        }
        for (int i = 0, j = inputString.length() - 1; i < j; i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    boolean checkPalindrome2(String inputString) {
        StringBuilder reverse = new StringBuilder();
        inputString.chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(reverse::append);
        return inputString.equals(reverse.toString());
    }

}
