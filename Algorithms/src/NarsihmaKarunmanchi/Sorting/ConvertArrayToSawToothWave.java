/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class ConvertArrayToSawToothWave {

    public static void convertArrayToSawToothWave(int[] A) {
        for (int i = 1; i < A.length; i += 2) {
            if (i + 1 < A.length) {
                swap(A, i, i + 1);
            }
        }
    }

    /* Optimized Solution */
 /* Make Sure all Even positioned elements are greater than their adjacent odd elements, we dont need to worry about
    odd positioned elements.Traverse all even positioned elements of input array and do the following
    
    1) If current element is smaller than previous odd element swap previous and current
    2) If current element is smaller than next odd element swap next and current
     */
    public static void convertArrayToSawToothWaveOptimized(int[] A) {
        for (int i = 1; i < A.length; i += 2) {
            if (i > 0  && A[i] < A[i - 1]) {
                swap(A, i, i - 1);
            }
            if (i < A.length - 1 && A[i] < A[i + 1]) {
                swap(A, i, i + 1);
            }
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String args[]) {
        int[] A = {0, -6, 9, 13, 10, -1, 8, 12, 54, 14, -5};
        for (int val : A) {
            System.out.print(val + " ");
        }
        System.out.println();
        Arrays.sort(A);
        //convertArrayToSawToothWave(A);
        convertArrayToSawToothWaveOptimized(A);
        for (int val : A) {
            System.out.print(val + " ");
        }
    }
}
