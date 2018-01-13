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
/*
The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element. Please note 
that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.
*/
public class NumberOccurringOddNumberOfTimes {
    public static void numberOccurringOddNumberOfTimes(int[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        if(res != 0) {
            System.out.println(res+" is Occurring odd number of times");
        }
        else {
            System.out.println("No Number");
        }
    }
    public static void main(String[] args) {
          int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
          numberOccurringOddNumberOfTimes(arr);
    }
}
