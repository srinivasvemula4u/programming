/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.MakeMyTrip;

import java.util.Scanner;

/**
 *
 * @author sv186040 Bob has an array A[] of N integers. Initially, all the
 * elements of the array are zero. Bob asks you to perform Q operations on this
 * array.
 *
 * There are three types of operations that can be performed:
 *
 * 1 X: Update the value of A[X] to 2 * A[X] + 1. 2 X: Update the value A[X] to
 * A[x]/2 , where is Greatest Integer Function. 3 X Y: Take all the A[i] such
 * that X <= i <= Y and convert them into their corresponding binary strings.
 * Now concatenate all the binary strings and find the total no. of '1' in the
 * resulting string. Note: It is guaranteed that there is at least 1 type-3
 * query in the every test case. All the array elements will fit into 64 bit
 * integers.
 *
 * Input Format: First line consists of two space-separated integers N and Q.
 * Next, Q lines consist of Q operations of either of the 3 types as described
 * above.
 *
 * Output Format: For each type-3 query print the answer that is the no. of '1'
 * in the resulting string.
 *
 * Constraints:
 *
 *
 *
 *
 *
 *
 * Sample Input 5 5 1 1 1 2 1 3 3 1 3 3 2 4 Sample Output 3 2 Explanation
 * Initially, A=[0,0,0,0,0]
 *
 * After 1st query, A=[1,0,0,0,0]
 *
 * After 2nd query, A=[1,1,0,0,0]
 *
 * After 3rd query, A=[1,1,1,0,0]
 *
 * For 4th query, no. of '1' in binary representation of A[1]=A[2]=A[3]=1. So,
 * answer=3.
 *
 * For 5th query, answer is 2.
 *
 * Note: Your code should be able to convert the sample input into the sample
 * output. However, this is not enough to pass the challenge, because the code
 * will be run on multiple test cases. Therefore, your code must solve this
 * problem statement.
 */
public class BobAndArrayQueries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        s.nextLine();
        int[] arr = new int[N];
        for (int q = 0; q < Q; q++) {
            String line = s.nextLine();
            String[] ops = line.split(" ");
            if ("1".equals(ops[0])) {
                int x = Integer.parseInt(ops[1]);
                arr[x - 1] = 2 * arr[x - 1] + 1;
            } else if ("2".equals(ops[0])) {
                int x = Integer.parseInt(ops[1]);
                arr[x - 1] = (int) Math.floor(arr[x - 1] / 2);
            } else if ("3".equals(ops[0])) {
                int x = Integer.parseInt(ops[1]);
                int y = Integer.parseInt(ops[2]);
                int count = 0;
                for (int i = x; i <= y; i++) {
                    count += countSetBits(arr[i - 1]);
                }
                System.out.println(count);
            }
        }
        // Write your code here

    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

}
