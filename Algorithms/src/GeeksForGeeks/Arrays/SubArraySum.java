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
public class SubArraySum {

    /**
     * @param args the command line arguments
     */
    /*
    Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
There may be more than one subarrays with sum as the given sum
     */
 /*
    Method 1 (Simple) 
A simple solution is to consider all subarrays one by one and check the sum of every subarray. 
    Following program implements the simple solution. We run two loops: the outer loop picks a starting point i 
    and the inner loop tries all subarrays starting from i.
     */
    public static boolean findSubArraySum(int[] arr, int sum) {
        int n = arr.length;
        int cur_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cur_sum = arr[i];
            for (int j = i + 1; j <= n; j++) {
                if (cur_sum == sum) {
                    System.out.println("Sum found between " + i + " and " + (j - 1));
                    return true;
                }
                if ((cur_sum + arr[j]) > sum || j == n) {
                    break;
                }
                cur_sum += arr[j];
            }
        }
        return false;
    }

    /*
    
Method 2 (Efficient)
Initialize a variable curr_sum as first element. curr_sum indicates the sum of current subarray. Start from the second element and add all elements one by one to the curr_sum. If curr_sum becomes equal to sum, then print the solution. 
    If curr_sum exceeds the sum, then remove trailing elemnents while curr_sum is greater than sum.
     */
   public static boolean findSubArraySumMethod2(int[] arr, int sum) {
       int n = arr.length;
       int cur_sum = arr[0];
       int start = 0;
       for(int i =1; i <=n; i++) {
           while(cur_sum > sum && start < i-1) {
               cur_sum = cur_sum - arr[start];
               start++;
           }
           if (cur_sum == sum) {
                    System.out.println("Sum found between " + start + " and " + (i - 1));
                    return true;
                }
           if ( i < n)
               cur_sum = cur_sum + arr[i];
           
       }
       return false;
   }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        System.out.println(findSubArraySum(arr, 23));
         System.out.println(findSubArraySumMethod2(arr, 23));
    }

}
