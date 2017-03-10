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
public class ArrayIsSubSetOfAnotherArray {

    /**
     * @param args the command line arguments
     */
    private static boolean isSubset(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i =0, j = 0;
        for( i = 0; i < n; i++) {
            for( j = 0; j < m; j++) {
                if( arr2[i] == arr1[j])
                    break;
            }
            if(j == m)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr1 = {11, 1, 13, 21, 3, 7};
          int[] arr2 = {11, 3, 7, 1};
          System.out.println(isSubset(arr1, arr2));
   
    }
    
}
