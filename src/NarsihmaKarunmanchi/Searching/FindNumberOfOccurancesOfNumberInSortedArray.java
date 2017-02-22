/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

/**
 *
 * @author srivemul
 */
public class FindNumberOfOccurancesOfNumberInSortedArray {
    public static void findNumberOfOccurancesOfNumberInSortedArray(int[] arr,int data) {
      int count = 0;
        for(int i=0; i < arr.length; i++) {
          if(arr[i] == data)
              count++;
        }
        System.out.println(count);
    }
     public static void main(String args[]) {
        int[] Arr = {1, 2, 3, 4, 4, 4, 4};
        findNumberOfOccurancesOfNumberInSortedArray(Arr,4);
        
        //System.out.println(lastOccuranceOfANumberInSortedArray(Arr,0,Arr.length-1,4));
    }
}
