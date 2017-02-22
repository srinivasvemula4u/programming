/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.inputoutput;
  import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class Test {
  

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if( 0 <= a && a <=9 && 0 <=b && b <=9)
                  System.out.println(a + b);
    }
}

