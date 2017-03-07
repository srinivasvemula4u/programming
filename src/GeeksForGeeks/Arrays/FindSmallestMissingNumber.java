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
public class FindSmallestMissingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println(findMissingNumber(arr,0,arr.length-1));
    }

    private static int findMissingNumber(int[] arr,int start,int end) {
       if(start > end)
           return end+1;
       if( start != arr[start])
           return start;
       int mid = (start+end)/2;
       if(arr[mid] > mid)
           return findMissingNumber(arr, start, mid-1);
       else 
           return findMissingNumber(arr, mid+1, end);
       
    }
    
}
