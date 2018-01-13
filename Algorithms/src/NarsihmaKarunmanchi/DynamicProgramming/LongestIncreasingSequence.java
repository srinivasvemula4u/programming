/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class LongestIncreasingSequence {
    public static int longestIncreasingSequence(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;
        int[] listTable = new int[n+1];
        for(int i =0; i < arr.length; i++) 
            listTable[i] = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && listTable[i] < (listTable[j] +1))
                    listTable[i] = listTable[j]+1;                            
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(max < listTable[i])
                max = listTable[i];
        }
        return max;
    }
    /*
    Let L9i) represent the optimal subsequence which is startig at position A[i] and ending at A[n]. 
    
    L(i) = Max i < j and A[i] < A[j] (L(j))+1;
    */
      public static int longestIncreasingSequenceNew(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;
        int[] listTable = new int[n+1];
        for(int i =0; i < arr.length; i++) 
            listTable[i] = 1;
        for(int i = arr.length; i >= 0; i--) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i] && listTable[i] < (listTable[j] +1))
                    listTable[i] = listTable[j]+1;                            
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(max < listTable[i])
                max = listTable[i];
        }
        return max;
    }
    public static void main(String args[]) {
        int[] arr = {5,6,2,3,4,1,9,9,8,9,5};
        System.out.println(longestIncreasingSequence(arr));
        System.out.println(longestIncreasingSequenceNew(arr));
    }
}
