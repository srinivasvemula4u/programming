/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class CircularArrayRotation {
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long q = sc.nextInt();
        long[] arr = new long[(int)n];
        long[]  querry = new long[(int)q];
        for(int i = 0 ; i < n; i++)
            arr[i] = sc.nextLong();
        for(int i=0; i < q; i++)
            querry[i] = sc.nextLong();
        CircularArrayRotation obj = new CircularArrayRotation();
       obj.circularRotateRight(arr,k);
        for(int i=0; i < k; i++) {
            System.out.println(arr[(int)querry[i]]);
        }
        
    }
    private void circularRotateRight(long[] arr,long k) {
        for(int i= 0; i < k; i++)
            circularRotateRightByOne(arr,arr.length);
    }
    private void circularRotateRightByOne(long[] arr,int len) {
        long temp = arr[len-1];
        int i;
        for(i=len-1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = temp;
    } 
}
