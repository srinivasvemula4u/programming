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
public class SubSetSum {
    public static int subSetSum(int[] arr,int T) {
        int n = arr.length;
        int[][] M = new int[n+1][T+1];
        M[0][0] = 0;
        for(int i = 1; i <= T; i++)
            M[0][i] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= T; j++) {
                M[i][j] = M[i-1][j] | M[i-1][j-arr[i]];
            }
        }
        return M[n][T];
    }
    public static void main(String args[]) {
        int[] arr = {3,2,4,19,3,7,13,10,6,11};
        System.out.println(subSetSum(arr,17));
    }
}
