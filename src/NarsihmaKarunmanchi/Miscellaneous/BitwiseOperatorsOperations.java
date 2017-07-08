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
    public static void main(String[] args) {
        System.out.println(checkKthBitSetOrNot(4, 2));
    }
}
