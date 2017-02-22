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
public class BruteForceStringMatchAlgorithm {
    public static int bruteForceStringMatchAlgorithm(String T, String P) {
        for(int i=0; i <= T.length()- P.length(); i++) {
            int j= 0;
             while( j < P.length() && T.charAt(i+j) == P.charAt(j))
                j++;
             if( j == P.length()) {
                 return i;
             }
        }
        return -1;
    }
    public static void main(String args[]) {
        String T = "HelloHowAreYou";
        String P = "How1";
        System.out.println(bruteForceStringMatchAlgorithm(T, P));
    }
}
