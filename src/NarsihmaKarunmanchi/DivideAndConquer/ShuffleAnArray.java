/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DivideAndConquer;

/**
 *
 * @author srivemul
 */
public class ShuffleAnArray {

    public static void shuffleArray(int[] arr) {
        if (arr.length <= 0) {
            return;
        }
        shuffleArray(arr, 0, arr.length - 1);
    }

    private static void shuffleArray(int[] arr, int l, int r) {
        int c = (l + r) / 2 ;
        int q =  l + (c - l) / 2 + 1;
        if (l == r) {
            return;
        }
        for (int k = 1, i = q; i <= c; i++, k++) {
            int temp = arr[i];
            arr[i] = arr[c + k];
            arr[c + k] = temp;
        }
        shuffleArray(arr, l, c);
        shuffleArray(arr, c + 1, r);
    }

    public static void main(String args[]) {
         int[] arr = {1,3,5,7,9,11,13,2,4,6,8,10,12,14};
         shuffleArray(arr);
         for(int i : arr) 
             System.out.print(i+" ");
         System.out.println();
    }

}
