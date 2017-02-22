/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

/**
 *
 * @author srivemul
 */
/* Only two elements repeated twice and other are ocuur only once*/
public class PrintRepeatedElementsInArray {

    public static void printRepeatedElementsInArray(int[] Arr) {
        int[] tempArray = new int[Arr.length - 1];
        for (int i = 0; i < Arr.length; i++) {
            tempArray[Arr[i]]++;
            if (tempArray[Arr[i]] == 2) {
                System.out.println(Arr[i]);
            }
        }
    }

    public static void printRepeatedElementsInArrayOptimized(int[] Arr) {
        int xorResult = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            xorResult ^= Arr[i];
        }
        for (int i = 1; i <= Arr.length - 2; i++) {
            xorResult ^= i;
        }
        int statusbitPosition = xorResult & ~(xorResult - 1);
        int X = 0, Y = 0;
        for (int i = 0; i < Arr.length; i++) {
            if ((statusbitPosition & Arr[i]) != 0) {
                X ^= Arr[i];
            } else {
                Y ^= Arr[i];
            }
        }
        for (int i = 1; i <= Arr.length - 2; i++) {
            if ((statusbitPosition & i) != 0) {
                X ^= i;
            } else {
                Y ^= i;
            }
        }
        System.out.println(X + " " + Y);
    }

    public static void main(String args[]) {
        int[] Arr = {5, 2, 4, 5, 2, 3, 1};
        printRepeatedElementsInArrayOptimized(Arr);
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
}
