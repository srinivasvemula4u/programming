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
/* An Element is a majority if it appears more than n/2 times .*/
public class MajorityNumInArray {

    public static void majorityNumInArray(int[] arr) {
        int majNum = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majNum = arr[i];
                count = 1;
            } else if (majNum == arr[i]) {
                count++;
                if (count == arr.length / 2 + 1) {
                    break;
                }
            } else {
                count--;
                /*if (count == 0) {
                    majNum = arr[i];
                    count = 1;
                }*/
            }
        }
        if (count > 0) {
            System.out.println(majNum);
        } else {
            System.out.println("No element is majority");
        }
    }

    public static void main(String args[]) {
        int[] Arr = {1, 2, 3, 4, 4, 4};
        majorityNumInArray(Arr);

        //System.out.println(lastOccuranceOfANumberInSortedArray(Arr,0,Arr.length-1,4));
    }
}
