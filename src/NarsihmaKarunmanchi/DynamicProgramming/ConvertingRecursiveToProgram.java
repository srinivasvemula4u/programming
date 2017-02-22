/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 * T(0)= T(1) = 2
 * T(n) =Summation( i = 2 to n-1) 2*T(i)*T(i-1) for all n > 1;  
 */
public class ConvertingRecursiveToProgram {
    public static int recursiveMethod(int n) {
        int sum = 0;
        if(n == 0 || n == 1)
            return 2;
        for(int i = 1; i < n; i++)
            sum += (2*recursiveMethod(i)*recursiveMethod(i-1));
        return sum;
    }
   
    public static int dynamicprogramming(int n) {
        int[] T = new int[n+1];
        T[0] = T[1] = 2;
        for(int i = 2; i <=n ; i++) {
            T[i] = 0;
          for(int j = 1; j < i; j++) {
              T[i] += 2*T[j]*T[j-1];
          }
        }
        return T[n];
    }
    public static int dynamicProgrammingOptimized(int n) {
         int[] T = new int[n+1];
        T[0] = T[1] = 2;
        T[2] = 2*T[1]*T[0];
        for(int i = 3; i <=n; i++) {
            T[i] = T[i-1] + 2*T[i-1]*T[i-2];
        }
        return T[n];
    }
     public static void main(String agrs[]) {
        System.out.println(recursiveMethod(5));
         System.out.println(dynamicprogramming(5));
         System.out.println(dynamicProgrammingOptimized(5));
    }
}
