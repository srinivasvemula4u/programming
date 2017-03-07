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
public class NextGreaterElementInArray {

    /**
     * @param args the command line arguments
     */
    private static void greaterElementMethod(int[] arr) {
       int next = Integer.MIN_VALUE;
       int n = arr.length;
       for(int i=0; i < n; i++) {
           next = -1;
           for(int j = i+1; j < n; j++) {
               if(arr[i] < arr[j]) 
               {
                   next = arr[j];
                   break;
               }
           }
          System.out.println(arr[i] + " ---------- " + next);
       }
       
    }
    public static void main(String[] args) {
       int[] arr= {11, 13, 21, 3};
        greaterElementMethod(arr);
    }
    
}
