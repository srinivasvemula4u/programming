/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class FindingTwoOddNumbersInUnsortedArray {

    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int xorResult = array[0];
        for (int i = 1; i < n; i++) {
            xorResult = xorResult ^ array[i];
        }
       System.out.println(xorResult);
        int statusbitPosition = xorResult & ~(xorResult - 1);
        System.out.println(statusbitPosition);
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if ((statusbitPosition & array[i]) != 0) {
                x = x ^ array[i];
            } else {
                y = y ^ array[i];
            }
        }
       System.out.println("Two odd numbers in the unsorted array is "+x+" "+y);
    }
}
