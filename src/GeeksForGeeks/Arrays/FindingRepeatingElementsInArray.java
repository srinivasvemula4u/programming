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
public class FindingRepeatingElementsInArray {

    /**
     * @param args the command line arguments
     */
    private static void method1(int[] arr) {
        for(int i =0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
    private static void method2(int[] arr) {
        int[] coun = new int[arr.length-2];
        for(int i =0; i < arr.length; i++) {
            
        }
    }
    private static void method3(int[] arr) {
        int xor = arr[0];
        int n = arr.length - 2;
        for(int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
        }
        for(int i =1; i <= n; i++) {
            xor ^= i;
        }
        int statusbit = xor & ~(xor -1);
        int x  = 0, y = 0;
        for(int i =0; i < arr.length; i++) {
            if( (arr[i] & statusbit) != 0)
                 x ^=  arr[i];
            else 
                y ^= arr[i];
        }
        for(int i = 1; i <= n; i++) {
            if( (i & statusbit) != 0)
                 x ^=  i;
            else 
                y ^= i;
        }
        System.out.println( x + " " + y);
    }
     private static void method4(int[] arr) {
         int n = arr.length;
         for(int i = 0; i < n; i++) {
             if(arr[Math.abs(arr[i])] > 0)
              arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
             else 
               System.out.print(Math.abs(arr[i]) + " ");
         }
     }
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        method1(arr);
        method3(arr);
        method4(arr);
    }
    
}
