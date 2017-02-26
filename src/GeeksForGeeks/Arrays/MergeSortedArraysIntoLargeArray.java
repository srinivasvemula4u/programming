/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class MergeSortedArraysIntoLargeArray {

    /**
     * @param args the command line arguments
     */
    private static final int NA = -1;

    public static void main(String[] args) {
        int[] mPlusN = {2, 8, NA, NA, NA, 13, NA, 15, 20};
        int N[] = {5, 7, 9, 25};

        int m = mPlusN.length;
        int n = N.length;

        /*Move the m elements at the end of mPlusN*/
        moveToEnd(mPlusN, m);

        /*Merge N[] into mPlusN[] */
        merge(mPlusN, N, m, n);

        /* Print the resultant mPlusN */
        printArray(mPlusN);

    }

    private static void moveToEnd(int[] mPlusN, int m) {
        int j = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (mPlusN[i] != NA) {
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }

    private static void merge(int[] mPlusN, int[] N, int m, int n) {
        int i = n, j = 0, k = 0;
        while (k < m) {
            if (i < m && (mPlusN[i] <= N[j]) || (j == n)) {
                mPlusN[k] = mPlusN[i];
                k++;
                i++;
            } else {
                mPlusN[k] = N[j];
                k++;
                j++;
            }
        }
    }

    private static void printArray(int[] mPlusN) {
        for (int val : mPlusN) {
            System.out.print(val + " ");
        }
    }

}
