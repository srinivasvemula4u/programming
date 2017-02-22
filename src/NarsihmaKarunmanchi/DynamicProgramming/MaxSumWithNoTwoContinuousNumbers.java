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
public class MaxSumWithNoTwoContinuousNumbers {
    public static int maxSumWithTwoContinuousNumbers(int[] arr) {
        int[] M = new int[arr.length+1];
        M[0] = arr[0];
        M[1] = arr[0] > arr[1] ? arr[0] : arr[1];
        for(int i = 2; i < arr.length; i++) {
            M[i] = M[i-1] > (M[i-2]+arr[i]) ? M[i-1] : (M[i-2] + arr[i]);
        }
        return M[arr.length-1];
    }
      public static void main(String args[]) {
        // int[] arr = {1,-3,4,-2,-1,6};
         int[] arr = {-2,11,-4,13,-5,2};
        System.out.println(maxSumWithTwoContinuousNumbers(arr));
        //  System.out.println(maxContigousSumOptmized(arr));
          // System.out.println(dynamicProgramming(arr));
         //  System.out.println(withoutDP(arr));
    }
}
