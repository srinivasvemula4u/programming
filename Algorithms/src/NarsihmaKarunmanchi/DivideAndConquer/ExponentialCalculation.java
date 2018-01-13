/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DivideAndConquer;

/**
 *
 * @author srivemul
 */
public class ExponentialCalculation {
    public static double exponential(double x, int n) {
        if(n == 0) 
            return 1.0;
        double half = exponential(x, n/2);
        if( n % 2 == 0)
            return half * half;
        else if(n > 0) 
            return half * half * x;
        else 
            return half * half / x;
    }
    public static void main(String agrs[]) {
        System.out.println(exponential(2, -4));
    }
}
