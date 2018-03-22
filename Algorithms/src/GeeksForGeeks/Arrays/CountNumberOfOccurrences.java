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
public class CountNumberOfOccurrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint 
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 3, 4, 4, 7, 8, 8};
        int x = 2;
        countInArray(arr, x);
        countInArrayMethod2(arr, x);

    }

    private static void countInArray(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void countInArrayMethod2(int[] arr, int x) {
        int n = arr.length;
        int i = first(arr, 0, n - 1, x, n);
        if (i == -1) {
            return;
        }
        int j = last(arr, i, n - 1, x, n);
        System.out.println(j - i + 1);
    }

    private static int first(int[] arr, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (((mid == 0) || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return first(arr, mid + 1, high, x, n);
            } else {
                return first(arr, low, mid - 1, x, n);
            }
        }
        return -1;
    }

    private static int last(int[] arr, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (((mid == n - 1) || x < arr[mid + 1]) && arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                return last(arr, low, mid - 1, x, n);
            } else {
                return last(arr, mid + 1, high, x, n);
            }
        }
        return -1;
    }
}
