/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates =0, 
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul Given a set of character CHARS and input string iNPUT,
 * findthe maximum windown in str which will contain all the characters in chars
 * in complexity O(n) for exqmple Input = ABBACBAA, and char = AAB has the
 * minimum window BAA.
 */
public class MinWindowSliding {

    public static String minWindowSliding(String input, String characters) {
        int charLength = characters.length();
        int inputLength = input.length();
        int[] needToFind = new int[256];
        for (int i = 0; i < charLength; i++) {
            needToFind[characters.charAt(i)]++;
        }
        int[] hasFound = new int[256];
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0, minWindowEnd = 0;
        int count = 0;
        for (int begin = 0, end = 0; end < inputLength; end++) {
            if (needToFind[input.charAt(end)] == 0) {
                continue;
            }
            hasFound[input.charAt(end)]++;
            if (hasFound[input.charAt(end)] <= needToFind[input.charAt(end)]) {
                count++;
            }
            if (count == charLength) {
                while (needToFind[input.charAt(begin)] == 0 || (hasFound[input.charAt(begin)] > needToFind[input.charAt(begin)])) {
                    if (hasFound[input.charAt(begin)] > needToFind[input.charAt(begin)]) {
                        hasFound[input.charAt(begin)]--;
                    }
                    begin++;
                }
                int windowLen = end - begin + 1;
                if (windowLen < minWindowLength) {
                    minWindowLength = windowLen;
                    minWindowStart = begin;
                    minWindowEnd = end;
                }
                if(minWindowLength == charLength) {
                     return input.substring(minWindowStart,minWindowEnd+1);
                }
               
            }
        }
        return input.substring(minWindowStart,minWindowEnd+1);
    }
      public static void main(String args[]) {
       // String str = "ABCCBCBA";
       System.out.println(minWindowSliding("ABBACBAA","AAB"));
    }
}
