/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

/**
 * @author srivemul
 */
public class RemoveDuplicatesInArray {

    public static int removeDuplicatesInArray(int[] A) {
        int i = 0;
        int len = A.length;
        if (len <= 1) {
            return len;
        }
        for (int j = 1; j < len; j++) {
            if (A[i] != A[j]) {
                A[++i] = A[j];
            }
        }
        for (int k = i; k < len; k++) {
            A[k] = -1;
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 3, 3, 3, 2, 1};
        int n = arr.length;
        print(arr);
        n = removeDuplicatesInArray(arr);
        System.out.println("new length = " + n);
        print(arr);
    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
