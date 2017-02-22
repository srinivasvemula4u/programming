
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
public class FibonacciHuge {
    private static Scanner scanner;

    private static long pi(long m) {
        long pisano_period = 2, f1 = 1, f2 = 2%m, f3 = 3%m;
        
        while(true) {
            if(f2 == 1 && f3 == 1) {
                break;
            }
            pisano_period++;
            f1 = f2;
            f2 = f3;
            f3 = (f1+f2)%m;
        }
            
        return pisano_period;
    }
    
    private static long getFibonacciHuge(long n, long m) {

        if (n <= 1)
            return n;

        int i = 1;
        long a = 0, b = 1, c = (a+b)%m;

        while(i < n) {
            c = (a+b)%m;
            a = b;
            b = c;
            i++;
        }
  
        return c;

    }
        
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        System.out.println(getFibonacciHuge(n%pi(m), m));
    }
}
