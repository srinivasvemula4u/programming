/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
class DijkstraGraph {

    private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; //
    private int[][] adjMatrix;

    public DijkstraGraph(int num) {
        numVertices = num;
        adjList = new LinkedList[num];
        for (int i = 0; i < num; i++) {
            adjList[i] = new LinkedList<>();
        }
        adjMatrix = new int[num][num];
    }

    public int getNumVertices() {
        return numVertices;
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    public void addEdge(int v, int w, int weight) {
        adjList[v].add(w);
        adjMatrix[v][w] = weight;
    }

    public void printAdjMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

public class DijkstraShortestPathAlgorithm {

    private int[] distance; // Distance from Starting Node to current node
    private int[] path; // Will contain the previous Node info

    public void weightedShortestPath(DijkstraGraph G, int v) {
        Queue<Integer> queue = new LinkedList<>();
        distance = new int[G.getNumVertices()];
        path = new int[G.getNumVertices()];
        queue.offer(v);
        for (int i = 0; i < G.getNumVertices(); i++) {
            distance[i] = 0;
            path[i] = -1;
        }
        distance[v] = 0;
        // path[v] = -1;
        while (!queue.isEmpty()) {
            int prevNode = queue.poll();
            Iterator<Integer> it = G.getAdjList()[prevNode].iterator();
            while (it.hasNext()) {
                int nextNode = it.next();
                int cost = distance[prevNode] + G.getAdjMatrix()[prevNode][nextNode];
                if (distance[nextNode] == 0 && nextNode != v) {
                    distance[nextNode] = cost;
                    path[nextNode] = prevNode;
                    queue.offer(nextNode);
                } else if (distance[nextNode] > cost) {
                    distance[nextNode] = cost;
                    path[nextNode] = prevNode;
                    queue.offer(nextNode);
                }
            }

        }
        System.out.println("node" + " " + "distance" + " " + "path(From Prvious Node)");
        for (int i = 0; i < G.getNumVertices(); i++) {
            System.out.println(i + "        " + distance[i] + "        " + path[i]);
        }
    }

    public static void main(String args[]) {
        DijkstraGraph g = new DijkstraGraph(6);
//        g.addEdge(0, 1, 4);
//        g.addEdge(0, 2, 1);
//        g.addEdge(1, 4, 4);
//        g.addEdge(2, 1, 2);
//        g.addEdge(2, 3, 4);
//        g.addEdge(3, 4, 4);

        //g.DFS2();
//        
//                                  {{0, 4, 0, 0, 0, 0, 0, 8, 0},
//                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
//                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
//                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
//                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
//                                  {0, 0, 4, 0, 10, 0, 2, 0, 0},
//                                  {0, 0, 0, 14, 0, 2, 0, 1, 6},
//                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
//                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
//                                 };
//        g.addEdge(0, 1, 4);
//        g.addEdge(6, 3, 14);
//        g.addEdge(6, 5, 2);
//        g.addEdge(6, 7, 1);
//        g.addEdge(6, 8, 6);
//        g.addEdge(0, 7, 8);
//        g.addEdge(7, 0, 8);
//        g.addEdge(7, 1, 11);
//        g.addEdge(7, 6, 1);
//        g.addEdge(7, 8, 7);
//        g.addEdge(1, 0, 4);
//        g.addEdge(8, 2, 2);
//        g.addEdge(8, 6, 6);
//        g.addEdge(8, 7, 7);
//        g.addEdge(1, 2, 8);
//        g.addEdge(1, 7, 11);
//        g.addEdge(2, 1, 8);
//        g.addEdge(2, 3, 7);
//        g.addEdge(2, 5, 4);
//        g.addEdge(2, 8, 2);
//        g.addEdge(3, 2, 7);
//        g.addEdge(3, 4, 9);
//        g.addEdge(3, 5, 14);
//        g.addEdge(4, 3, 9);
//        g.addEdge(4, 5, 10);
//        g.addEdge(5, 2, 4);
//        g.addEdge(5, 4, 10);
//        g.addEdge(5, 6, 2);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 3, 3);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 4, -3);
        g.addEdge(2, 1, -1);
        g.addEdge(3, 4, 3);
        g.addEdge(4, 2, 4);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 2, 4);

        g.printAdjMatrix();
        new DijkstraShortestPathAlgorithm().weightedShortestPath(g, 0);
    }
}
