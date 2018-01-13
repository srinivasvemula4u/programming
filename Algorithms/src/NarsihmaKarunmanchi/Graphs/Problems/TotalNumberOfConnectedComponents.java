/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs.Problems;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class TotalNumberOfConnectedComponents {

    private int[][] adjMatrix;
    private boolean[] visited;
    int V;

    public TotalNumberOfConnectedComponents(int v) {
        V = v;
        adjMatrix = new int[v][v];
        visited = new boolean[v];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public int totalNumberOfConnectedComponents() {
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                DFSUtil(i);
                count++;
            }
        }
        return count;
    }

    private void DFSUtil(int i) {
        visited[i] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        while (!stack.isEmpty()) {
            int neighborIndex = getAdjUnvisitedVertex(stack.peek());
            if (neighborIndex == -1) {
                stack.pop();
            } else {
                stack.push(neighborIndex);
                visited[neighborIndex] = true;
            }

        }
    }

    private int getAdjUnvisitedVertex(Integer src) {
        for (int i = 0; i < V; i++) {
            if (adjMatrix[src][i] == 1 && visited[i] == false) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        TotalNumberOfConnectedComponents graph = new TotalNumberOfConnectedComponents(8);
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
        graph.addEdge(6, 7);
        // graph.printAdjMatrix();
        System.out.println(graph.totalNumberOfConnectedComponents());
    }

}
