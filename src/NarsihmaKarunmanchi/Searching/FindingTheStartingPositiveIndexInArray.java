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
public class FindingTheStartingPositiveIndexInArray {

    public int Search(int[] arr, int first, int last) {
        while (first <= last) {
            if (first == last) {
                return first;
            }
            if (first + 1 == last - 1) {
                return Math.max(first, last);
            }
            int mid = first + (last - first) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                first = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid - 1]) {
                last = mid - 1;
            }

        }
        return Integer.MIN_VALUE;
    }
}
