/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandfordCourseraAlgoithmsPartI.DivideAndConquer;

/**
 *
 * @author srivemul
 */
public class MatrixMultiplicationConventional {

    private int[][] A;
    private int[][] B;
    private int mA, nA, mB, nB;

    MatrixMultiplicationConventional(int mA, int nA, int mB, int nB) {
        this.mA = mA;
        this.nA = nA;
        this.mB = mB;
        this.nB = nB;
        A = new int[mA][nA];
        B = new int[mB][nB];
    }

    public void intializeMatrices() {
        for (int i = 1; i <= mA; i++) {
            for (int j = 1; j <= nA; j++) {
                A[i][j] = i * j;
            }
        }
        for (int i = 1; i <= mB; i++) {
            for (int j = 1; j <= nB; j++) {
                B[i][j] = i * j;
            }
        }
    }

    public int[][] matrixMultiplication() {
        if (nA != mB) {
            return null;
        }
        int[][] C = new int[mA][nB];
        for (int i = 0; i < mA; i++) { //row of first matrix
            for (int j = 0; j < nB; j++) {  //column of second matrix
                int sum = 0;
                for (int k = 0; k < nA; k++) {
                    sum = sum + A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }

        }
        return C;
    }
}
