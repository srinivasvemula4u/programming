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
public class QuickSort3Way {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int i = low + 1;
        Comparable pivot = a[low];
        int lt = low;
        int gt = high;
        while (i <= gt) {
            int comp = a[i].compareTo(pivot);
            if (comp < 0) {
                exchange(a, lt++, i++);
            } else if (comp > 0) {
                exchange(a, i, gt--);
            } else {
                i++;
            }
        }

        sort(a, low, lt - 1);
        if (gt > low) {
            sort(a, gt - 1, high);
        } else {
            sort(a, gt, high);
        }
    }

    private static void exchange(Comparable[] a, int i, int j) {

        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void print(Comparable[] a) {
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
