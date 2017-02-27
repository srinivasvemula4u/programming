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
public class LeadersInArray {

    /**
     * @param args the command line arguments
     * Method 1 (Simple)
Use two loops. The outer loop runs from 0 to size – 1 and one by one picks all elements from left to right. 
* The inner loop compares the picked element to all the elements to its right side. 
* If the picked element is greater than all the elements to its right side, 
* then the picked element is the leader.
   */
    public static void leadersInArrayMethod1(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int j;
            for( j = i+1; j < n; j++) {
                if(arr[i] < arr[j])
                    break;
            }
            if( j == n)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  
      public static void leadersInArrayMethod2(int[] arr) {
         int max_frm_end = arr[arr.length -1];
         System.out.print(max_frm_end + " "); 
         for(int i = arr.length - 2; i >= 0; i--) {
             if(arr[i] > max_frm_end) {
                 max_frm_end = arr[i];
                 System.out.print(max_frm_end + " ");
             }
         }
         System.out.println();
      }
    public static void main(String[] args) {
          int[] arr = {16, 17, 4, 3, 5, 2};
           leadersInArrayMethod1(arr);
           leadersInArrayMethod2(arr);
  
    }
    
}
