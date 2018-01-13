/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given an infinite array in which the first n cells contain integers in sorted order and the rest of the cells are filled with some special
symbols ($), assume we do not know the n value.Give an algorithm that takes an integer k as input and findis a position in the array
containing k.if position exist in o(logn)
*/
package NarsihmaKarunmanchi.DivideAndConquer;

/**
 *
 * @author srivemul
 */
public class FindInInfiniteSeries {
   public static int findInInfiniteSeries(int[] arr,int k) {
       int mid , l =0, r = 1;
       while( r < arr.length && arr[r] != '$')
           r = r*2;
       while(r < arr.length && arr[r] == '$')
           r--;
       while( l < r) {
             mid =  (r - l)/2 + 1; 
             if( arr[mid] == k)
                 return mid;
             else if( arr[mid] < k) 
                 l = mid+1;
             else 
                 r = mid -1;
       }
       return -1;
   } 
   public static void main(String args[]) {
       int[] arr = {1,2,3,4,5,6,7,8,9,'$','$','$','$','$','$','$'};
       System.out.println(findInInfiniteSeries(arr, 0));
   }
}
