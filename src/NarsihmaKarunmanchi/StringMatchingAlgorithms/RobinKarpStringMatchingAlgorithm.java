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
public class RobinKarpStringMatchingAlgorithm {

    private static final int DIGITS = 256;

    public static void search(String txt, String pat, int q) {
        int M = pat.length();
        //StringBuilder str = new StringBuilder();
        
        int N = txt.length();
        int h = 1; // for power(d,m-1);
        int p = 0; // For patter hash
        int t = 0; // For text has
        for (int i = 0; i < M - 1; i++) {
            h = (h * DIGITS) % q;
        }
        for (int i = 0; i < M; i++) {
            p = (p * DIGITS + pat.charAt(i)) % q;
            t = (t * DIGITS + txt.charAt(i)) % q;
        }
        for(int i=0; i <= N-M; i++) {
            if( p == t) {
                int j =0;
                for(; j < M; j++) {
                    if(pat.charAt(j) != txt.charAt(i+j))
                        break;
                }
                if( j == M)
                    System.out.println("Pattern found at "+ i);
            }
            if( i < N-M) {
                t = (DIGITS*(t-h*txt.charAt(i))+txt.charAt(i+M))%q;
            }
            if( t < 0) 
                t = t + q;
        }

    }
    public static void main(String args[]) {
        String T = "HelloHowAreYou";
        String P = "How";
        search(T, P,11);
    }
}
