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
public class FindMissingNumberInArray {
    public static int findMissingNumberInArray(int[] Arr) {
        int A=0,B=0;
        for(int i = 0; i < Arr.length; i++)
            A ^= Arr[i];
        for(int i = 1; i<= Arr.length+1; i++) {
            B ^= i;
        }
         return (A^B);
    }
    public static void main(String args[]) {
        int[] Arr = {1,2,4,6,3,7,8};
        System.out.println("Missing Number in the array is "+findMissingNumberInArray(Arr)+"!!");
        //System.out.println(0^6);
    }
}
