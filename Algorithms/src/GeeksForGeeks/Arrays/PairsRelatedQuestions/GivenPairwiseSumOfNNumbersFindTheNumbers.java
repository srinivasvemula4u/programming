/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays.PairsRelatedQuestions;

/**
 *
 * https://www.geeksforgeeks.org/given-pairwise-sum-n-numbers-find-numbers/
 * Pairwise sum of n (where n >= 3) numbers are given in a specified order, find
 * the numbers. The order has pair sum of first and second, then first and
 * third, first and fourth, … second and third, second and fourth, .. and so on.
 * Consider an example: n = 4, let the numbers be {a, b, c, d}, their pairwise
 * sum is given in the order arr[] = {a+b, a+c, a+d, b+c, b+d, c+d}.
 *
 * Examples:
 *
 * Input : arr[] = {11, 18, 13, 13, 8, 5} Output : {8, 3, 10, 5} 8+3 = 11, 8+10
 * = 18, 8+5 = 13, 3+10 = 13, 3+5 = 8, ...
 *
 * Input : arr[] = {13, 10, 14, 9, 17, 21, 16, 18, 13, 17} Output : {3, 10, 7,
 * 11, 6}
 */
public class GivenPairwiseSumOfNNumbersFindTheNumbers {

    /*
    Approach is purely based on mathematics which is illustrated below:

n = 3, {a+b, a+c, b+c}
We can find b-a = arr[2] - arr[1] 
                = (b+c) - (a+c)
We can find b = (arr[0] + (b-a))/2
              = (a + b + (b - a))/2  
              = b
We can find a = arr[0] - b
              = a  

n = 4, {a+b, a+c, a+d, b+c, b+d, c+d}
We can find b-a = arr[3] - arr[1]
                = (b+c) - (a+c)  
We can find b = (arr[0] + (b-a)) / 2
              = ((a+b) + (b-a)) / 2
            a = arr[0] - b
              = (a+b) - b
            c = arr[1] - a
              = (a+c) - a
            d = arr[2] - a
              = (a+d) - a

Observation : 
b_minus_a = b - a = arr[n-1] - arr[1]
b = (arr[0] + b_minus_a)/2
a = (arr[0] - b)
c = arr[1] - a
d = arr[2] - a
..........

n = 5, {a+b, a+c, a+d, a+e, b+c, 
        b+d, b+e, c+d, c+e, d+e}

Then calculate b-a = arr[n-1] - arr[1]
                   = (b+c) - (a+c)
Then b = (arr[0] + (b-a)) / 2
       = ((a+b) + (b-a)) / 2
     a = arr[0] - b
       = (a+b) - b
Then for i=1 to n-2, 
remaining numbers are calculated as
arr[i] - a, like
       c = arr[1] - a
         = (a+c) - a
       d = arr[2] - a
         = (a+c) - a      and so on,
          .
          .
          .
          .
last number = arr[n-2] - a 
     */
    // Note : n is not size of array, but number  
    // of elements whose pairwise sum is stored
    // in arr[]
    static void findNumbers(int arr[], int n) {

        int num[] = new int[n];

        // b-a is calculated here
        int b_minus_a = arr[n - 1] - arr[1];

        // b is calculated here
        num[1] = (arr[0] + b_minus_a) / 2;

        // a is calculated here
        num[0] = arr[0] - num[1];

        // to calculate all the other numbers
        for (int i = 1; i <= (n - 2); i++) {
            num[i + 1] = arr[i] - num[0];
        }

        // display the numbers
        System.out.print("Numbers are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
          System.out.println();
    }

    // Driver method
    public static void main(String[] args) {

        int arr[] = {13, 10, 14, 9, 17, 21,
            16, 18, 13, 17};

        // n is not size of array, but number of
        // elements whose pairwise sum is stored
        // in arr[]
        int n = 5;

        findNumbers(arr, n);
    }

}
