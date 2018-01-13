/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.SelectionAlgorithms;

/**
 *
 * @author srivemul
 */
public class KthSmallestFromTwoSortedArrays {
    private static int findMedianInTwoSortedArrays(int[] arrA, int startA, int endA, int[] arrB, int startB, int endB, int k) {
        int n = endA - startA;
        int m = endB - startB;
        if (n <= 0) {
            return arrB[startB + k - 1];
        }
        if (m <= 0) {
            return arrA[startA + k - 1];
        }
        if (k == 1) {
            return arrB[startB] < arrA[startA] ? arrB[startB] : arrA[startA];
        }
        int midA = (startA + endA) / 2;
        int midB = (startB + endB) / 2;
        if (arrA[midA] <= arrB[midB]) {
            if (n / 2 + m / 2 + 1 >= k) {
                return findMedianInTwoSortedArrays(arrA, startA, endA, arrB, startB, midB, k);
            } else {
                return findMedianInTwoSortedArrays(arrA, midA + 1, endA, arrB, startB, endB, k - n / 2 - 1);
            }
        } else if (n / 2 + m / 2 + 1 >= k) {
            return findMedianInTwoSortedArrays(arrA, startA, midA, arrB, startB, endB, k);
        } else {
            return findMedianInTwoSortedArrays(arrA, startA, endA, arrB, midB + 1, endB, k - m / 2 - 1);
        }
        // return 1.0;
    }
     public static int findMedianInTwoSortedArrays(int[] arrA, int[] arrB,int k) {
        int lenA = arrA.length;
        int lenB = arrB.length;
            return findMedianInTwoSortedArrays(arrA, 0, lenA, arrB, 0, lenB, k);
        }
     public static void main(String args[]) {
        int[] A = {1,3,5,9};
        int[] B = {2,4,6,8};
        System.out.println(findMedianInTwoSortedArrays(A,B,8));
    }

    }

