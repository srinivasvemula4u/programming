/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice;

/**
 *
 * 
 */
import java.io.*;
import java.util.*;

public class SavePrison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nTestCases, nPrisoners, nSweets, startPost;
        nTestCases = Integer.parseInt(sc.nextLine());
        for (long i = 0; i < nTestCases; i++) {
            nPrisoners = sc.nextLong();
            nSweets = sc.nextLong();
            startPost = sc.nextLong();
            SavePrison obj = new SavePrison();
            obj.printPoisnedPrisonerId(nPrisoners, nSweets, startPost);
        }
    }
//    public static void printPoisnedPrisonerId(long nPrisoners,long nSweets,long startPosition) {
//       
//        long[] prisonersId = new long[(int)nPrisoners];
//        for(int i=0; i< nPrisoners; i++) {
//            prisonersId[i] = i+1;
//        }
//        leftRotate(prisonersId,startPosition-1);
//        ///for(int i=startPosition; i < nSweets; i++)
//        int prisonId = (int)(startPosition+nSweets-1);
//        System.out.println(prisonersId[prisonId-1]);
//    }

    public void printPoisnedPrisonerId(long nPrisoners, long nSweets, long startPosition) {

        boolean marker = false;
        while (nSweets > 0) {
            if (nSweets <= (nPrisoners - startPosition + 1) && marker == false) {
                System.out.println(startPosition + nSweets - 1);
                nSweets = nSweets - (startPosition + nSweets);
                return;
            } else if ((nSweets > (nPrisoners - startPosition + 1)) && marker == false) {
                long remaining = nSweets - (nPrisoners - startPosition + 1);
                nSweets = remaining;
                //  if(nSweets >= nPrisoners)
                marker = true;
                if (nSweets == 0) {
                    System.out.println(remaining);
                    return;
                }
            } else if ((nSweets >= nPrisoners) && marker == true) {
                if (nSweets == nPrisoners) {
                    System.out.println(nPrisoners);
                    return;
                } else {
                    nSweets = nSweets - nPrisoners;
                }
            } else {
                //   if( nSweets == nPrisoners)
                System.out.println(nSweets);
                nSweets = 0;
                return;
            }
        }
    }

    private static void leftRotate(long[] prisonersId, long n) {
        for (long i = 0; i < n; i++) {
            leftRotateByOne(prisonersId, prisonersId.length);
        }
    }

    private static void leftRotateByOne(long[] prisonersId, int len) {
        long temp = prisonersId[0];
        int i;
        for (i = 0; i < len - 1; i++) {
            prisonersId[i] = prisonersId[i + 1];
        }
        prisonersId[i] = temp;
    }
}
