/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.HashTables;

import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class RemoveDuplicatesInArray {

    public static void removeDuplicatesInArray(int[] arr) {
        int index = 0;
        arr[index++] = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            arr[index++] = arr[i + 1];
        }
        printArray(arr, index);
    }

    public static void removeDuplicatesInArrayUsingHash(int[] arr) {
        int index = 0;
        arr[index++] = arr[0];
        // Has
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            arr[index++] = arr[i + 1];
        }
        printArray(arr, index);
    }

    private static void printArray(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 3, 3, 2, 4, 4, 5, 6, 2};
        Arrays.sort(arr);
        removeDuplicatesInArray(arr);
    }
}
