/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

/**
 *
 * @author srivemul
 */
public class FirstOccuranceOfANumberInSortedArray {

    public static int firstOccuranceOfANumberInSortedArray(int[] arr, int low, int high, int data) {
        if (low == high && arr[low] == data) {
            return arr[low];
        }
        if (high > low) {
            int mid = low + (high - low) / 2;
            if ((mid == low && arr[mid] == data) || (arr[mid] == data && arr[mid - 1] < data)) {
                return mid;
            }
            if (arr[mid] >= data) {
                firstOccuranceOfANumberInSortedArray(arr, 0, mid - 1, data);
            } else {
                firstOccuranceOfANumberInSortedArray(arr, mid + 1, high, data);
            }

        }
        return Integer.MAX_VALUE;
    }

    public static void main(String args[]) {
        int[] Arr = {1, 2, 3, 4, 4, 4, 5};
        System.out.println(firstOccuranceOfANumberInSortedArray(Arr, 0, Arr.length - 1, 4));
    }

}
