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
public class BoyerMooreAlgorithWithBadCharacterHeuristic {
   private static final int NO_OF_CHARS = 256;
   private static void badCharHeuristic(String pat,int[] badCharArray) {
       for(int i = 0; i < pat.length(); i++) {
           badCharArray[pat.charAt(i)] = i;
       }
   }
   public static void search(String text, String pat) {
       int n = text.length();
       int m = pat.length();
       int[] badCharArray = new int[NO_OF_CHARS];
       badCharHeuristic(pat, badCharArray);
       int s = 0; // s is shift of the pattern with respect to text
       while( s <= (n-m)) {
           int j = m-1;
           while(j >= 0 && text.charAt(s+j) == pat.charAt(j)) {
               j--;
           }
           if( j  < 0) {
              System.out.printf("\n pattern occurs at shift = %d ", s);
               s += ((s+m < n) ? m-badCharArray[text.charAt(s+m)] : 1); 
           }
           else {
               s += Math.max(1, j-badCharArray[text.charAt(s+j)]);
           }
       }
   }
     public static void main(String args[]) {
        String T = "HelloHowAreYouAl";
        String P = "How";
        search(T, P);
    }
}
