package DEShawInterview;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 * 
 * AND Sum
Given an array of N numbers, you have to report the Sum of bitwise AND of all possible subsets of this array. As answer can be large, report it after taking mod with 109+7.

Input:
First line contains a number T denoting the number of test cases.

First line of each test case contains a number N denoting the number of elements in the array. 
Second line contains the N elements of the array.

Output:
For each test case output a single number denoting the Sum of bitwise AND of all possible subsets of the given array.

Input Constraints:

1<=T<=10
1<=N<=105
1<=a[i]<=109

Sample Input
1
3
1 2 3
Sample Output
9
Explanation
For [1, 2, 3], all possible subsets are {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}

The sum of AND of these subsets are, 1 + 2 + 3 + 0 + 1 + 2 + 0 = 9.

So, the answer would be 9.

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
Time Limit: 1.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes
Allowed Languages: Java, Java 8
 */
public class AndSum {
    
}
