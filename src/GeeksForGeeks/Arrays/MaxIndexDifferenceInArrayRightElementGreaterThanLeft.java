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
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr));
    }
    
}
