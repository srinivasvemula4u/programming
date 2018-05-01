/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/*
Given two unsorted arrays of distinct elements, 
the task is to find all pairs from both arrays whose sum is equal to x.

Examples:

Input :  arr1[] = {-1, -2, 4, -6, 5, 7}
         arr2[] = {6, 3, 4, 0}  
         x = 8
Output : 4 4
         5 3

Input : arr1[] = {1, 2, 4, 5, 7} 
        arr2[] = {5, 6, 3, 4, 8}  
        x = 9
Output : 1 8
         4 5
         5 4
 */
public class TwoUnsortedArraysFindAllpairsWithGivenSum {

    /*
    A Naive approach is to simply run two loops and pick elements from both arrays. 
    One by one check that both elements sum is equal to given value x or not
     */
    // Function to print all pairs in both arrays
    // whose sum is equal to given value x
    static void findPairs(int arr1[], int arr2[], int n,
            int m, int x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] + arr2[j] == x) {
                    System.out.println(arr1[i] + " "
                            + arr2[j]);
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 7, 5, 4};
        int arr2[] = {0, 7, 4, 3, 2, 1};
        int x = 8;
        findPairs(arr1, arr2, arr1.length, arr2.length, x);
    }

}
