/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class CheckDuplicatesInArray {

    public static void checkDuplicatesInArray(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                System.out.println("Duplicates are present in the array");
                return;
            }
        }
        System.out.println("No Duplicates");
    }
    /*
    Limitations :
    1) The solution doesnot work if the given array is read only
    2) This solution will work only if all the array elements are positive
    3) If the elements range is not in 0 to n-1 them it may give exceptions.
    */
    public static void checkDuplicatesInArrayOptimized(int[] A) {
        for(int i=0; i < A.length; i++) {
            if(A[Math.abs(A[i])] < 0) {
                System.out.println("Duplicates Exist:"+ A[i]);
                return;
            }
            A[A[i]] = -A[A[i]];
        }
    }
    public static void main(String agrs[]) {
        int[] A = {1,2,4,5,8,7,8};
        checkDuplicatesInArray(A);
    }    
}
