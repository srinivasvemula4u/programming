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
public class JumpSearch {

    /**
     * @param args the command line arguments
     */
    private static int search(int[] arr,int x) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0; 
        while(arr[Math.min(n, step)] < x) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
           if (prev >= n)
                return -1; 
        }
        while(arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
         // If element is found
        if (arr[prev] == x)
            return prev;
 
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
           int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                     34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        System.out.println(search(arr, x));
    }
    
}
