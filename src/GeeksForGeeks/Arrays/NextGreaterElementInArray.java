/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

import java.util.Stack;

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
    private static void greaterElementMethod2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int next = Integer.MIN_VALUE;
        for(int i=1; i < arr.length;  i++) {
           next = arr[i];
           if(!stack.isEmpty()) {
               int element = stack.pop();
               while(element < next) {
                   System.out.println(element + " ------------ " + next);
                   if(stack.isEmpty())
                       break;
                   element = stack.pop();
               }
               if(element > next)
                   stack.push(element);
           }
           stack.push(next);
        }
        while(!stack.isEmpty()) {
            int element = stack.pop();
            next = -1;
            System.out.println(element + " ------------ " + next);
        }
        
    }
    public static void main(String[] args) {
       int[] arr= {11, 13, 21, 3};
        greaterElementMethod(arr);
        System.out.println("*******************");
        greaterElementMethod2(arr);
    }
    
}
