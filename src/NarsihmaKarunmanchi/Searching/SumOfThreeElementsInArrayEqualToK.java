/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author srivemul
 */
public class SumOfThreeElementsInArrayEqualToK {

    public static void sumOfThreeElementsInArrayEqualToK(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == data) {
                        System.out.println("Elements found");
                        return;
                    }

                }
            }
        }
        System.out.println("Elements not found");
    }

    public static void sumOfThreeElementsInArrayEqualToKOptimized(int[] arr, int data) {
        Arrays.sort(arr);
        for (int k = 0; k < arr.length; k++) {
            for (int i = k+1, j = arr.length - 1; i < j;) {
                if (arr[i] + arr[j] + arr[k] == data) {
                    System.out.println("Elements found");
                    return;
                }
                if (arr[i] + arr[j] + arr[k] > data) {
                    j = j - 1;
                } else {
                    i = i + 1;
                }
            }
        }
        System.out.println("Elements not found");
    }

    public static void sumOfThreeElementsInArrayEqualToKOptimizedFurther(int[] arr, int data) {
        // To-do Not verified.
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr.length; j++) {
                map.put(arr[i] + arr[j], arr[i] + arr[j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(data - arr[i])) {
                System.out.println("Items found");
                return;
            }
              System.out.println("Items not found");
        }
    }

    public static void main(String args[]) {
        int[] Arr = {10, 2, 4, 5, 2, 3, 1};
        sumOfThreeElementsInArrayEqualToKOptimizedFurther(Arr, 22);
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
}
