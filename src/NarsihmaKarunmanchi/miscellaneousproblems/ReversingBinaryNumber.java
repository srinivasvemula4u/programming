/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author srivemul
 */
public class ReversingBinaryNumber {
    public static void reverse(byte val) {
        byte rev = 0; int s = Byte.SIZE;
        for(; val > 0; val >>= 1) {
            rev <<= 1;
            rev |= (val & 1);
            s--;
        }
        rev <<= s;
        System.out.println(rev);
    }
    public static void main(String args[]) {
        reverse(new Byte("7"));
    }
}
