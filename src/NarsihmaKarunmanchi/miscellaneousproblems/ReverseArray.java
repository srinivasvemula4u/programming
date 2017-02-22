/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author srivemul
 */
public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
           for(int i =0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
           System.out.println();
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
          for(int i =0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while(start < end) {
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
