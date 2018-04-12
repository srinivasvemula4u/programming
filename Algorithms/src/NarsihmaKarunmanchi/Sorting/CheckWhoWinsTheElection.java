/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

import NarsihmaKarunmanchi.PriorityQueues.Heap;

/**
 *
 * @author srivemul
 */
public class CheckWhoWinsTheElection {

    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 3, 3, 3, 2, 1};
        int n = arr.length;
        print(arr);
        System.out.println("candidate with id number  " + checkWhoWinsTheElectionOptimized(arr) + " won in the election");
        // print(arr);
    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static int checkWhoWinsTheElection(int[] arr) {
        int candidate = -1, maxScore = Integer.MIN_VALUE, score = 0;
        for (int i = 0; i < arr.length; i++) {
            //candidate = arr[i];
            score = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    score++;
                }
            }
            if (score > maxScore) {
                maxScore = score;
                candidate = arr[i];
            }

        }
        return candidate;
    }

    public static int checkWhoWinsTheElectionOptimized(int[] arr) {
        int candidate = -1, maxScore = Integer.MIN_VALUE, score = 0;

        Heap heap = new Heap(arr.length, 0, arr);
        heap.heapSort(arr, arr.length);
        int currentcandidate = arr[0];
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if (currentcandidate == arr[i]) {
                score++;
                continue;
            }
            if (score > maxScore) {
                maxScore = score;
                candidate = currentcandidate;
            }
            currentcandidate = arr[i];
            score = 1;
        }
        if (score > maxScore) {
            maxScore = score;
            candidate = currentcandidate;
        }
        return candidate;
    }
}
