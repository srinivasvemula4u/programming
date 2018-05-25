/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.ThoughtWorks;

import java.util.Scanner;

/**
 *
 * @author sv186040 Digits in a Number Let's say are the only digits which
 * exists in a unique number system, so the numbers will be in ascending order .
 *
 * 1 st number is 1 and number of digits is 1
 *
 * 4th will be 11 and number of digits is 2
 *
 * 14th will be and number of digits will be 3
 *
 * will be and number of digits will be 4
 *
 * You have to find number of digits of term in unique number system .
 *
 * Input :
 *
 * First line T contains number of testcases
 *
 * Next T lines contains N
 */
public class DigitsInANumber {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            long N = s.nextLong();
            long count = 0;
            long j = 1;
            while (N > 0) {
                N = N - (long) Math.pow(3, j);
                count++;
                j++;
            }
            System.out.println(count);
        }

    }

}
