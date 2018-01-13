/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

/**
 *
 * @author srivemul
 */
public class AdjacentMatrixGraph {

    private int[][] adjMatrix;
    private int vertexCount;

    public AdjacentMatrixGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new int[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            adjMatrix[i][j] = 1;
            adjMatrix[j][i] = 1;
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            adjMatrix[i][j] = 0;
            adjMatrix[i][j] = 0;
        }
    }

    public boolean isEdget(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            if (adjMatrix[i][j] == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
