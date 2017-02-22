/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

/**
 *
 * @author srivemul
 */
public class CountSort {

    public static void sort(int[] arrA) {
        int[] arrB = new int[arrA.length];
        countingSort(arrA, arrB, 10);
    }

    /*  private static void countingSort(int[] arrA, int[] arrB, int k) {
        int[] arrC = new int[k];
        for(int i = 0; i < k; i++)
            arrC[i] = 0;
        print(arrA);
        print(arrC);
        for(int j =0; j < arrA.length; j++) {
            arrC[arrA[j]] = arrC[arrA[j]] + 1; 
        }
        for(int i = 1; i < k; i++) {
            arrC[i] = arrC[i] + arrC[i-1];
        }
        for(int j = arrA.length-1; j>= 0; j--) {
            arrB[arrC[arrA[j]]] = arrA[j];
            arrC[arrA[j]]--;
        }
        
    }*/
    private static void countingSort(int[] arrA, int[] arrB, int k) {
        int[] arrC = new int[k];
        for (int i = 0; i < k; i++) {
            arrC[i] = 0;
        }
        for (int j = 0; j < arrA.length; j++) {
            arrC[arrA[j]] = arrC[arrA[j]] + 1;
        }
        for (int i = 1; i < k; i++) {
            arrC[i] = arrC[i] + arrC[i - 1];
        }
        for (int i = 0; i < arrA.length; i++) {
            arrB[arrC[arrA[i]] - 1] = arrA[i];
            arrC[arrA[i]]--;
        }
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = arrB[i];
        }
    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] a = {0, 5, 1, 3, 4, 6, 8, 2, 7};
        print(a);
        sort(a);
        System.out.println();
        print(a);
    }

}
