/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 */
public class ReverseWordsInSentence {

    public static String reverseWords(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int cur = 0, start = 0;
        StringBuilder sBuilder = new StringBuilder(str);
      
        str = sBuilder.reverse().toString();
          sBuilder.setLength(0);
        while (cur < str.length()) {
            if (str.charAt(cur) != ' ') {
                cur++;
            } else if (start != cur) {
                sBuilder.append(new StringBuilder(str.substring(start, cur)).reverse().toString() + " ");
                start = cur;
            } else {
                start++;
                cur++;
            }
        }
           sBuilder.append(new StringBuilder(str.substring(start, cur)).reverse().toString() + " ");
        return sBuilder.toString();
    }

    public static void main(String args[]) {
      String str = "This is a Career Monk String";
      System.out.println(reverseWords(str));
    }
}
