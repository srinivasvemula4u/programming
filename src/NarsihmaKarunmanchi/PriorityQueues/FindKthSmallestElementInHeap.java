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
public class FindKthSmallestElementInHeap {
    public static int findKthSmallestElement(Heap heap,int k) {
        for(int i=1; i < k; i++)
            heap.delMin();
        return heap.delMin();
    }
      public static void main(String args[]) {
        int[] arr = {2, 9, 1, 3, 1, 5};
        Heap heap = new Heap(arr.length, 0);
        heap.buildHeapForMinHeap(arr, arr.length);
       // heap.heapSort(arr, arr.length);
       System.out.println(findKthSmallestElement(heap, 4));
        System.out.println();
        
    }
}

