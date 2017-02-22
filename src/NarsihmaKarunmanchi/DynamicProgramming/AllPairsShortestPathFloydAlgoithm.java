/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class AllPairsShortestPathFloydAlgoithm {

    public static void shortesPathAlgorithm(int[][] c, int n) {
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = c[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            A[i][i] = 0;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((A[i][k] + A[k][j]) < A[i][j]) {
                        A[i][j] = A[i][k] + A[k][j];
                    }
                }
            }
        }
    }
}
