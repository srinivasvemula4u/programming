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
public class Segregate0sAnd1sInArray {

    /**
     * @param args the command line arguments
     */
    private static void segregate(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0)
                c++;
        }
        for(int i = 0; i < c; i++) {
            arr[i] = 0;
        }
        for(int i = n-c; i < n; i++) {
            arr[i] = 1;
        }
    }
    private static void segregateMethod2(int[] arr) {
        int left = 0, right = arr.length-1;
        while( left < right) {
            while( arr[left] == 0 && left < right)
                left++;
            while(arr[right] == 1 && right > left)
                right--;
            if(left < right)
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
        }
    }
    private static void printArray(int[] arr) {
        for(int val : arr) {
            System.out.print(val+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {0, 1, 0, 1, 1, 1};
        //segregate(arr);
        segregateMethod2(arr);
        printArray(arr);
    }
    
}
