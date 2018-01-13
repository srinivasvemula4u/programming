/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

import NarsihmaKarunmanchi.PriorityQueues.Heap;
import edu.princeton.cs.algs4.BinarySearch;
//import static java.util.Arrays.binarySearch;

/**
 *
 * @author srivemul
 */
/*
Let A and B be two arrays of n elements each. Given a number K, give an 0(nlogn) tie algorithm for determinig
whether there exists  aEA and bEB such that a+b = k
 */
public class Find {

    public static boolean find(int[] arrA, int[] arrB, int k) {
        Heap heap = new Heap(arrA.length, 0, arrA);
        heap.heapSort(arrA, arrA.length);
        for (int i = 0; i < arrB.length; i++) {
            int key = k - arrB[i];
            if (binarySearch(arrA, key)) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] arrA, int key) {
        int low = 0, heigh = arrA.length - 1;
        while (low <= heigh) {
            int mid = (heigh + low) / 2;
            if (arrA[mid] == key) {
                return true;
            } else if (key < arrA[mid]) {
                heigh = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int arrA[] = {1, 1, 1, 3, 3, 3, 2, 1};
        int arrB[] = {-1, 0, 0, -1};
        System.out.println(find(arrA, arrB, 5));
    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
