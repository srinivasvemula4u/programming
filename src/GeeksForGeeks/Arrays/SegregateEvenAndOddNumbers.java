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
public class SegregateEvenAndOddNumbers {

    /**
     * @param args the command line arguments
     */
   private static void segregateMethod2(int[] arr) {
        int left = 0, right = arr.length-1;
        while( left < right) {
            while( arr[left] % 2 == 0 && left < right)
                left++;
            while(arr[right] % 2 == 1 && right > left)
                right--;
            if(left < right) {
               int temp = arr[left]; 
                arr[left] = arr[right] ;
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    private static void printArray(int[] arr) {
        for(int val : arr) {
            System.out.print(val+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {33, 34, 45, 9, 8, 90, 3};
        //segregate(arr);
        segregateMethod2(arr);
        printArray(arr);
    }
    
}
