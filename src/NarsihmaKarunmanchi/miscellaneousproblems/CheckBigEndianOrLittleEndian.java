/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

import java.nio.ByteOrder;

/**
 *
 * @author srivemul
 */
public class CheckBigEndianOrLittleEndian {
    public static boolean isBigEndian() {
        if(ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN))
            return true;
        return false;
    }
    public static boolean isLittleEndian() {
        if(ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) 
            return true;
        return false;
    }
    public static void main(String args[]) {
        System.out.println(isLittleEndian());
    }
}
