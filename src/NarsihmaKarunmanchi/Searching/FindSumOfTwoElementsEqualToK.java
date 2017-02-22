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
public class FindSumOfTwoElementsEqualToK {
    public static void twoSumK(int[] arr,int k) {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    System.out.println("Items found, i= " + i + " j="+ j);
                    return;
                }
            }
        }
         System.out.println("No Items found");  
    }
    public static void twoSumKOptimized(int[] arr,int k) {
        Arrays.sort(arr);
        for(int i = 0, j = arr.length-1; i < j;)
        {  
            int temp = arr[i]+ arr[j];
           if(  temp == k)  {
               System.out.println("Items found, i= " + i + " j="+ j);
                    return;
        }
           if(temp < k)  i = i+1;
           else if(temp > k) j = j-1;
        }
         System.out.println("No Items found");  
    }
     public static void twoSumKOptimizedBetter(int[] arr,int k) {
        if(arr.length < 2)
            return;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i = 0; i < arr.length; i++) {
             if(map.containsKey(arr[i])) {
                 System.out.println("Items found, i= " + i + " j="+ map.get(arr[i]));
                 return;
             }
             map.put(k-arr[i], i);
             
         }
           System.out.println("No Items found");  
    }
    
    public static void main(String args[]) {
        int[] Arr = {5, 2, 4, 5, 2, 3, 1};
       // twoSumK(Arr,6);
     //  twoSumKOptimized(Arr,20);
     twoSumKOptimizedBetter(Arr,6);
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
    
}
