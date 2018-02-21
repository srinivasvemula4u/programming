/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

/**
 *
 * @author sv186040
 */
public class IsPalindrome {

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while ((i < j) || (str.charAt(i) != 'x') || (str.charAt(i) != 'x')) {
            if (str.charAt(i) == str.charAt(i)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
