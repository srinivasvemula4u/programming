/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 * skillenza problem
 * 
 * You are given an array of integers of size n.

You are to perform the following operations on the array:

a. If n is odd, insert the value of the middle element after each element with value 0. (So the array increases in size here). If there are no zeroes in the array, ignore this step.

b. If n is even, insert the value of the sum of the middle two elements after each element with value 0. (Again the array increases in size here). If there are no zeroes in the array, ignore this step.

In the resultant array, delete the first negative and second positive elements. Print out the elements of this final array.

Input Format

The first line of input contains an integer T which is the number of test cases. Each test case contains two lines with the first line of input containing an integer N which is the size of the array. The second line contains N space separated integers which are the elements of the array.

Output Format

For each test case print desired value described above in question

Constraints

0 < T < 10000

0 < N < 10000

-1000 < ai < 1000

Sample Input

3
11
1 2 -1 4 0 5 -3 8 7 0 10
10
1 2 -1 4 0 5 -3 8 7 10
5
1 2 3 4 5
Sample Output

1 4 0 5 5 -3 8 7 0 5 10
1 4 0 5 5 -3 8 7 10
1 3 4 5
Explanation:

In the first test case, n is odd. The middle value is 5. Inserting this after every instance of 0, we have the following array: 
1 2 -1 4 0 5 5 -3 8 7 0 5 10

Deleting the first negative element, we have:

1 2 4 0 5 5 -3 8 7 0 5 10

Deleting the second positive element, we have:

1 4 0 5 5 -3 8 7 0 5 10

For the last test case, there are no 0 elements, so after the first step, the array becomes

1 2 3 4 5

Deleting the second positive element results in:

1 3 4 5


Sample stdin 1
3
11
1 2 -1 4 0 5 -3 8 7 0 10
10
1 2 -1 4 0 5 -3 8 7 10
5
1 2 3 4 5
Sample stdout 1
1 4 0 5 5 -3 8 7 0 5 10
1 4 0 5 5 -3 8 7 10
1 3 4 5
 */
public class InputArrayOperations {
    
}
