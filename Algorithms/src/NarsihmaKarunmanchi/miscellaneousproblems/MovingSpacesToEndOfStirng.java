package NarsihmaKarunmanchi.miscellaneousproblems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
public class MovingSpacesToEndOfStirng {
     public static void main(String args[]) {
        String str = "Move these spaces to beginning output";
      char [] arr = str.toCharArray();
     /*  int n = str.length() -1;
       int j = 0;
        for(int i=0; i <=n; i++) {
            if(!Character.isSpaceChar(arr[i])) {
                swap(arr,j++,i);
            }
        }*/
        anotherVersion(arr);
        System.out.println(String.valueOf(arr, 0, str.length()));
    }
      public static void anotherVersion(char[] arr) {
        int count = 0;
        for(int i = count; i <=arr.length-1; i++) {
            if(!Character.isSpaceChar(arr[i])) {
                arr[count++] = arr[i];
            }
        }
        while(count <= arr.length-1) 
            arr[count++] = ' ';
    }
     private static void swap(char[] arr, int m, int n) {
       char temp = arr[m];
       arr[m] = arr[n];
       arr[n] = temp;
    }
}
