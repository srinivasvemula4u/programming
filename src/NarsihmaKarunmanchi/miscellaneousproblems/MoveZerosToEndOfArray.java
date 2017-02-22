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
public class MoveZerosToEndOfArray {
   public static void main(String args[]) {
       int[] arr = {0,1,9,8,4,0,0,2,7,0,6,0};
       int count = 0;
     /*  for (int i =0; i < arr.length; i++) {
           if( arr[i] != 0) {
               arr[count++] = arr[i];
           }
       }
       while(count < arr.length) 
           arr[count++] = 0; */
       moveZerosToEndOfArray(arr);
        for(int i =0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
   } 
   public static void moveZerosToEndOfArray(int[] arr) {
       for (int i =0, j = 0; i < arr.length; i++) {
           if( arr[i] != 0) {
               mySwap(arr,i,j++);
           }
       }
   }

    private static void mySwap(int[] arr, int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}
