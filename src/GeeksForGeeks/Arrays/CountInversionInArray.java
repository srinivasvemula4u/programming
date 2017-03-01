/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 * METHOD 1 (Simple)
For each element, count number of elements which are on right side of it and are smaller than it.
 */
public class CountInversionInArray {
    private static int countInversionsInArray(int[] arr) {
        int n = arr.length;
        int numOfInversions = 0;
        for(int i =0; i < n; i++) {
            for(int j = i +1; j < n; j++) {
                if( arr[i] > arr[j])
                    numOfInversions++;
            }
        }
         return numOfInversions;
    }
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(countInversionsInArray(arr));
    }
   
}
