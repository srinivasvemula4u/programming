/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class MaximumSumofNonThreeConsecutive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
{
    int[] arr = {100, 1000, 100, 1000, 1};
    //int n = sizeof(arr)/sizeof(arr[0]);
      System.out.println(maxSumWO3Consec(arr));
   
}
    }

    private static int maxSumWO3Consec(int[] arr) {
       int n = arr.length;
       int[] sum = new int[n];
       sum[0] = arr[0];
       sum[1] = Math.max(sum[0], sum[0]+arr[1]);
       sum[2] = Math.max(Math.max(sum[1], sum[0]+arr[2]),arr[1]+arr[2]);
       for(int i=3; i < n; i++) {
           sum[i] = Math.max(Math.max(sum[i-1], sum[i-2]+arr[i]),sum[i-3]+arr[i-1]+arr[i]);
       }
       return sum[n-1];
    }
    
}
