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
public class FindOddNumberOfOccuringElementInArray {
    public static int findOddNumberOfOccuringElementInArray(int[] Arr) {
        int result = 0;
        for(int i=0; i < Arr.length; i++)
            result ^= Arr[i];
        return result;
    }
     public static void main(String args[]) {
        int[] Arr = {1,3,3,2,3,1,3};
        System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(0^6);
    }
}
