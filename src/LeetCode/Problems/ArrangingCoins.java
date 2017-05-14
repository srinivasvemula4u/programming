/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int arrangeCoins(int n) {
        int start = 0, end = n;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) >>> 1;
            if ((0.5 * mid * mid + 0.5 * mid) <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }
    /*
    Complexity Analysis

Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `2`.

Time Complexity:

Best Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the value of input.
Average Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the value of input.
Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the value of input.
Auxiliary Space:

Worst Case `O(1)` : Additional variables are of constant size.
Algorithm

Approach: Binary Search

The problem is basically asking the maximum length of consecutive number that has the running sum lesser or equal to `n`. 
    In other word, find `x` that satisfy the following condition:

`1 + 2 + 3 + 4 + 5 + 6 + 7 + ... + x <= n`
`sum_{i=1}^x i <= n`
Running sum can be simplified,

`(x * ( x + 1)) / 2 <= n`
Binary search is used in this case to slowly narrow down the `x` that will satisfy the equation. 
    Note that 0.5 * mid * mid + 0.5 * mid does not have overflow issue as the intermediate result is 
    implicitly autoboxed to double data type.


    */

}
