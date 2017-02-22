/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.SelectionAlgorithms;

/**
 *
 * @author srivemul
 */
public class FindKthSmallestElementInArray {
   private static int getPartition(int[] arr,int low,int high) {
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
   private static int orderstatistics(int[] arr,int start,int end,int k) {
       int pivot = getPartition(arr, start, end);
       if(k-1 == pivot)
           return arr[k-1];
       if(k-1 < pivot) {
           return orderstatistics(arr, start, pivot-1, k);
       }
       return orderstatistics(arr, pivot+1, end, k);
   }
   // Iterative version;
   private static int orderstatisticsIterative(int[] arr,int start,int end,int k) {
       int pivot = getPartition(arr, start, end);
       while(pivot != k-1) {
           if(k-1 < pivot)
               end = pivot -1 ;
           else 
               start = pivot+1;
           pivot = getPartition(arr, start, end);
       }
       return arr[k-1];
   }

    private static void swap(int[] arr, int start, int end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
    }
    public static int kthSmallest(int [] arr, int k) {
      return orderstatistics(arr, 0, arr.length-1, k);
    }
    public static void main(String args[]) {
        
        int[] a = {9,8,1,3,4,6,5,2,7};
        int k= kthSmallest(a, 9);
        System.out.println(k);
       
    }
}
