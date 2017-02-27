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
public class BlowSwapArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 0, 2, 7);
        printArray(arr);
    }

    private static void leftRotate(int[] arr, int start, int d, int n) {
        /* Return If number of elements to be rotated is 
    zero or equal to array size */
        if (d == 0 || d == n) {
            return;
        }
        if (d == n - d) {
            swap(arr, start, 0, d, n - d);
        }
        if (d < n - d) {
            swap(arr, start, 0, n - d, d);
            leftRotate(arr, start, d, n - d);
        } else {
            swap(arr, start, 0, d, n - d);
            leftRotate(arr, n - d, 2 * d - n, d);
        }
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val);
        }
        System.out.println();
    }

    private static void swap(int[] arr, int start, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + start + i];
            arr[fi + start + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }
}
