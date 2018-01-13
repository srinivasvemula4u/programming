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
public class Heap {

    public int[] array;
    public int capacity;
    public int count;
    public int heap_type; // 0 for maxIndex heap, 1 min heap;

    public Heap(int capacity, int heap_type) {
        this.capacity = capacity;
        this.heap_type = heap_type;
        array = new int[capacity];
        count = 0;
    }
      public Heap(int capacity, int heap_type , int[] arr) {
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.array = arr;
        count = 0;
    }

    public int parentIndex(int childIndex) {
        if (childIndex <= 0 || childIndex >= this.count) {
            return -1;
        }
        return (childIndex - 1) / 2;
    }

    public int leftChildIndex(int parentIndex) {
        int left = 2 * parentIndex + 1;
        if (left >= this.count) {
            return -1;
        }
        return left;
    }

    public int rightChildIndex(int parentIndex) {
        int right = 2 * parentIndex + 2;
        if (right >= this.count) {
            return -1;
        }
        return right;
    }

    public int GetMaximum() {
        if (this.count == 0) {
            return -1;
        }
        return array[0];
    }

    public void printHeap() {
        for (int k : array) {
            System.out.print(" " + k + " ");
        }
        System.out.println();
    }

    // Heapifying the element at location index
    // Max Heap
    public void percolateDown(int index) {
        int left, right, maxIndex, temp;
        left = leftChildIndex(index);
        right = rightChildIndex(index);
        if (left != -1 && array[left] > array[index]) {
            maxIndex = left;
        } else {
            maxIndex = index;
        }
        if (right != -1 && array[right] > array[maxIndex]) {
            maxIndex = right;
        }
        if (maxIndex != index) {
            temp = array[index];
            array[index] = array[maxIndex];
            array[maxIndex] = temp;
        }
        if (maxIndex != index) // Check this condition not sure
        {
            percolateDown(maxIndex);
        }
    }

    public void percolateDownForMinHeap(int index) {
        int left, right, minIndex, temp;
        left = leftChildIndex(index);
        right = rightChildIndex(index);
        if (left != -1 && array[left] < array[index]) {
            minIndex = left;
        } else {
            minIndex = index;
        }
        if (right != -1 && array[right] < array[minIndex]) {
            minIndex = right;
        }
        if (minIndex != index) {
            temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;
        }
        if (minIndex != index) // Check this condition not sure
        {
            percolateDownForMinHeap(minIndex);
        }
    }

    public int deleteMax() {
        if (this.count == 0) {
            return -1;
        }
        int data = this.array[0];
        this.array[0] = this.array[count - 1];
        this.count--;
        percolateDown(0);
        return data;
    }

    public int delMin() {
        if (this.count == 0) {
            return -1;
        }
        int data = this.array[0];
        this.array[0] = this.array[count - 1];
        //this.array[count - 1] = -1;
        this.count--;
        percolateDownForMinHeap(0);
        return data;
    }

    public void insert(int data) {
        int index;
        if (this.count == this.capacity) {
            resizeHeap();
        }
        this.count++;
        index = this.count - 1;
        while (index >= 0 && data > array[(index - 1) / 2]) {
            array[index] = array[(index - 1) / 2];
            index = (index - 1) / 2;
        }
        array[index] = data;

    }

    private void resizeHeap() {
        int[] array_old = new int[capacity];
        for (int i = 0; i < this.capacity; i++) {
            array_old[i] = this.array[i];
        }
        this.array = new int[2 * capacity];
        this.capacity *= 2;
        if (this.array == null) {
            return;
        }
        for (int i = 0; i < this.capacity; i++) {
            this.array[i] = array_old[i];
        }
        
        array_old = null;
    }

    public void destroyHeap() {
        this.count = 0;
        this.array = null;
    }

    public void buildHeap(int[] A, int n) {

        if (n > this.capacity) {
            resizeHeap();
        }
        for (int i = 0; i < n; i++) {
            this.array[i] = A[i];
        }
        this.count = A.length;
        for (int i = (n-1) / 2; i >= 0; i--) {
            percolateDown(i);
        }
    }
      public void buildHeap() {   
        this.count = array.length;
        for (int i = (count-1) / 2; i >= 0; i--) {
            percolateDown(i);
        }
    }
     public void buildHeapForMinHeap(int[] A, int n) {

        if (n > this.capacity) {
            resizeHeap();
        }
        for (int i = 0; i < n; i++) {
            this.array[i] = A[i];
        }
        this.count = A.length;
        for (int i = (n-1) / 2; i >= 0; i--) {
            percolateDownForMinHeap(i);
        }
    }

    public void heapSort(int[] A, int n) {
        //   Heap heap = new Heap(n, 0);
        int old_size, i, temp;
       // buildHeap(A, n);
       buildHeap();
        old_size = this.count;
        for (i = n - 1; i >= 0; i--) {
            temp = this.array[0];
            this.array[0] = this.array[i]; // heap.array[0] = heap.arry[heap.count-1; heap.count--;
            this.array[i] = temp;
            this.count --;
            percolateDown(0);
        }
        this.count = old_size;
    }

    public static void main(String args[]) {
        int[] arr = {2, 6, 4, 3, 1, 5};
        Heap heap = new Heap(arr.length, 0,arr);
        heap.heapSort(arr, arr.length);
      //  System.out.println();
        for (int val : arr) {
            System.out.print(" " + val);
        }
        System.out.println();
    }

}
