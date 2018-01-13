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
public class TestInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTestCases, nPrisoners, nSweets, startPos;
        nTestCases = Integer.parseInt(sc.nextLine());
       for(int i=0; i < nTestCases; i++) {
     //   while (sc.hasNextLine()) {
            nPrisoners = sc.nextInt();
            nSweets = sc.nextInt();
            startPos = sc.nextInt();
            // }
            System.out.println(nPrisoners + " "+nSweets+" "+startPos);
        }
       
    }
}
