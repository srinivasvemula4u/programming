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
public class InsertionSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        //return a < b;
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(Comparable a[]) {
        for (Comparable a1 : a) {
            System.out.print(" " + a1);
        }
    }

    public static void main(String args[]) {
        Comparable[] a = {8, 9, 1, 3, 4, 6, 5, 2, 7};
        print(a);
        sort(a);
        System.out.println();
        print(a);
    }
}
