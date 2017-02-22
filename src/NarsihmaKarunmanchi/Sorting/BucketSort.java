/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Bucket sort is mainly useful when input is uniformly distributed over a range. For example, consider the following problem. 
Sort a large set of floating point numbers which are in range from 0.0 to 1.0 and are uniformly distributed across the range. How do we sort the numbers efficiently?

A simple way is to apply a comparison based sorting algorithm. The lower bound for Comparison based sorting algorithm (Merge Sort, Heap Sort, Quick-Sort .. etc) is Ω(n Log n), i.e., they cannot do better than nLogn.
Can we sort the array in linear time? Counting sort can not be applied here as we use keys as index in counting sort. Here keys are floating point numbers. 
The idea is to use bucket sort. Following is bucket algorithm.

bucketSort(arr[], n)
1) Create n empty buckets (Or lists).
2) Do following for every array element arr[i].
.......a) Insert arr[i] into bucket[n*array[i]]
3) Sort individual buckets using insertion sort.
4) Concatenate all sorted buckets.
 */
package NarsihmaKarunmanchi.Sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author srivemul
 */
public class BucketSort {

    /* Driver program to test above funtion */
    public static void main(String args[]) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
        print(arr);
        bucketSort(arr);
        print(arr);
    }

    private static void print(float[] ar) {
        for (float n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    private static void bucketSort(float[] arr) {
        ArrayList<ArrayList<Float>> buckets = new ArrayList<ArrayList<Float>>();
        for (int i = 0; i < arr.length; i++) {
            buckets.add(new ArrayList<Float>());
        }
        for (int i = 0; i < arr.length; i++) {
            int bucket = (int) (arr.length * arr[i]);
            buckets.get(bucket).add(arr[i]);
        }
        for (int i = 0; i < buckets.size(); i++) {
            Collections.sort(buckets.get(i));
        }
        int index = 0;
        for (int i = 0; i < buckets.size(); i++) {
            ArrayList<Float> bucket = buckets.get(i);
            for (float val : bucket) {
                arr[index++] = val;
            }
        }
    }
}
