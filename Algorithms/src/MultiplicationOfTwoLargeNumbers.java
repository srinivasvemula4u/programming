
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040 use integer array to store a biginteger like 297897654 will
 * be stored as {2,9,7,8,9,7,6,5,4} implement the multiply function for
 * bigintegers Expamples: {2, 9, 8, 8, 9, 8} * {3,6,3,4,5,8,9,1,2} =
 * {1,0,8,6,3,7,1,4,1,8,7,8,9,7,6}
 *
 * 0000298898 x 0363458912 = 00000108637141878976 int a[10] = {8,9,8,8,9,2}; int
 * b[10] = {2,1,9,8,5,4,3,6,3};
 */
public class MultiplicationOfTwoLargeNumbers {

    public static void main(String[] args) {
        int[] a = {8, 9, 8, 8, 9, 2};
        int[] b = {2, 1, 9, 8, 5, 4, 3, 6, 3};

        // INPUT DISPLAY
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.print("  x ");
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print(b[i]);
        }
        System.out.print(" = ");

        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < b.length; i++) {
            int carry = 0;
            for (int j = 0; j < a.length; j++) {
                int t = (a[j] * b[i]) + c[i + j] + carry;
                carry = t / 10;
                c[i + j] = t % 10;
            }
        }

        // RESULT DISPLAY
        for (int i = 19; i >= 0; i--) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
