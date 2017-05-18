/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author srivemul
 */
/*
Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

Examples:

Input :
arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
k = 3
Output :
3 3 4 5 5 5 6

Input :
arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
k = 4
Output :
10 10 10 15 15 90 90

 */
public class SlidingWindowMaximun {

    /**
     * @param args the command line arguments
     */
    /*
    Method 1 (Simple)
Run two loops. In the outer loop, take all subarrays of size k. In the inner loop, 
    get the maximum of the current subarray.
    Time Complexity: The outer loop runs n-k+1 times and the inner loop runs k times for every iteration of outer loop. 
So time complexity is O((n-k+1)*k)  */
    private static void slidingWindowMaximum(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    private static void slidingWindowMaximum2(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        for (; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        for (; i < n; i++) {
            System.out.print(arr[deque.getFirst()] + " ");
            while (!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        System.out.print(arr[deque.getFirst()] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        slidingWindowMaximum(arr, 4);
        slidingWindowMaximum2(arr, 4);
    }

}
