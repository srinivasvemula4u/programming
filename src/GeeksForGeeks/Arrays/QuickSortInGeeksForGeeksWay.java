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
public class QuickSortInGeeksForGeeksWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr= {1, 4, 45, 6, 10, -8};
        quickSort(arr);
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr) {
        int n = arr.length;
        quicksort(arr,0,n-1);
    }

    private static void quicksort(int[] arr, int si, int ei) {
       if( si < ei) {
           int pivot = partition(arr,si,ei);
           quicksort(arr, si, pivot-1);
           quicksort(arr, pivot+1, ei);
       }
    }

    private static int partition(int[] arr, int si, int ei) {
       int x = arr[ei];
       int i = si-1;
       for(int j = si; j <= ei -1; j++) {
           if( arr[j] <= x) {
               i++;
               swap(arr,i,j);
           }
       }
       swap(arr,i+1,ei);
       return i+1;
    }

    private static void swap(int[] arr,int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
