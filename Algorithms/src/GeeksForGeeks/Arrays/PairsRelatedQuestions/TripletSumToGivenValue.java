/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/**
 *
 * @author sv186040
 * https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/ Given
 * an array and a value, find if there is a triplet in array whose sum is equal
 * to the given value. If there is such a triplet present in array, then print
 * the triplet and return true. Else return false. For example, if the given
 * array is {12, 3, 4, 1, 6, 9} and given sum is 24, then there is a triplet
 * (12, 3 and 9) present in array whose sum is 24.
 */
public class TripletSumToGivenValue {

    /*
    Method 1 (Naive) 
A simple method is to generate all possible triplets and compare the sum 
    of every triplet with the given value. 
    The following code implements this simple method using three nested loops.
     */
    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + " ," + A[j]
                                + " ," + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        TripletSumToGivenValue triplet = new TripletSumToGivenValue();
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }

}
