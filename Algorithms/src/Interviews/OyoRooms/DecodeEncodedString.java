/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.OyoRooms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sv186040
 */
public class DecodeEncodedString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCasesCount = Integer.parseInt(br.readLine());
        String[] testCaseArray = new String[testCasesCount];
        String[] outputArray = new String[testCasesCount];
        int i = 0;
        for (i = 0; i < testCasesCount; i++) {
            testCaseArray[i] = br.readLine();
        }

        for (i = 0; i < testCasesCount; i++) {
            int size = testCaseArray[i].length();
            String input = testCaseArray[i];
            String output = "" + input.charAt(0);
            if (size % 2 == 0) {
                boolean flag = true;
                for (int j = 1; j < size; j++) {
                    if (flag) {
                        output = output + input.charAt(j);
                    } else {
                        output = input.charAt(j) + output;
                    }
                    flag = !flag;
                }
            } else {
                boolean flag = false;
                for (int j = 1; j < size; j++) {
                    if (flag) {
                        output = output + input.charAt(j);
                    } else {
                        output = input.charAt(j) + output;
                    }
                    flag = !flag;
                }
            }
            outputArray[i] = output;
        }
        for (i = 0; i < testCasesCount; i++) {
            System.out.println(outputArray[i]);
        }
    }

}
