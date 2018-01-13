/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 * prefix function or prefix table or fail function
 */
public class KMPSearchAlgorithm {
    
    private static void LPSArray(String pat,int[] lps) {
        int strLen = pat.length();
        lps[0] = 0;
        int i = 1;
        int len = 0;
        while(i < strLen) {
            if(pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;  
            }
            else if( len != 0) {
                len = lps[len-1];
            }
            else {
                lps[i] = 0;
                i++;
            }
        } 
    }
    public static void search(String text, String pat) {
        int[] lps = new int[pat.length()];
        LPSArray(pat, lps);
        int i = 0, j = 0;
        while(i < text.length()) {
            if(text.charAt(i) == pat.charAt(j)) {
                i++; j++;
            } 
            if( j == pat.length()) {
                System.out.println("Pattern found at the index "+ (i-j));
                j = lps[j-1];
            }
            else if( i < text.length() && (text.charAt(i) != pat.charAt(j))) {
                if( j != 0) {
                    j = lps[j-1];
                }
                else {
                    i++;
                }
            }
        }
    }
      public static void main(String args[]) {
        String T = "HelloHowAreYou";
        String P = "How";
        search(T, P);
    }
}
