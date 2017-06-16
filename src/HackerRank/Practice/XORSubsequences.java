/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice;

/**
 *
 * @author srivemul
 */
/*
Consider an array, , of  integers (). We take all consecutive subsequences of integers from the array that satisfy the following:

For example, if  our subsequences will be:

For each subsequence, we apply the bitwise XOR () operation on all the integers and record the resultant value. Since there are  subsequences, this will result in  numbers.

Given array , find the XOR sum of every subsequence of  and determine the frequency at which each number occurs. Then print the number and its respective frequency as two space-separated values on a single line.

Input Format

The first line contains an integer, , denoting the size of the array. 
Each line  of the  subsequent lines contains a single integer describing element .

Constraints

Output Format

Print  space-separated integers on a single line. The first integer should be the number having the highest frequency, and the second integer should be the number's frequency (i.e., the number of times it appeared). If there are multiple numbers having maximal frequency, choose the smallest one.

Sample Input

4
2
1
1
3
Sample Output

1 3
Explanation

Let's find the XOR sum for all consecutive subsequences. We'll refer to the frequency of some number  as , and keep a running sum for each frequency:

, frequencies: 
, frequencies:  and 
, frequencies:  and 
, frequencies: , , and 
, frequencies: , , and 
, frequencies: , , , and 
, frequencies: , , , and 
, frequencies: , , , and 
, frequencies: , , , and 
, frequencies: , , , and 
Our maximal frequency is , and the integers , , and  all have this frequency. Because more than one integer has this frequency, we choose the smallest one, which is . We then print the respective smallest number having the maximal frequency and the maximal 
frequency as a single line of space-separated values.
*/
public class XORSubsequences {
    
}
