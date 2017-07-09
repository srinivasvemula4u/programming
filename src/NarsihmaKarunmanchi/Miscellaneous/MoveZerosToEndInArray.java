/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author sv186040
 */
public class MoveZerosToEndInArray {

    /**
     * @param args the command line arguments
     */
    private static String moveZerosToEndOptimized(char[] arr) {
        int len = arr.length - 1;
        int count = 0;
        for (int i = 0; i <= len; i++) {
            if (arr[i] != '0') {
                arr[count++] = arr[i];
            }
        }
        while (count <= len) {
            arr[count++] = '0';
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        // TODO code application logic here
           String str = "19840027060";
        System.out.println(moveZerosToEndOptimized(str.toCharArray()));
    }
    
}
