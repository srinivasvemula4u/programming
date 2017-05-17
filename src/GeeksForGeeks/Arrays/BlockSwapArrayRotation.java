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
/*
Block swap algorithm for array rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

Array

Rotation of the above array by 2 will make array

ArrayRotation1

Algorithm:

Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.
*/
public class BlockSwapArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 0, 2, 7);
        printArray(arr);
    }

    private static void leftRotate(int[] arr, int start, int d, int n) {
        /* Return If number of elements to be rotated is 
    zero or equal to array size */
        if (d == 0 || d == n) {
            return;
        }
        if (d == n - d) {
            swap(arr, start, 0, d, n - d);
        }
        if (d < n - d) {
            swap(arr, start, 0, n - d, d);
            leftRotate(arr, start, d, n - d);
        } else {
            swap(arr, start, 0, d, n - d);
            leftRotate(arr, n - d, 2 * d - n, d);
        }
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val);
        }
        System.out.println();
    }

    private static void swap(int[] arr, int start, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + start + i];
            arr[fi + start + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }
}
