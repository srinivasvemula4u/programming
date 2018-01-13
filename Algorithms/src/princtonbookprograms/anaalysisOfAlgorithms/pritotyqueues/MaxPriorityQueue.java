/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.pritotyqueues;

/**
 *
 * @author srivemul
 * @param <Key>
 */
public class MaxPriorityQueue<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N = 0;

    public MaxPriorityQueue() {
    }

    public MaxPriorityQueue(int max) {

        pq = (Key[]) new Comparable[max + 1];
    }

    public MaxPriorityQueue(Key[] a) //create a priority queue from the keys in a[]
    {

    }

    public void insert(Key k) //insert a key into the priority queue
    {
        pq[++N] = k;
        swim(N);
    }

    public int size() //number of keys in the priority queue
    {
        return N;
    }

    public Key Max() //return the largest key
    {
        return pq[1];
    }

    public Key delMax() // Remove and Return largest key
    {
        Key max = pq[1];
        exchange(1, N);
        pq[N--] = null;
        sink(1);
        return max;
    }

    boolean isEmpty() {  // is the priority queue empty?
        return N == 0;
    }

    private void swim(int k) //Bottom-up reheapify ( swim).
    {
        while ((k > 1) && (less(k / 2, k))) {
            exchange(k / 2, k);
            k = k / 2;
        }

    }

    private void sink(int k) //Top-down reheapify(sink)
    {

        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exchange(k, j);
            k = j;
        }
    }

    private boolean less(int i, int k) {
        return pq[i].compareTo(pq[k]) < 0;
    }

    private void exchange(int i, int k) {
        Key temp = pq[i];
        pq[i] = pq[k];
        pq[k] = temp;
    }

    public void printHeap() {
        for (Key k : pq) {
            System.out.println(k);
        }
    }

    public static void main(String args[]) {
        MaxPriorityQueue<Integer> obj = new MaxPriorityQueue<>(10);
        System.out.println("Heap Size =" + obj.size());
        obj.insert(5);
        obj.insert(2);
        obj.insert(8);
        System.out.println("Heap Size = " + obj.size());
        System.out.println("Max Element in heap = " + obj.Max());
        obj.printHeap();
        obj.insert(3);
        obj.insert(1);
        obj.insert(7);
        obj.insert(9);
        obj.insert(4);
        obj.insert(6);
        obj.insert(10);
        System.out.println("Heap Size = " + obj.size());
        System.out.println("Max Element in heap = " + obj.Max());
        obj.printHeap();
        System.out.println("Deleted Max Element = " + obj.delMax());
        System.out.println("Max Element in heap = " + obj.Max());

    }

}
