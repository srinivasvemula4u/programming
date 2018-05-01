/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

import java.util.Arrays;

/**
 *
 * https://www.geeksforgeeks.org/minimum-sum-absolute-difference-pairs-two-arrays/
 * Given two arrays a[] and b[] of equal length n. The task is to pair each
 * element of array a to an element in array b, such that sum S of absolute
 * differences of all the pairs is minimum.
 *
 * Suppose, two elements a[i] and a[j] (i != j) of a are paired with elements
 * b[p] and b[q] of b respectively, then p should not be equal to q.
 *
 * Examples:
 *
 * Input : a[] = {3, 2, 1} b[] = {2, 1, 3} Output : 0
 *
 * Input : n = 4 a[] = {4, 1, 8, 7} b[] = {2, 3, 6, 5} Output : 6
 */
public class MinimumSumOfAbsoluteDiffOfPairsOfTwoArrays {

    /*
    The solution to the problem is a simple greedy approach. 
    It consists of two steps.
Step 1 : Sort both the arrays in O (n log n) time.
Step 2 : Find absolute difference of each pair of corresponding elements 
    (elements at same index) of both arrays and add the result to the sum S. 
    The time complexity of this step is O(n).

Hence, the overall time complexity of the program is O(n log n)
     */
    // Returns minimum possible pairwise 
    // absolute difference of two arrays.
    static long findMinSum(long a[], long b[], long n) {
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Find sum of absolute differences
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.abs(a[i] - b[i]);
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        // Both a[] and b[] must be of same size.
        long a[] = {4, 1, 8, 7};
        long b[] = {2, 3, 6, 5};
        int n = a.length;
        System.out.println(findMinSum(a, b, n));
    }
}
