/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Java;

/**
 *
 * @author sv186040
 */
public class FinalArray {

    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 * arr[i];
            System.out.println(arr[i]);

        }
        String str1 = "Srinivas";
        String str2 = new String("Srinivas");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() + " "
                + str2.hashCode());
    }
}
