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
public class MergeSort {

    private static Comparable[] aux;

    public static void merge(Comparable a[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        //   Comparable[] aux = new Comparable[a.length];
        for (int k = 0; k < high; k++) {
            aux[k] = a[k];
        }
        for (int k = 0; k < high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        //return a < b;
        return a.compareTo(b) < 0;
    }

    public static void sort(Comparable a[]) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void print(Comparable a[]) {
        for (Comparable a1 : a) {
            System.out.print(" " + a1);
        }
    }

    private static void sort(Comparable a[], int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void main(String args[]) {
        Comparable[] a = {8, 9, 1, 3, 4, 6, 5, 2, 7};
        print(a);
        sort(a);
        System.out.println();
        print(a);
    }
}
