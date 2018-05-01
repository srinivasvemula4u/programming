/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/**
 * https://www.geeksforgeeks.org/count-divisible-pairs-array/
 *
 * @author sv186040 Given an array, count pairs in the array such that one
 * element of pair divides other.
 *
 * Examples:
 *
 * Input : arr[] = {1, 2, 3} Output : 2 The two pairs are (1, 2) and (1, 3)
 *
 * Input : arr[] = {2, 3, 5, 7} Output: 0
 */
public class CountDivisiblePairs {

    /**
     * @param args the command line arguments
     */
    static int countDivisibles(int arr[],
            int n) {
        int res = 0;

        // Iterate through all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) // Increment count if
            // one divides other
            {
                if (arr[i] % arr[j] == 0
                        || arr[j] % arr[i] == 0) {
                    res++;
                }
            }
        }

        return res;
    }

// Driver Code
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 9};
        int n = a.length;
        System.out.println(countDivisibles(a, n));
    }
    /*
    Efficient solution for small ranged numbers.
1) Insert all elements of array in a hash table.
2) Find maximum element in the array.
3) For every array element, search multiples of it (till maximum) in the hash table. If found, increment result.
Different cases like negative numbers and repetitions can also be handled here with slight modifications to the approach.


     */

}
