/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author srivemul
 */
public class MoveSpaceToBeginOfString {
    public static void main(String args[]) {
        String str = "Move these spaces to beginning output";
      char [] arr = str.toCharArray();
       int n = str.length() -1;
        for(int i=n; i >=0; i--) {
            if(!Character.isSpaceChar(arr[i])) {
                swap(arr,n--,i);
            }
        }
       // anotherVersion(arr);
        System.out.println(String.valueOf(arr, 0, str.length()));
    }
    // Another version without using swap;
    public static void anotherVersion(char[] arr) {
        int count = arr.length-1;
        for(int i = count; i >=0; i--) {
            if(!Character.isSpaceChar(arr[i])) {
                arr[count--] = arr[i];
            }
        }
        while(count >= 0) 
            arr[count--] = ' ';
    }

    private static void swap(char[] arr, int m, int n) {
       char temp = arr[m];
       arr[m] = arr[n];
       arr[n] = temp;
    }
}
