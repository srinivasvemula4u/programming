/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.MakeMyTrip;

/**
 *
 * @author sv186040
 * Candies
You are given a string S consisting of lowercase English letters denoting different types of candies. A substring of a string S is a string S' that occurs in S. For example, "bam" is a substring of "babammm". Each candy costs 1 unit. You can pick some continuous candies such that you can create a palindrome of length K by using some or all picked candies. Your task is to find the minimum cost to create a palindrome of length K.

 

Input Format:

First line contains string S.

Next line contains an integer T denoting the number of test cases.

Next T lines contain a single integer K.

 

Output Format:

For each test case, print minimum cost as mentioned above. If you cannot create a palindrome of length K then, simply print -1.

 

Constraints:


Sample Input
babammm
2
2
5
Sample Output
2
5
Explanation
Test Case 1: You can pick candies denoted by "mm" and create a palindrome of size 2. So the cost will be 2 units.

Test Case 2: You can pick candies denoted by "babam" and rearrange them, "bamab", to create a palindrome of size 5. So the cost will be 5 units.

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
 */
public class Candies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
