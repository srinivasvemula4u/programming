/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul // not finished need to check
 */
public class MedianOfTwoSortedArrayImproved {

    /**
     * @param args the command line arguments
     */
    /**
     * This function returns median of ar1[] and ar2[]. Assumptions in this
     * function: Both ar1[] and ar2[] are sorted arrays Both have n elements
     */
    public static int getMedianMethod2(int ar1[], int ar2[], int start1,
            int end1, int start2, int end2) {
        int n = end1 - start1 + 1;
        int n2 = end2 - start2 + 1;
        if (n != end2 - start2 + 1 ) {
            return -1;
        }
        /* return -1 for invalid input */
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return (ar1[start1] + ar2[start2]) / 2;
        }
        if (n == 2) {
            return (Math.max(ar1[start1], ar2[start2]) + Math.min(ar1[end1],
                    ar2[end2])) / 2;
        }

        int m1 = median(ar1, n);
        /* get the median of the first array */
        int m2 = median(ar2, n2);
        /*
* get the median of the second
* array
         */

        if (m1 == m2) {
            return m1;
        }
         if( m1 < m2) {
             if( n % 2 == 0) {
                 return getMedianMethod2(ar1, ar2, (start1+n/2-1), end1, start2, n-n/2+1);
             }
             else{
             return getMedianMethod2(ar1, ar2, start1+n/2, end1, start2, n - n /2 -1);
           }
         }
         else {
             if( n % 2 == 0) {
                 return getMedianMethod2(ar1, ar2, start1, n-n/2+1, start2+n/2-1, end2);
             }
             else {
                 return getMedianMethod2(ar1, ar2, start1, n-n/2 -1, start2+n/2, end2);
             }
         }
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 12, 15, 26, 38};
        int[] ar2 = {2, 13, 17, 30, 45};
        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2) {
            System.out.printf("Median is %d\n", getMedianMethod2(ar1, ar2, 0, (n1-1) , 0, (n2-1)));
        } else {
            System.out.printf("Doesn't work for arrays of unequal size");
        }
    }

    private static int median(int[] ar,int n) {
        //int n = end - start + 1;
        if (n % 2 == 0) {
            return (ar[n / 2] + ar[n / 2 - 1]) / 2;
        }
        return ar[n / 2];
    }

}
