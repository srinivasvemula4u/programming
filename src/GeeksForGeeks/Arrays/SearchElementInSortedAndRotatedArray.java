/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) 
  2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class SearchElementInSortedAndRotatedArray {

    public static int pivotedBinarySearch(int[] arr, int key) {
        int len = arr.length;
        int pivot = findPivot(arr, 0, len - 1);
        System.out.println(arr[pivot]);
        if (pivot == -1) {
            return binarySearch(arr, 0, len - 1, key);
        }
        if (arr[pivot] == key) {
            return pivot;
        }
        if (arr[0] <= arr[pivot]) {
            return binarySearch(arr, 0, pivot - 1, key);
        }
        return binarySearch(arr, pivot + 1, len - 1, key);
    }

    private static int findPivot(int[] arr, int low, int high) {
        if (high < low) {
            return -1;
        }
        if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] < arr[mid + 1]) {
            return mid;
        }
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }
        return findPivot(arr, mid + 1, high);

    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        /*low + (high - low)/2;*/
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, key);
        }
        return binarySearch(arr, low, (mid - 1), key);
    }

    /* Driver program to check above functions */
    public static void main(String[] args) {
        // Let us search 3 in below array
        //13,17, 19, 23, 2, 3, 5, 7, 11
       // int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
       int[] arr = {13,17, 19, 23, 2, 3, 5, 7, 11};
        int key = 5;
        System.out.printf("Index: %d\n", pivotedBinarySearch(arr, key));

    }
}
