/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 *  Roatate(arr,d, n); 
 * Reverse(arr,1,d); 
 * Reverse(arr,d+1,n);
 *
 */
public class ReverseArrayByNRoatations {

    /**
     * @param args the command line arguments
     */
    public static void leftRotateArray(int[] arr, int n, int d) {
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotateArray(arr, 7, 2);
    }

}
