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
public class MinumLengthOfUnsortedSubArrayUponSortingWholeArraySorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        printUnSortedArray(arr);
    }

    private static void printUnSortedArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        int n = arr.length - 1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (s = 0; s < n - 1; s++) {
            if (arr[s] > arr[s + 1]) {
                break;
            }
        }
        if (s == n - 1) {
            System.out.println("Array is completely Sorted");
            return;
        }
        for (e = n - 1; e > 0; e--) {
            if (arr[e] < arr[e - 1]) {
                break;
            }
        }
        max = arr[s];
        min = arr[s];
        for (int i = s; i <= e; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < s; i++) {
            if (arr[i] > min) {
                s = i;
                break;
            }
        }
        for (int i = n - 1; i >= e + 1; i--) {
            if (arr[i] < max) {
                e = i;
                break;
            }
        }
        printArray(arr, s, e);
    }

    private static void printArray(int[] arr, int s, int e) {
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
