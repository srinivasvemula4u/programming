/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author Srinivas This file all bitwise operations are explained in karumanchi
 * book
 */
public class BitwiseOperatorsOperations {

    public static boolean checkKthBitSetOrNot(int num, int k) {
        int mask = 1 << k - 1;
        return (num & mask) > 0 ? true : false;
    }

    public static void setKthBit(int num, int k) {
        int mask = 1 << k - 1;
        num = num | mask;
    }

    public static void clearKthBit(int num, int k) {
        int mask = 1 << k - 1;
        num = num & ~mask;
    }

    public static void togglingKthBit(int num, int k) {
        int mask = 1 << k - 1;
        num = num ^ mask;
    }

    // resetting rightmost 1 to 0
    public static void resetRightMostOne(int num) {
        num = num & (num - 1);
    }

    //Isolating Rightmost one bit
    public static void isolateRightMost1Bit(int num) {
        int nNum = -num;
        System.out.println((num & nNum));
    }

    // check whether the number is power of 2 or not
    public static boolean checkNumberPowerofTwoorNot(int n) {
        return (n & n - 1) == 0 ? true : false;
    }

    public static void multiplyingNumberByPowerof2(int num, int k) {
        //Math.lo
        num = num << k;
    }

    public static void divideNumberByPowerof2(int num, int k) {
        if (num < 0) {
            num = num >>> k;
        } else {
            num = num >> k;
        }
    }

    // For a given number n, to find the modulo of a number k use the following expression
    // n & (k-1) eg: for %8 we do  n & 0x07
    public static int findModuloOfNumber(int num, int k) {
        return num & (k - 1);
    }

    // For a given number n , to reverse the bits
    public static int reverseOfBinayNumber(int num) {
        int s = 32;
        int nReverse = num;
        for (; num > 0; num >>= 1) {
            nReverse <<= 1;
            nReverse = nReverse | (num & 1);
            s--;
        }
        nReverse = nReverse << s;
        return nReverse;
    }

    public static void main(String[] args) {
        System.out.println(checkKthBitSetOrNot(4, 2));
        isolateRightMost1Bit(11);
        System.out.println(checkNumberPowerofTwoorNot(3));
        System.out.println(findModuloOfNumber(16, 8));
        System.out.println(reverseOfBinayNumber(4));
    }
}
