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
public class MajorityElementInSortedArray {

    /**
     * @param args the command line arguments METHOD 1 (Using Linear Search)
     * Linearly search for the first occurrence of the element, once you find it
     * (let at index i), check element at index i + n/2. If element is present
     * at i+n/2 then return 1 else return 0.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4,4,5};

        int x = 4;
        int n = arr.length;
        if (isMajorityMethod1(arr, n, x)) {
            System.out.printf("%d  appears more than %d times in arr[]\n",
                    x, n / 2);
        } else {
            System.out.printf("%d does not appear more than %d times in arr[]\n",
                    x, n / 2);
        }
        if (isMajorMethod2(arr, n, x)) {
            System.out.printf("%d  appears more than %d times in arr[]\n",
                    x, n / 2);
        } else {
            System.out.printf("%d does not appear more than %d times in arr[]\n",
                    x, n / 2);
        }
    }

    private static boolean isMajorityMethod1(int[] arr, int n, int x) {
        int last_index = n % 2 != 0 ? (n / 2 + 1) : n / 2;
        for (int i = 0; i < last_index; i++) {
            if (arr[i] == x && arr[i + n / 2] == x) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMajorMethod2(int[] arr, int n, int x) {

        int i = binarySearch(arr, 0, n - 1, x);
        if (i == -1) {
            return false;
        }
        if (((i + n / 2) <= n - 1) && (arr[i + n / 2] == x)) {
            return true;
        } else {
            return false;
        }
    }

    private static int binarySearch(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            return binarySearch(arr, mid + 1, high, x);
        }
        return binarySearch(arr, low, mid - 1, x);
    }

}
