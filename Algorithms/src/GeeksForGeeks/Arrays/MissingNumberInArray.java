/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul Method 1: 1. Get the sum of numbers total = n*(n+1)/2 2
 * Subtract all the numbers from sum and you will get the missing number.
 *
 * Method 2: 1) XOR all the array elements, let the result of XOR be X1. 2) XOR
 * all numbers from 1 to n, let XOR be X2. 3) XOR of X1 and X2 gives the missing
 * number.
 * long long f(long long a) {
     long long res[] = {a,1,a+1,0};
     return res[a%4];
}

long long getXor(long long a, long long b) {
     return f(b)^f(a-1);
}
 *
 *
 */
public class MissingNumberInArray {

    public static int missingNumberMethod1(int[] arr) {
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
        }
        return sum;
    }
    public static int missingNumberMethod2(int[] arr) {
        int n = arr.length;
        int x1 = arr[0];
        int x2 = 1;
        for(int i=1; i < n; i++)
            x1 ^= arr[i];
        for(int i = 2; i <= n+1; i++)
            x2 ^= i;
        return x1^x2;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        System.out.println(missingNumberMethod1(a));
        System.out.println(missingNumberMethod2(a));
    }
}
