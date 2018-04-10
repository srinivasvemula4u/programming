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
public class CheckDuplicatesInArray {

    public static void main(String args[]) {
        int arr[] = {170, 45, 75, 90, 802, 45, 2, 66};
        int n = arr.length;
        print(arr);
        System.out.println(checkDuplicatesInArrayOptimized(arr));
        // print(arr);
    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    private static boolean checkDuplicatesInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDuplicatesInArrayOptimized(int[] arr) {
        Heap heap = new Heap(arr.length, 0, arr);
        heap.heapSort(arr, arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
