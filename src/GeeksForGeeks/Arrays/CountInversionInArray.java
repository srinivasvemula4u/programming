/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul METHOD 1 (Simple) For each element, count number of elements
 * which are on right side of it and are smaller than it.
 */
public class CountInversionInArray {

    private static int countInversionsInArray(int[] arr) {
        int n = arr.length;
        int numOfInversions = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    numOfInversions++;
                }
            }
        }
        return numOfInversions;
    }

    private static int countInversionsInArrayUsingMergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid = 0, invCount = 0;
        if (left < right) {
            mid = (left + right) / 2;
            invCount = mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid, k = left;
        int invCount = 0;
        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(countInversionsInArray(arr));
        System.out.println(countInversionsInArrayUsingMergeSort(arr));
    }

}
