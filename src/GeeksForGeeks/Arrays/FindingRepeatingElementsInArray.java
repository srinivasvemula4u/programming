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
public class FindingRepeatingElementsInArray {

    /**
     * @param args the command line arguments
     */
    private static void method1(int[] arr) {
        for(int i =0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        method1(arr);
    }
    
}
