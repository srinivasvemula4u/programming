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
 * (3, 1) to give 4, rest all pairs according to condition gives 0.
 */
public class SumOfAllPairsInArray {

    /*
A naive approach is to iterate through all pairs and calculate f(a[i], a[j]) 
    and summing it while traversing in two nested loops will give us our answer.
Time Complexity: O(n^2)

A efficient approach will be to use a map/hash function to keep a count of 
    every occurring numbers and then traverse through the list. While traversing 
    through the list, we multiply the count of numbers that are before it and the
    number itself. Then subtract this result with the pre-sum of the number 
    before that number to get the sum of difference of all pairs possible with 
    that number. To remove all pairs whose absolute difference is <=1, simply 
    subtract the count of occurrence of (number-1) and (number+1) from the 
    previously computed sum. Here we subtract count of (number-1) from the 
    computed sum as it had been previously added to the sum, and we add 
    (number+1) count since the negative has been added to the pre-computed 
    sum of all pairs.

Time Complexity : O(n)
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
