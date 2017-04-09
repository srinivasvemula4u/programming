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
Given a string, you need to reverse the order of characters in each word within a sentence while 
still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsInString {

    /**
     * @param args the command line arguments
     */
    public String reverseWords(String s) {
        String[] tokens = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            revString(tokens[i], sb);
            if (i != tokens.length - 1) {
                sb.append(' ');
            }

        }
        return sb.toString();
    }

    public void revString(String str, StringBuilder sb) {
        for (int j = str.length() - 1; j >= 0; j--) {
            sb.append(str.charAt(j));
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
