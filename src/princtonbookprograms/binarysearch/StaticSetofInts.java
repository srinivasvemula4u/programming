/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.binarysearch;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class StaticSetofInts implements StaticSetofIntsInterface {

    public StaticSetofInts(int key[]) {
        a = new int[key.length];
        for (int i = 0; i < key.length; i++) {
            a[i] = key[i];
        }
        Arrays.sort(a);
    }

    @Override
    public int contains(int key) {
        return rank(key);
    }

    private int rank(int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else if (key == a[mid]) {
                return mid;
            }
        }
        return -1;
    }
    private int[] a;

    public static void main(String args[]) {

        int[] arr = {8, 9, 0, 3, 4, 5, 1, 7, 2, 6};
        StaticSetofIntsInterface obj = new StaticSetofInts(arr);
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (obj.contains(key) == -1) {
                StdOut.println(key);
            }
        }
    }
}
