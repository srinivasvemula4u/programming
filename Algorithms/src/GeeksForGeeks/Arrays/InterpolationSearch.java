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
public class InterpolationSearch {

    /**
     * @param args the command line arguments
     */
    private static int search(int[] arr,int x) {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high && arr[low] <= x && arr[high] >= x) {
            int pos = low + (x-arr[low])*(high-low)/(arr[high]-arr[low]);
            if(arr[pos] == x)
                return pos;
             if(arr[pos] < x)
                 low = pos + 1;
             else 
                 high = pos-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr =  {10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                  24, 33, 35, 42, 47};
        System.out.println(search(arr, 18));
    }
    
}
