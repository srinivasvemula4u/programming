
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
public class MoneyChange {
     private static int getChange(int n) {
        //write your code here
        int total =0;
        if( n >= 10)
        {
            total += n/10;
            n = n%10;
        }
        if( n >= 5 && n < 10) {
         total += n/5;
         n = n%5;
        }
        if( n > 0)
            total += n;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}
