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
public class SumOfTwoSquaredElementsEqualToAnotherSqauredElementInArray {

    public static void sumOfTwoSquaredElementsEqualToAnotherSqauredElementInArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0, j = arr.length - 1; i < j;) {
                int temp = arr[i] + arr[j];
                if (temp == arr[k]) {
                    System.out.println("Values are found at a[i]= " + arr[i] + " arr[j]= " + arr[j] + " k= " + arr[k]);
                    return;
                }
                if (temp < arr[k]) {
                    i = i + 1;
                } else {
                    j = j - 1;
                }

            }
        }
        System.out.println("Not found");
    }

    public static void sumOfTwoSquaredElementsEqualToAnotherSqauredElementInArrayOptimized(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k=0; k < arr.length; k++) {
            for(int i=0; i < arr.length; i++) {
                if(map.containsKey(arr[i])) {
                    System.out.println(" Found arr[i]= "+arr[i]+ " arr[j]="+map.get(arr[i])+" arr[k]="+ arr[k]);
                    return;
                }
                map.put(arr[k]-arr[i], arr[i]);
            }
            
        }
        System.out.println("Not found");

    }

    public static void main(String args[]) {
        int[] Arr = {10, 2, 4, 5, 2, 3, 1};
        // twoSumK(Arr,6);
        //  twoSumKOptimized(Arr,20);
        //sumOfTwoSquaredElementsEqualToAnotherSqauredElementInArray(Arr);
        sumOfTwoSquaredElementsEqualToAnotherSqauredElementInArrayOptimized(Arr);
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
}
