/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.SelectionAlgorithms;

/**
 *
 * @author srivemul
 */
public class FindMaxMinWithPariComparsion {

    public static void main(String args[]) {
        int large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        int[] arr = {11, 2, 4, 5, 1};
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i + 1 <= arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    if (arr[i] < small) {
                        small = arr[i];
                    }
                    if (arr[i + 1] > large) {
                        large = arr[i + 1];
                    }
                } else {
                    if (arr[i + 1] < small) {
                        small = arr[i + 1];
                    }
                    if (arr[i] > large) {
                        large = arr[i];
                    }
                }
            } else {
                if (arr[i] < small) {
                    small = arr[i];
                }
                if (arr[i] > large) {
                    large = arr[i];
                }
            }
        }
        System.out.println(small + " " + large);
    }
}
