/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.MakeMyTrip;

import java.util.Scanner;

/**
 *
 * @author sv186040 You are in a battle field and your enemy has an army of N
 * soldiers. Each soldier has a strength denoted by an array A. Your enemy will
 * select some soldiers such that total strength of selected soldiers is
 * maximum. You have a poisonous gas and you can use it on the selected soldiers
 * as many times as you want. If the total strength is even, the poisonous gas
 * will decrease the total strength of the selected soldiers to half of the
 * total strength, otherwise it will not affect them. Your task is to tell if
 * its possible to reduce the total strength to 1 or not.
 *
 *
 *
 * Input Format:
 *
 * First line contains an integer T, denoting the number of test cases.
 *
 * First line of each test case contains an integer N, denoting the number of
 * soldiers.
 *
 * Second line of each test case contains N space-separated integers, denoting
 * the strength of the soldiers.
 *
 *
 *
 * Output Format:
 *
 * For each test case, print Yes if its possible to reduce the total strength to
 * 1, otherwise print No.
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * Sample Input 2 5 76 56 -21 76 -45 2 8 -4 Sample Output No Yes
 *
 * Explanation Test case 1: n = 5 and maximum total strength is 76 + 56 + 76 =
 * 208. You can not reduce 208 to 1 by using the poisonous gas.
 *
 * Test case 2: n = 2 and maximum total strength is 8. First time when you will
 * use the poisonous gas, total strength will reduce to 4. Second time when you
 * will use the poisonous gas, total strength will reduce to 2. Third time when
 * you will use the poisonous gas, total strength will reduce to 1. Therefore,
 * the answer is Yes
 *
 * Note: Your code should be able to convert the sample input into the sample
 * output. However, this is not enough to pass the challenge, because the code
 * will be run on multiple test cases. Therefore, your code must solve this
 * problem statement.
 */
public class PoisonousGas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int t = 0; t < T; t++) {
            int N = s.nextInt();
            long maxSum = 0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
                if (arr[i] > 0) {
                    maxSum += arr[i];
                }
            }
            while (maxSum > 0) {
                if (maxSum == 1) {
                    System.out.println("Yes");
                    break;
                }
                if (maxSum % 2 == 0) {
                    maxSum = maxSum / 2;
                } else {
                    System.out.println("No");
                    break;
                }
            }
        }

    }

}
