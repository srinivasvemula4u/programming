/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.PriorityQueues;

/**
 *
 * @author srivemul
 */
public class FindMaxMinHeap {

    public static int MaxInMinHeap(Heap heap) {
        int max = Integer.MIN_VALUE;
        for (int i = (heap.count / 2 + 1); i < heap.count; i++) {
            if (heap.array[i] > max) {
                max = heap.array[i];
            }
        }
        return max;
    }

}
