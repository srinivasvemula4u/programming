/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.BackTracking;

/**
 *
 * @author srivemul
 */
public class GenerateBinaryStrings {

    private int N;
    int[] A;
    public static int totalCount;

    public GenerateBinaryStrings(int n) {
        this.N = n;
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = 0;
        }
        totalCount = 0;
    }

    public void generateBinaryString(int n) {
        if (n < 1) {
            printString();

            return;
        } else {
            A[n - 1] = 0;
        }
        generateBinaryString(n - 1);
        A[n - 1] = 1;
        generateBinaryString(n - 1);
    }

    public void generateBinaryStringVariaton2(int n, int k) {
        if (n < 1) {
            printString();
            totalCount++;
            return;
        } else {
            for (int i = 0; i < k; i++) {
                A[n - 1] = i;
                generateBinaryStringVariaton2(n - 1, k);
            }
        }
    }

    private void printString() {
        for (int i = 0; i < N; i++) {
            System.out.print("" + A[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        GenerateBinaryStrings obj = new GenerateBinaryStrings(3);
        // obj.generateBinaryString(3);
        obj.generateBinaryStringVariaton2(3, 2);
        System.out.println("Total Count = " + obj.totalCount);
    }
}
