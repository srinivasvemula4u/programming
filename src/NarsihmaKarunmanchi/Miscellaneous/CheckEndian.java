/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;
import java.nio.ByteOrder;
/**
 *
 * @author sv186040
 */
public class CheckEndian {

    /**
     * @param args the command line arguments
     */
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
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBigEndian());
        System.out.println(isLittleEndian());
    }
    
}
