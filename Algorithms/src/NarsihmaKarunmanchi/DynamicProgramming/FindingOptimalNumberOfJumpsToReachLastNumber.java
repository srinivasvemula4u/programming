/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/**
 *
 * @author srivemul
 */
public class FindingOptimalNumberOfJumpsToReachLastNumber {
    public static List<Integer> optimalJumps(int[] arr) {
        int[] jumpsLength = new int[arr.length];
        int[] prevIndex = new int[arr.length];
        for(int i=1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
          for(int j =0; j < i; j++) {
              int diff = i -j;
              if(arr[j] >= diff && jumpsLength[j] < min) {
                  min = jumpsLength[j] + 1;
                  jumpsLength[i] = min;
                  prevIndex[i] = j;
              }
          }
          
        }
        printArray(jumpsLength);
        printArray(prevIndex);
        List<Integer> list = new ArrayList<>();
        int ctr = arr.length - 1;
        while(ctr > 0) {
            list.add(ctr);
            ctr = prevIndex[ctr];
        }
        list.add(0);
        Collections.reverse(list);
        return list;
    }
    public static void printArray(int[] arr) {
        for(int a : arr) 
            System.out.print(a + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(optimalJumps(arr));
    }
    
}
