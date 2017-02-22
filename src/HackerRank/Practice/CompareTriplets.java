/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aliceScore = 0, bobScore = 0;
         if( a0 > b0)
            aliceScore++;
         else if( a0 < b0)
             bobScore++;
        if( a1 > b1)
            aliceScore++;
         else if( a1 < b1)
             bobScore++;
        if( a2 > b2)
            aliceScore++;
         else if( a2 < b2)
             bobScore++;
         System.out.println(aliceScore + " " + bobScore);
    
    }
}
