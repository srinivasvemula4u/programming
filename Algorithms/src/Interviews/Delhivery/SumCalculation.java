/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.Delhivery;

/**
 *
 * @author sv186040
 * 
 * 
 * You are given N positive numbers  and you have to calculate the total sum of floor for each pair of indices i and j, where ().

Input format
The first line of input file contains T denoting the number of test cases.
Each test case consists of two lines:

The first line contains N.
The second line contains N space-separated integers .
Output format

For each test case, print the desired output modulo 1000003. The answer for each test case should be in a new line.

Constraints







Sample Input
1
5
1 2 3 4 5
Sample Output
27
Explanation
For index 1 : Floor[1/1] + Floor[2/1] + Floor[3/1] + Floor[4/1] + Floor[5/1] = 1 + 2 + 3 + 4 + 5 = 15 
For Index 2 : Floor[1/2] + Floor[2/2] + Floor[3/2] + Floor[4/2] + Floor[5/2] = 0 + 1 + 1 + 2 + 2 = 6 
For index 3 : Floor[1/3] + Floor[2/3] + Floor[3/3] + Floor[4/3] + Floor[5/3] = 0 + 0 + 1 + 1 + 1 = 3
For index 4 : Floor[1/4] + Floor[2/4] + Floor[3/4] + Floor[4/4] + Floor[5/4] = 0 + 0 + 0 + 1 + 1 = 2
For index 5 : Floor[1/5] + Floor[2/5] + Floor[3/5] + Floor[4/5] + Floor[5/5] = 0 + 0 + 0 + 0 + 1 = 1

Total Sum = 15 + 6 + 3 + 2 + 1 = 27
 */
public class SumCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
