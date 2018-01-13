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
public class SearchElementInSortedAndRotatedArrayImproved {

    /**
     * @param args the command line arguments
     */
    // Returns index of key in arr[l..h] if key is present,
// otherwise returns -1
public static int search(int[] arr, int l, int h, int key)
{
    if (l > h) return -1;
 
    int mid = (l+h)/2;
    if (arr[mid] == key) return mid;
 
    /* If arr[l...mid] is sorted */
    if (arr[l] <= arr[mid])
    {
        /* As this subarray is sorted, we can quickly
           check if key lies in half or other half */
        if (key >= arr[l] && key <= arr[mid])
           return search(arr, l, mid-1, key);
 
        return search(arr, mid+1, h, key);
    }
 
    /* If arr[l..mid] is not sorted, then arr[mid... r]
       must be sorted*/
    if (key >= arr[mid] && key <= arr[h])
        return search(arr, mid+1, h, key);
 
    return search(arr, l, mid-1, key);
}
    public static void main(String[] args) {
          int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 8;
        System.out.printf("Index: %d\n", search(arr,0,arr.length-1,key));
    }
    
}
