/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 */
public class RemoveAdjacentPairs {

    public static void removeAdjacentPairs(String str) {
        char arr[] = new char[str.length()];
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            while ((arr[i] == arr[j]) && j >= 0) {
                i++;
                j--;
                count--;
            }
            arr[++j] = arr[i];
            count++;

        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    public static void main(String args[]) {
        String str = "ABCCBCBA";
        removeAdjacentPairs(str);
    }
}
