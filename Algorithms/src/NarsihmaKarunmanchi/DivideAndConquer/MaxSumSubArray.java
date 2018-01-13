/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DivideAndConquer;

/**
 *
 * @author srivemul
 */
public class MaxSumSubArray {
    public static int maxSumSubArray(int[] arr) {
        if(arr.length  <= 0)
            return 0;
        return maxSumSubArray(arr,0,arr.length-1);
    }

    private static int maxSumSubArray(int[] arr, int low, int high) {
        int leftMidSum = Integer.MIN_VALUE,rightMidSum = Integer.MIN_VALUE, sum = 0;
        if( low == high)
            return arr[low];
        int mid = low + (high-low)/2;
        int maxLeftSum = maxSumSubArray(arr,low,mid);
        int maxRightSum = maxSumSubArray(arr, mid+1, high);
        for(int i=mid; i >= 0; i--) 
        {
            sum = sum + arr[i];
            leftMidSum = sum > leftMidSum ? sum : leftMidSum;
        }
        sum = 0;
        for(int i = mid+1; i <= high; i++) {
            sum = sum + arr[i];
            rightMidSum = sum > rightMidSum ? sum : rightMidSum;
        }
        return max3(maxLeftSum,maxRightSum,(leftMidSum+rightMidSum));
    }

    private static int max3(int a, int b, int c) {
        return a > b ? ( a > c ? a : c) : (b > c ? b : c);
    }
    public static void main(String args[]) {
        //int[] arr = {-2,11,-4,13,-5,2};
        int[] arr = {1,-3,4,-2,-1,6};
        System.out.println(maxSumSubArray(arr));
    }
}
