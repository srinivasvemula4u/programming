/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeFight.ArcadeUniverse;

/**
 *
 * 
 */
/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[time limit] 3000ms (java)
[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.
 */
public class AdjacentElementsProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    int adjacentElementsProduct(int[] inputArray) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            maxSum = Math.max(inputArray[i] * inputArray[i + 1], maxSum);
        }
        return maxSum;
    }

    int adjacentElementsProduct2(int[] inputArray) {
        int preMul = inputArray[0] * inputArray[1];
        int len = inputArray.length;
        for (int i = 1; i < len; i++) {
            int mul = inputArray[i - 1] * inputArray[i];
            if (mul > preMul) {
                preMul = mul;
            }
        }
        return preMul;//

    }

}
