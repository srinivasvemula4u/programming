/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author sv186040
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes
 * is equal to the sum of elements at higher indexes. Given an n length array, find the K
 * which makes arr[0]+arr[1]+.....+arr[k-1] = arr[k+1]+....arr[N-1];
 */
public class EquilibriumIndexInArray {

    /**
     * @param args the command line arguments
     */
    public static int equilibrium(int[] arr) {
        int sum = 0, leftSum = 0;
        for(int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        for(int i =0; i < arr.length; i++) {
            sum -= arr[i];
            if(leftSum == sum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println(equilibrium(arr));
    }
    
}
