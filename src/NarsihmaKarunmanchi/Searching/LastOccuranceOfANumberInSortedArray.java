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
public class LastOccuranceOfANumberInSortedArray {

    public static int lastOccuranceOfANumberInSortedArray(int[] arr, int low, int high, int data) {
        if (low == high && arr[low] == data) {
            return low;
        }
        if (high > low) {
            int mid = low + (high - low) / 2;
            if ((mid == high && arr[mid] == data) || (arr[mid] == data && arr[mid + 1] > data)) {
                return mid;
            } else if (arr[mid] <= data) {
                return lastOccuranceOfANumberInSortedArray(arr, mid + 1, high, data);
            } else {
                return lastOccuranceOfANumberInSortedArray(arr, low, mid - 1, data);
            }
        }
        return Integer.MIN_VALUE;
    }
     public static void main(String args[]) {
        int[] Arr = {1, 2, 3, 4, 4, 4, 4};
        System.out.println(lastOccuranceOfANumberInSortedArray(Arr,0,Arr.length-1,4));
    }
}
