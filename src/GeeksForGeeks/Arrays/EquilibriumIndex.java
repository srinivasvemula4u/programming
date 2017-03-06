/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class EquilibriumIndex {

    /**
     * @param args the command line arguments
     */
    private static int equilibriumMethod1(int[] arr) {
        int leftSum = 0, rightSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int index = equilibriumMethod1(arr);
        if(index == -1)
            System.out.println("No equilibrium index is present");
        else 
            System.out.println("Equilibrium inex = "+index);
    }

}
