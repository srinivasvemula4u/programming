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
// Negative Characters First and last 
public class SeparatePositiveAndNegativeNumbersInArray {
      public static void main(String args[]) {
       int[] arr = {-5,3,2,5,-1,4,-8,-7,1};
       int count = 0;
     /*  for (int i =0; i < arr.length; i++) {
           if( arr[i] <= 0) {
               arr[count++] = arr[i];
           }
       }
       while(count < arr.length) 
           arr[count++] = 0;*/
       separatePositiveAndNegativeNumbersInArray(arr);
        for(int i =0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
   } 
      public static void separatePositiveAndNegativeNumbersInArray(int[] arr) {
          int lastpositiveInteger = Integer.MIN_VALUE;
       for (int i =0, j = 0; i < arr.length; i++) {
           if( arr[i] <= 0) {
               mySwap(arr,i,j++,lastpositiveInteger);
           }
           else {

               lastpositiveInteger = i;
           }
       }
   }

    private static void mySwap(int[] arr, int i, int j,int lastpasitiveInteger) {
        int temp = arr[i];
       if(lastpasitiveInteger != j &&  j < lastpasitiveInteger) {
           for(int k = i; k > j; k--)
               arr[k] = arr[k-1];
       }
      // arr[i] = arr[j];
       arr[j] = temp;
    }
}
