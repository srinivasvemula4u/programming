/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

/**
 *
 * @author srivemul
 */
/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
 /*
Complexity Analysis

Time Complexity: `O(m + n)` (Average Case) and `O(m + n)` (Worst Case) where `m` and `n` are the total number of characters in the first and second input respectively. The algorithm evaluate each character for potential carry.

Auxiliary Space: `O(m + n)` space is used where `m` and `n` are the total number of characters in the first and second input respectively. Converting both input to character array required extra space.

Algorithm

Approach: Iterative

The while loop will run as long as there are characters left in one of the strings or when there is a carry in remaining. 
Starting from right to left, each character is converted to integer by the mean of offsetting its ASCII value. If the shorter string is exhausted first, the value will be forced to `0` as default from there onwards. Sum for that particular position is conveniently calculated and a modulus of `10` will extract the digit portion in case the sum is bigger than 10. Carry in is extracted by flooring the number after division by `10`. StringBuilder is used due to its efficiently in inserting character to existing StringBuilder object. If normal String is used then each insertion by + operation will have to copy over the immutable String object which is highly inefficient.
 */
public class AddStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            //    sb.append((x + y + carry) % 10);
            sb.insert(0, (x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        // return sb.reverse().toString();
        return sb.toString();
    }

    public String addStrings2(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = i >= 0 ? (num1Array[i--] - '0') : 0;
            int b = j >= 0 ? (num2Array[j--] - '0') : 0;
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
}


