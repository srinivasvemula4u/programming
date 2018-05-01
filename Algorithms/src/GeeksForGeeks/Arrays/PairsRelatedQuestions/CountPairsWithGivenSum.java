/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/**
 *
 * @author sv186040 https://www.geeksforgeeks.org/count-pairs-with-given-sum/
 * Given an array of integers, and a number ‘sum’, find the number of pairs of
 * integers in the array whose sum is equal to ‘sum’.
 *
 * Examples: Input : arr[] = {1, 5, 7, -1}, sum = 6 Output : 2 Pairs with sum 6
 * are (1, 5) and (7, -1)
 *
 * Input : arr[] = {1, 5, 7, -1, 5}, sum = 6 Output : 3 Pairs with sum 6 are (1,
 * 5), (7, -1) & (1, 5)  *
 * Input : arr[] = {1, 1, 1, 1}, sum = 2 Output : 6 There are 3! pairs with sum
 * 2.
 *
 * Input : arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, sum = 11 Output
 * : 9 Expected time complexity O(n)
 *
 *
 */
public class CountPairsWithGivenSum {

    /**
     * @param args the command line arguments
     */
    /* Method 1 :
    A simple solution is be traverse each element and check if there’s another 
    number in the array which can be added to it to give sum.
     */
    public static void main(String args[]) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        getPairsCount(arr, sum);
    }

    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum) {

        int count = 0;// Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    count++;
                }
            }
        }

        System.out.printf("Count of pairs is %d\n", count);
    }

}
