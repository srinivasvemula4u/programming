
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040 A Fibonacci-like sequence is a sequence of integers a1, a2,
 * ... for which an = an-1+an-2 for all n > 2. You are given the first two
 * elements of the sequnce a1 and a2, and the 1-based index n. Output the n-th
 * element of the sequence.
 *
 * The input data consists of a single line which contains integers a1, a2 and n
 * separated by single spaces. 0 < a1, a2, n < 10.
 *
 * Example
 *
 * input
 *
 * 1 2 3
 *
 * output
 *
 * 3
 */
public class FibonacciLikeSequence {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int n = scan.nextInt();
        int res = 0;
        int i = 3;
        while (i <= n) {
            res = a1 + a2;
            a1 = a2;
            a2 = res;
            i++;
        }
        System.out.println(res);

    }
}
