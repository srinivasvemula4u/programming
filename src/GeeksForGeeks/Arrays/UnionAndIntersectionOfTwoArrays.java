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
public class UnionAndIntersectionOfTwoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        union(arr1,arr2);
        intersect(arr1, arr2);
    }

    private static void union(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j =0;
        while(i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if(arr1[i] > arr2[j]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr2[j++]+ " ");
                i++;
            }
        }
        while( i < m) {
            System.out.print(arr1[i++] + " ");
        }
        while( j < n) {
            System.out.print(arr2[j++] + " ");
        }
        System.out.println();
    }
    private static void intersect(int[] arr1, int[] arr2) {
     int m = arr1.length;
        int n = arr2.length;
        int i = 0, j =0;
        while(i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
               j++;
            } else {
                System.out.print(arr2[j++]+ " ");
                i++;
            }
        }
        System.out.println();
    }

}
