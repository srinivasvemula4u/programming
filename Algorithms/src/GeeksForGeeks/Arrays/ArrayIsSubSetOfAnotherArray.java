/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

import java.util.Arrays;

/**
 *
 *
 */
/*
Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. 
Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.

Examples:
Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
Output: arr2[] is not a subset of arr1[]
 */
public class ArrayIsSubSetOfAnotherArray {

    /**
     * @param args the command line arguments
     */
    /*
    Method 1 (Simple)
Use two loops: The outer loop picks all the elements of arr2[] one by one. The inner loop linearly searches for the 
element picked by outer loop. If all elements are found then return 1, else return 0.
     */
    private static boolean isSubset(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if (j == m) {
                return false;
            }
        }
        return true;
    }

    /* Method 2 (Use Sorting and Binary Search)

1) Sort arr1[] O(mLogm)
2) For each element of arr2[], do binary search for it in sorted arr1[].
         a) If the element is not found then return 0.
3) If all elements are present then return 1. */
    private static boolean sortingAndMerging(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        quicksort(arr1);
        quicksort(arr2);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[j] < arr2[i]) {
                j++;
            } else if (arr1[j] == arr2[i]) {
                i++;
                j++;
            } else if (arr1[j] > arr2[j]) {
                return false;
            }
        }

        if (i == n) {
            return true;
        } else {
            return false;
        }

    }

    private static void quicksort(int[] arr) {
        int n = arr.length;
        quicksort(arr, 0, n - 1);
    }

    private static void quicksort(int[] arr, int si, int ei) {
        {
            if (si < ei) {
                int pivot = findPivot(arr, si, ei);
                quicksort(arr, si, pivot - 1);
                quicksort(arr, pivot + 1, ei);
            }
        }

    }

    private static int findPivot(int[] arr, int si, int ei) {
        int x = arr[ei];
        int i = si - 1;
        int j = 0;
        for (j = si; j <= ei - 1; j++) {
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, ei);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
    Time Complexity: O(mLogm + nLogm). Please note that this will be the complexity if an mLogm algorithm is used for 
    sorting which is not the case in above code. 
    In above code Quick Sort is sued and worst case time complexity of Quick Sort is O(m^2)
     */
 /* Method 3 (Use Sorting and Merging )
1) Sort both arrays: arr1[] and arr2[] O(mLogm + nLogn)
2) Use Merge type of process to see if all elements of sorted arr2[] are present in sorted arr1[]. */
    public static boolean isSubSetofArray(int[] arr1, int[] arr2) {
        quicksort(arr1);
        quicksort(arr2);
        int i = 0, j = 0;
        while (j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[i]) {
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                return false;
            }
        }
        if (j < arr2.length) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1, 4};
        System.out.println(isSubset(arr1, arr2));
        System.out.println(sortingAndMerging(arr1, arr2));
        System.out.println(isSubSetofArray(arr1, arr2));

    }
}
