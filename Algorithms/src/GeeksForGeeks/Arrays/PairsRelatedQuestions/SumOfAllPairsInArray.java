/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/**
 *
 * @author sv186040
 * https://www.geeksforgeeks.org/sum-fai-aj-pairs-array-n-integers/
 *
 * Given an array of n integers, find the sum of f(a[i], a[j]) of all pairs (i,
 * j) such that (1 <= i < j <= n).
 * f(a[i], a[j]):
 *
 * If |a[j]-a[i]| > 1
 * f(a[i], a[j]) = a[j] - a[i] Else // if |a[j]-a[i]| <= 1 f(a[i], a[j]) = 0
 * Examples:
 *
 * Input : 6 6 4 4 Output : -8 Explanation: All pairs are: (6 - 6) + (6 - 6) +
 * (6 - 6) + (4 - 6) + (4 - 6) + (4 - 6) + (4 - 6) + (4 - 4) + (4 - 4) = -8
 *
 * Input: 1 2 3 1 3 Output: 4 Explanation: the pairs that add up are: (3, 1),
 * (3, 1) to give 4, rest all pairs according to condition gives 0. Recommended:
 * Please try your
 */
public class SumOfAllPairsInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
