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
public class LongestPalindromeSubSequence {
    public static  int  longestPalindromeSubSequence(int[] arr) {
        int max = 1,n = arr.length;
        int[][] L = new int[n][n];
        for(int i =0; i < n-1; i++) {
            L[i][i] = 1;
            if(arr[i] == arr[i+1]) {
                L[i][i+1] = 1;
                L[i+1][i] = 1;
                max = 2;
            }
            else 
                L[i][i+1] = 0;
        }
        int i=0,j=0;
        for(int k = 3; k <= n; k++) {
            for( i =0; i <= n-k+1; i++) {
               //  j =0;
                if(i+k-1 < n) {
                  j = i+k-1;
                }
                else {
                    j = n-1;
                }
                if(arr[i] == arr[j]) {
                    L[i][j] = 2+L[i+1][j-1];
                   // if(k > max)
                     // max =  k;
                }
                else {
                    L[i][j] = Math.max(L[i+1][j], L[i][j-1]);
                }
                
            }
        }
        return L[i][j];
    }
    public static void main(String args[]) {
       int[] arr ={'A','G','C','T','C','B','M','A','A','C','T','G','G','A','A','M'};
     // int[] arr = {'A','A','A','A'};
        System.out.println(arr.length);
        System.out.println(longestPalindromeSubSequence(arr));
    }
}
