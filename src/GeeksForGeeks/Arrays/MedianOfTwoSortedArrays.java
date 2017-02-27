/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul Method 1 (Simply count while Merging) Use merge procedure of
 * merge sort. Keep track of count while comparing elements of two arrays. If
 * count becomes n(For 2n elements), we have reached the median. Take the
 * average of the elements at indexes n-1 and n in the merged array. See the
 * below implementation.
 */
public class MedianOfTwoSortedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ar1 = {1, 12, 15, 26, 38};
        int[] ar2 = {2, 13, 17, 30, 45};
        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2) {
            System.out.printf("Median is %d\n", getMedian(ar1, ar2, n1));
        } else {
            System.out.printf("Doesn't work for arrays of unequal size");
        }
    }

    private static int getMedian(int[] ar1, int[] ar2, int n) {
        int i = 0;
        /* Current index of i/p array ar1[] */
        int j = 0;
        /* Current index of i/p array ar2[] */
        int count = 0;
        int m1 = -1, m2 = -1;
        /* Since there are 2n elements, median will be average
     of elements at index n-1 and n in the array obtained after
     merging ar1 and ar2 */
        for (count = 0; count <= n; count++) {
            /*Below is to handle case where all elements of ar1[] are
          smaller than smallest(or first) element of ar2[]*/
            if (i == n) {
                m1 = m2;
                m2 = ar2[0];
                break;
            } /*Below is to handle case where all elements of ar2[] are
          smaller than smallest(or first) element of ar1[]*/ else if (j == n) {
                m1 = m2;
                m2 = ar1[0];
                break;
            }
            if (ar1[i] < ar2[j]) {
                m1 = m2;
                /* Store the prev median */
                m2 = ar1[i];
                i++;
            } else {
                m1 = m2;
                m2 = ar2[j];
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

}
