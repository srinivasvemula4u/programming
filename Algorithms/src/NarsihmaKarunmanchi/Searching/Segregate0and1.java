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
public class Segregate0and1 {

    public static void segregate0and1(int[] arr) {
        int left = 0, right = (arr.length - 1);
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void print(int[] arr) {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    } 
      public static void main(String args[]) {
        int[] Arr = {0,1,0,1,0,0,1,1,1,0};
        print(Arr);
       segregate0and1(Arr);
         print(Arr);
        

        //System.out.println(lastOccuranceOfANumberInSortedArray(Arr,0,Arr.length-1,4));
    }
}
