/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
public class IntegerParseExample {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("22"));
        System.out.println(Integer.parseInt("22", 16));
        byte[] bytes = new byte[]{(byte) Integer.parseInt("22", 16)};
        for (byte b : bytes) {
            System.out.println(b);
        }

    }
}
