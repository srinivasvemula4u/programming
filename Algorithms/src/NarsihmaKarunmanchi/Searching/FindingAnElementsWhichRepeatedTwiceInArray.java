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
public class FindingAnElementsWhichRepeatedTwiceInArray {

    /*
    Let u assume that numbers are in the range 1 to n. Also n-1 elements are repeating thrice and remaining element which is repeating twice
     */
    public static int findingAnElementsWhichRepeatedTwiceInArray(int[] arr) {
        int N = (arr.length + 1) / 3;
        int xorResult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorResult ^= arr[i];
        }
        for (int i = 1; i <= N; i++) {
            xorResult ^= i;
        }
        return xorResult;
    }

    public static void main(String args[]) {
        int[] Arr = {2, 2, 2, 1, 1, 3, 1, 3, 3, 4, 4, 4, 5, 5};
        System.out.println(findingAnElementsWhichRepeatedTwiceInArray(Arr));
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
}
