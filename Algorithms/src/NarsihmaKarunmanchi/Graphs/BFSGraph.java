/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
/*
1) Finding all connected componnets in a graph
2) Finding all nodes within one connected component
3) Finding shortest path between two nodes
4) Testing a graph for bipartiness
*/
class BFSVertex {

    private char label;
    private boolean visited;

    public BFSVertex(char label) {
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

public class BFSGraph {

    private final int maxVertices = 20;
    private BFSVertex[] vertexList;
    private int[][] adjMatrix;
    private int vertexCount;
    private Queue<Integer> queue;

    public BFSGraph() {
        vertexList = new BFSVertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        vertexCount = 0;
        queue = new LinkedList<>();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new BFSVertex(label);
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void displayVertex(BFSVertex v) {
        System.out.print(" " + v.getLabel());
    }

    public void printAdjMatrix() {
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjMatrix[i][j]);
            }
            System.out.println();
        }
    }
    public void bfsGraph() {
         vertexList[0].setVisited(true);
        displayVertex(vertexList[0]);
        queue.offer(0);
        while(!queue.isEmpty()) {
            int v1 = queue.poll();
            int v2;
            while((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].setVisited(true);
                displayVertex(vertexList[v2]);
                queue.offer(v2);
                
            }
                    
        }
    }

    private int getAdjUnvisitedVertex(int v1) {
      for(int i=0; i < vertexCount; i++) {
          if(adjMatrix[v1][i] == 1 && vertexList[i].isVisited() == false)
              return i;
          
      }
      return -1;
    }
     public static void main(String args[]) {
        BFSGraph graph = new BFSGraph();
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
        graph.bfsGraph();
    }

}
