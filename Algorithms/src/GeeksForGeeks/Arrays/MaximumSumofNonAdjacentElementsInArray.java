/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 * Algorithm:
Loop for all elements in arr[] and maintain two sums incl and excl where incl = Max sum including the previous element and excl = Max sum excluding the previous element.

Max sum excluding the current element will be max(incl, excl) and max sum including the current element will be excl + current element (Note that only excl is considered because elements cannot be adjacent).

At the end of the loop return max of incl and excl.
 */
public class MaximumSumofNonAdjacentElementsInArray {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        System.out.printf("%d \n", FindMaxSum(arr));
    }

    private static int FindMaxSum(int[] arr) {
        int excl = 0;
        int incl = arr[0];
        int excl_new = 0;
        for(int i = 1; i < arr.length; i++) {
            excl_new = excl > incl ? excl : incl;
            incl = excl + arr[i];
            excl = excl_new;
        }
        return excl > incl ? excl : incl;
    }
}
