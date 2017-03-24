/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
public class Test123 {

    public static void main(String[] args) throws java.lang.Exception {
        //String str = "1000011001000011";
        //String str = "11111111111000011";
        String str = "00000000011";
        System.out.println(findIndex(str));
    }

    public static int findIndex(String str) {
        int lIndex = 0, rIndex = str.length() - 1;
        int lCount = 0, rCount = 0;
        while (lIndex < rIndex) {
            if (str.charAt(lIndex) == '0' && str.charAt(rIndex) == '1') {
                lIndex++;
                rIndex--;
                lCount++;
                rCount++;
            } else {
                if (str.charAt(rIndex) == '0') {
                    rIndex--;
                }
                if (str.charAt(lIndex) == '1') {
                    lIndex++;
                }
            }
        }
        if (lCount == rCount) {
            return rIndex + 1;
        }
        return -1;
    }
}
