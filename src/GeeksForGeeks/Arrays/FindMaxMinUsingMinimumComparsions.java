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
public class FindMaxMinUsingMinimumComparsions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        getMinMax(arr);
    }

    private static void getMinMax(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            System.out.println(arr[0] + " " + arr[0]);
            return;
        } else if (n == 2) {
            if (arr[0] >= arr[1]) {
                System.out.println(arr[1] + " " + arr[0]);
            } else {
                System.out.println(arr[0] + " " + arr[1]);
            }
            return;
        }
        int min = arr[0], max = arr[0];
        for(int i = 1 ; i < n; i++) {
            if( arr[i] > max ) {
                max = arr[i];
            }
            else if( arr[i] < min) {
                min = arr[i];
            }
        }
         System.out.println(min + " " + max);
        
    }

}
