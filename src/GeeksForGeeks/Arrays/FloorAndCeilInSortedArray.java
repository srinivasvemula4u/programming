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
public class FloorAndCeilInSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,2,8,10,10,12,19};
        int x = 4;
        int ceil = findCeil(arr,x);
        if(ceil == -1) {
            System.out.println("No ceil present in the array");
        } else {
            System.out.println("Ceil of " + x + " is " + arr[ceil]);
        }
        System.out.println();
        int floor = findFloor(arr,x);
        if(floor == -1) {
            System.out.println("No floor present in the array");
        } else {
            System.out.println("floor of " + x + " is " + arr[floor]);
        }
        System.out.println();
        ceil = findCeilUsingBinarySearch(arr,0,arr.length-1,x);
        if(ceil == -1) {
            System.out.println("No ceil present in the array");
        } else {
            System.out.println("Ceil of " + x + " is " + arr[ceil]);
        }
        System.out.println();
        floor = findFloorByUsingBinarySearch(arr,0,arr.length-1,x);
        if(floor == -1) {
            System.out.println("No floor present in the array");
        } else {
            System.out.println("floor of " + x + " is " + arr[floor]);
        }
        System.out.println();
    }

    private static int findCeil(int[] arr,int x) {
       int low = 0, high = arr.length-1;
       if( arr[low] >= x)
           return low;
       for(int i = low; i < high; i++) {
           if(arr[i] == x)
               return i;
           if( arr[i] < x && arr[i+1] >= x)
               return i+1;
       }
       return -1;
    }
    private static int findCeilUsingBinarySearch(int[] arr, int low, int high,int x) {
        if(arr[low] >= x)
            return low;
        if( x > arr[high]) 
            return -1;
        int mid = (low + high) / 2;
        if( arr[mid] == x)
            return mid;
        else if(arr[mid] < x) {
            if( mid + 1 <= high && arr[mid+1] >= x)
                return mid+1;
            else 
                return findCeilUsingBinarySearch(arr, mid+1, high, x);
        }
        else {
            if( mid -1  >= low && arr[mid-1] < x) {
                return mid;
            }
            else 
                return findCeilUsingBinarySearch(arr, low, mid-1, x);
        }
    }
     private static int findFloor(int[] arr,int x) {
       int low = 0, high = arr.length-1;
       if( x < arr[low] )
           return -1;
       for(int i = low; i < high; i++) {
           if(arr[i] == x)
               return i;
           if( arr[i] < x && arr[i+1] >= x)
               return i;
       }
       if(arr[high] < x)
           return high;
       return -1;
    }
     private static int findFloorByUsingBinarySearch(int[] arr, int low, int high,int x) {
         if(x < arr[low] ) 
             return -1;
         if(x > arr[high])
             return high;
         int mid = (low+high)/2;
         if(arr[mid] == x)
             return mid;
         if(arr[mid] < x) {
             if( mid +1 <= high && arr[mid+1] > x)
                 return mid;
             else 
                 return findFloorByUsingBinarySearch(arr, mid+1, high, x);
         }
         else {
             if( mid -1 >= low && arr[mid - 1] <= x)
                 return mid-1;
             else return findFloorByUsingBinarySearch(arr, low, mid-1, x);
         }
      
         
     }
}
