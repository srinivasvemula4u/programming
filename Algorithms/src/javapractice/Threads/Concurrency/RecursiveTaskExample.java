/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author srivemul
 */
class FindMaxTask extends RecursiveTask<Integer> {

    private final int threshold;
    private int start;
    private int end;
    private final int[] myArray;

    public FindMaxTask(int threshold, int start, int end, int[] myArray) {
        this.threshold = threshold;
        this.start = start;
        this.end = end;
        this.myArray = myArray;
    }

    @Override
    protected Integer compute() {
        if (end - start < threshold) {
            int max = Integer.MIN_VALUE;
            for (int i = start; i <= end; i++) {
                if (myArray[i] > max) {
                    max = myArray[i];
                }
            }
            return max;
        } else {
            int midWay = (end - start) / 2 + start;
            FindMaxTask a1 = new FindMaxTask(threshold, start, midWay, myArray);
            a1.fork();
            FindMaxTask a2 = new FindMaxTask(threshold, midWay + 1, end, myArray);
            return Math.max(a2.compute(), a1.join());
        }
    }

}

public class RecursiveTaskExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr =  {10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                  24, 33, 35, 42, 47};
       int n = arr.length;
       FindMaxTask maxTask = new FindMaxTask(n/16, 0, n-1, arr);
       ForkJoinPool pool = new ForkJoinPool();
       int result = pool.invoke(maxTask);
       System.out.println();
    }
    

}
