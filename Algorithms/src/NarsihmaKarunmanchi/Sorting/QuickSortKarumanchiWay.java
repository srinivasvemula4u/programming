/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

/**
 *
 * @author srivemul
 */
public class QuickSortKarumanchiWay {
    public static void sort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {
      if(high > low) {
          int pivot = partition(arr,low,high);
          quickSort(arr, low, pivot-1);
          quickSort(arr, pivot+1, high);
      }
    }

    private static int partition(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int pivot_item = arr[low];
        while(left < right) {
            while(left <= high && arr[left] <= pivot_item)
                left++;
            while(right >= low && arr[right] > pivot_item)
                right--;
            if(left < right)
               swap(arr,left,right);
        }
        arr[low] = arr[right];
        arr[right] = pivot_item;
        return right;
    }
     private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }


    private static void swap(int[] arr, int left, int right) {
       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;
    }
    public static void main(String args[])
    {
        int[] a = {9,8,1,3,4,6,5,2,7};
        print(a);
        sort(a);
        System.out.println();
         print(a);
    }
}
