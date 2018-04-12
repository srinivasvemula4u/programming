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
public class MergeSortKarumanchiWay {

    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        MergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void MergeSort(int[] A, int[] temp, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            MergeSort(A, temp, left, mid);
            MergeSort(A, temp, mid + 1, right);
            Merge(A, temp, left, mid + 1, right);
        }
    }

    private static void Merge(int[] A, int[] temp, int left, int mid, int right) {
        int left_end = mid - 1;
        int temp_pos = left;
        int size = right - left + 1;
        while ((left <= left_end) && (mid <= right)) {
            if (A[left] <= A[mid]) {
                temp[temp_pos] = A[left];
                left = left + 1;
                temp_pos++;
            } else {
                temp[temp_pos] = A[mid];
                mid = mid + 1;
                temp_pos++;
            }
        }
        while (left <= left_end) {
            temp[temp_pos] = A[left];
            left = left + 1;
            temp_pos++;
        }
        while (mid <= right) {
            temp[temp_pos] = A[mid];
            mid = mid + 1;
            temp_pos++;
        }
        for (int i = 0; i < size; i++) {
            A[right] = temp[right];
            right = right - 1;
        }

    }

    private static void print(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] a = {9, 1, 3, 4, 6, 5, 2, 7, 8};
        print(a);
        sort(a);
        System.out.println();
        print(a);
    }
}
