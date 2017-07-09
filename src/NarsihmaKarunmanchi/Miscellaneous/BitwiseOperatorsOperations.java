/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author Srinivas
 * This file all bitwise operations are explained in karumanchi book
 */
public class BitwiseOperatorsOperations {
    public static boolean checkKthBitSetOrNot(int num,int k) {
          int mask = 1 << k-1;
           return (num & mask)  > 0 ? true: false;
    }
    public static void  setKthBit(int num,int k) {
        int mask = 1 << k-1;
        num = num | mask;
    }
    public static void clearKthBit(int num, int k) {
        int mask = 1 << k-1;
        num = num & ~mask;
    }
    public static void togglingKthBit(int num, int k) {
        int mask = 1 << k-1;
        num = num ^ mask;
    }
    // resetting rightmost 1 to 0
    public static void resetRightMostOne(int num) {
        num = num & (num-1);
    }
    //Isolating Rightmost one bit
    public static void isolateRightMost1Bit(int num) {
        int nNum = -num;
        System.out.println( (num & nNum));
    }
    // check whether the number is power of 2 or not
    public static boolean checkNumberPowerofTwoorNot(int n) {
        return (n & n-1) == 0 ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(checkKthBitSetOrNot(4, 2));
        isolateRightMost1Bit(11);
        System.out.println(checkNumberPowerofTwoorNot(3));
    }
}
