/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs.Problems;

/**
 *
 * @author srivemul Algorithm for checking whether a given graph G has simple
 * paths from sources s to destination d
 */
public class HasSimplePath {

    private int[][] adjMatrix;
    private boolean[] visited;
    int V;

    public HasSimplePath(int v) {
        V = v;
        adjMatrix = new int[v][v];
        visited = new boolean[v];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public boolean hasSimplePath(int a, int b) {
        visited[a] = true;
        if (adjMatrix[a][b] != 0) {
            return true;
        }
        for (int i = 0; i < V; i++) {
            if (adjMatrix[a][i] != 0 && visited[i] == false) {
                if (hasSimplePath(i, b)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        HasSimplePath graph = new HasSimplePath(6);
//           graph.addVertex('A');
//        graph.addVertex('B');
//        graph.addVertex('E');
//        graph.addVertex('C');
//        graph.addVertex('D');
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
            graph.addEdge(4, 5);
       // graph.printAdjMatrix();
        System.out.println(graph.hasSimplePath(2,5));
    }
}
