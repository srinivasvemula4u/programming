/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class SmallestAndSecondSmallestElemInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {12, 13, 1, 10, 34, 1};
        smallestAndSecondSmallestInArray(arr);
        
    }

    private static void smallestAndSecondSmallestInArray(int[] arr) {
       int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
       for(int i = 0; i < arr.length; i++) {
           if( arr[i] <  first) {
               second = first;
               first = arr[i];
           } else if( arr[i] < second && arr[i] != first) {
               second = arr[i];
           }
        }
       System.out.println(first + " " + second);
    }
    
}
