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
public class SlidingWindowMaximun {

    /**
     * @param args the command line arguments
     */
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
    private static void slidingWindowMaximum2(int[] arr,int k) {
        int n = arr.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        for(; i < k; i++) {
           while(!deque.isEmpty() && arr[i] >= arr[deque.getLast()])
               deque.pollLast();
           deque.offerLast(i);
        }
        for(; i < n; i++) {
            System.out.print(arr[deque.getFirst()] + " ");
            while(!deque.isEmpty() && deque.getFirst() <= i - k)
                deque.pollFirst();
            while(!deque.isEmpty() && arr[i] >= arr[deque.getLast()])
                deque.pollLast();
            deque.offerLast(i);
        }
          System.out.print(arr[deque.getFirst()] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
       int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
       slidingWindowMaximum(arr,4);
        slidingWindowMaximum2(arr,4);
    }

}
