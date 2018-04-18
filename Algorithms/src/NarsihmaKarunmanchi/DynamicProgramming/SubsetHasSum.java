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
public class SubsetHasSum {

    public static int subsetHasSum(int[] arr) {
        int K = 0;
        for (int i = 0; i < arr.length; i++) {
            K += arr[i];
        }
        int[] T = new int[K + 1];
        T[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = K - arr[i]; j >= 0; j--) {
                if (T[j] == 1) {
                    T[j + arr[i]] = 1;
                }
            }
        }

        return T[K / 2];
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 20};
        System.out.println(subsetHasSum(arr));
    }
}
