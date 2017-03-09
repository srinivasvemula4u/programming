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
public class MaxIndexDifferenceInArrayRightElementGreaterThanLeft {

    /**
     * @param args the command line arguments
     */
    private static int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int maxDiff = Integer.MIN_VALUE;
        for(int i =0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if( arr[j] > arr[i] &&  (j - i) > maxDiff)
                    maxDiff = (j-i);
            }
        }
        return maxDiff;
    }
    
    private static int maxIndexDiffMethod2(int[] arr) {
        int n = arr.length;
        int[] minLeft = new int[n];
        int[] maxRight = new int[n];
        minLeft[0] = arr[0];
        for(int i =1; i < n; i++) 
            minLeft[i] = Math.min(minLeft[i-1], arr[i]);
        maxRight[n-1] = arr[n-1];
        for(int i = n-2; i >=0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i+1]);
        }
        int maxDiff = Integer.MIN_VALUE;
        for(int i =0, j = 0; i < n && j < n;) {
            if(minLeft[i] < maxRight[j]) {
               maxDiff = Math.max(maxDiff, j-i);
               j++;
        }
            else 
                i++;
    }
       return maxDiff; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr));
        System.out.println(maxIndexDiffMethod2(arr));
    }
    
}
