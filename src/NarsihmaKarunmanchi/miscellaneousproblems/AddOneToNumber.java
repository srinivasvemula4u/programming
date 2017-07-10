/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author sv186040
 */
public class AddOneToNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public int[] addOneToNumber(int[] digits) {
        int[] result = new int[digits.length];
        int one = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i] = (digits[i] + one) % 10;
            one = (digits[i] + one) / 10;
        }
        if (one != 0) {
            int[] more = new int[digits.length + 1];
            more[0] = one;
            System.arraycopy(result, 0, more, 1, result.length);
            result = more;
        }
        return result;
    }

}
