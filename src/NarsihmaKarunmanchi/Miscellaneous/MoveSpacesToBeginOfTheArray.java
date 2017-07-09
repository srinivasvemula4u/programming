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
public class MoveSpacesToBeginOfTheArray {

    /**
     * @param args the command line arguments
     */
    private static String moveSpacesToBegining(char[] arr) {
        int len = arr.length - 1;
        for (int i = len; i >= 0; i--) {
            if (!Character.isSpaceChar(arr[i])) {
                swap(arr, i, len--);
            }
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static String moveSpacesToBeginingOptimized(char[] arr) {
        int len = arr.length - 1;
        int count = len;
        for (int i = len; i >= 0; i--) {
            if (!Character.isSpaceChar(arr[i])) {
                arr[count--] = arr[i];
            }
        }
        while (count >= 0) {
            arr[count--] = ' ';
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String str = "This is a test";
        System.out.println(moveSpacesToBegining(str.toCharArray()));
        System.out.println(moveSpacesToBeginingOptimized(str.toCharArray()));
    }

}
