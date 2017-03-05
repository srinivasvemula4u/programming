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
public class ProductArrayPuzzle {

    /**
     * @param args the command line arguments
     */
    private static void productArrayPuzzleMethod1(int[] arr) {
        int n = arr.length;
        int[] tempLeft = new int[arr.length];
        int[] tempRight = new int[arr.length]; 
        int[] prod = new int[arr.length];
        tempLeft[0] = 1;
        for(int i =1; i < n; i++) {
          tempLeft[i] = arr[i-1]*tempLeft[i-1];            
        }
        tempRight[n-1] = 1;
        for(int j = n - 2; j >= 0; j--) {
            tempRight[j] = arr[j+1]*tempRight[j+1];
        }
        for(int i= 0; i < n; i++) {
            prod[i] = tempLeft[i] * tempRight[i];
        }
        printArray(prod);
        
    }
    private static void productArrayPuzzleMethod2(int[] arr) {
        int n = arr.length;
        int temp = 1;
        int[] prod = new int[n];
        for(int i =0; i < n; i++) {
            prod[i] = temp;
            temp = temp*arr[i];
        }
        temp = 1;
        for(int j= n-1; j >= 0; j--) {
            prod[j] = prod[j]*temp;
            temp = temp * arr[j];
        }
        printArray(prod);
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        productArrayPuzzleMethod1(arr);
        productArrayPuzzleMethod2(arr);
      }

    private static void printArray(int[] prod) {
       for(int val : prod) {
           System.out.print(val + " ");
       }
       System.out.println();
    }
    
}
