/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class FibonacciSeries {
    private static int[] fib;
    // Bottom up approach
    public static int fib(int n) {
        if(n == 0 )
            return 0;
          if (n == 1)
            return 1;
        fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n-1];
    }
    public static int fibTopDown(int n) {
        fib = new int[n+1];
        return fibTopDown1(n);
    }

    private static int fibTopDown1(int n) {
        if( n >= 0) 
      if( n == 0)
          return 0;
      if(n == 1)
          return 1;
      if(fib[n] != 0 || n == 0)
          return fib[n];
      return fib[n] = fibTopDown1(n-1) + fibTopDown1(n-2);
        
    }
    private static int fibOptimized(int n) {
        int a = 0, b = 1, sum = 0;
        for(int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(fib(5));
        System.out.println(fibTopDown(5));
        System.out.println(fibOptimized(5));
    }
}