/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.sorting;

/**
 *
 * @author srivemul
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

  public static void insertIntoSorted(int[] arr) {
        // Fill up this function  
        int i= arr.length-1;
        int temp = arr[i];
        int j;
        for(j=arr.length-1; j > 0 && temp < arr[j-1]; j--) {
           // int temp = arr[j];
            arr[j] = arr[j-1];
            //arr[]
           printArray(arr);
           
        }
        arr[j] = temp;
         printArray(arr);
    } 
/* Tail starts here */
//     public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int s = in.nextInt();
//        int[] ar = new int[s];
//         for(int i=0;i<s;i++){
//            ar[i]=in.nextInt(); 
//         }
//         insertIntoSorted(ar);
//    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        int[] arr = new int[4];
        for(int i=0; i < tc; i++) {
            arr[0] = scanner.nextInt();
             arr[1] = scanner.nextInt();
             arr[2] = scanner.nextInt();
             arr[3] = scanner.nextInt();
             int temp =0;
            System.out.println((arr[0]+arr[2])+' '+arr[1]+arr[3]);
        }
    }
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }  
}
