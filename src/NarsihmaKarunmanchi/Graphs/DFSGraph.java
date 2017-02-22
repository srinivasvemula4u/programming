/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
// Need to implement using Adjacency List
/*
Appliction of DFS
1) Topological Sorting
2) Finding connectd components
3) Finding atriculation points(cut vertices) of the graph
4) Finding strongly connected components
5) Solving puzzles such as mazes
*/
 class DFSVertex {

    private char label;
    private boolean visited;

    public DFSVertex(char label) {
        this.label = label;
        this.visited = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}

public class DFSGraph {

    private final int maxVertices = 20;
    private DFSVertex[] vertexList;
    private int[][] adjMatrix;
    private int vertexCount;
    private Stack<Integer> stack;

    public DFSGraph() {
        vertexList = new DFSVertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        vertexCount = 0;
        stack = new Stack<>();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new DFSVertex(label);
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void displayVertex(DFSVertex v) {
        System.out.print(" " + v.getLabel());
    }

    public void dfsGraph() {
        vertexList[0].setVisited(true);
        displayVertex(vertexList[0]);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].setVisited(true);
                displayVertex(vertexList[v]);
                stack.push(v);
            }
        }
        for (int j = 0; j < vertexCount; j++) {
            vertexList[j].setVisited(false);
        }
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].isVisited() == false) {
                return i;
            }
        }
        return -1;
    }

    public void printAdjMatrix() {
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        DFSGraph graph = new DFSGraph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('E');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        graph.printAdjMatrix();
        graph.dfsGraph();
    }

}
