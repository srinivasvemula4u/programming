/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class LongestCommonSequence {
    // Using Recursive Method
    public static String longestCommonSequence(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        if( m == 0 || n == 0)
            return "";
        if( X.charAt(m-1) == Y.charAt(n-1))
            return longestCommonSequence(X.substring(0,m-1), Y.substring(0,n-1)) + X.charAt(m-1);
        else {
            String x  = longestCommonSequence(X, Y.substring(0,n-1));
            String y = longestCommonSequence(X.substring(0,m-1), Y);
            return x.length() >= y.length() ? x : y;
        }
    }
    // Iterative memotization method
    
    public static String LCSLength(String X, String Y) {
       int[][] Table = new int[X.length()+1][Y.length()+1];
       for(int i =0; i < X.length(); i++) {
           for(int j =0; j < Y.length(); j++) {
               if(X.charAt(i) ==  Y.charAt(j)) {
                   Table[i+1][j+1] = Table[i][j]+1;
               }
               else {
                   Table[i+1][j+1] = Math.max(Table[i][j+1], Table[i+1][j]);
               }
           }
       }
       printTable(Table);
       StringBuilder buffer = new StringBuilder();
       for(int x = X.length(),y = Y.length(); (x != 0) && (y!= 0);) {
           if(Table[x][y] == Table[x-1][y])
               x--;
           else if(Table[x][y] == Table[x][y-1])
               y--;
           else {
               if(X.charAt(x-1) == Y.charAt(y-1))
                  buffer.append(X.charAt(x-1));
               x--;
               y--;
           } 
       }
       return buffer.reverse().toString();
    }
    public static void main(String args[]) {
        System.out.println(longestCommonSequence("ABCBDAB", "BDCABA"));
        System.out.println(LCSLength("ABCBDAB", "BDCABA"));
    }

    private static void printTable(int[][] Table) {
       for(int[] arr : Table) {
           for(int i : arr)
               System.out.print(i + " ");
           System.out.println();
       }
    }
}
