/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class UnWeightedShortestPathAlgorithm {

    private int[] distance; // Distance from Starting Node to current node
    private int[] path; // Will contain the previous Node info

    public void unWeightedShortestPath(Graph G, int v) {
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
                if (distance[nextNode] == 0 && nextNode != v) {
                  distance[nextNode] = distance[prevNode] +1;
                  path[nextNode] = prevNode;
                  queue.offer(nextNode);
                }
            }

        }
        System.out.println("node"+ " "+"distance"+ " "+"path(From Prvious Node)");
        for(int i=0; i < G.getNumVertices(); i++) {
            System.out.println( i + "        "+ distance[i] + "        "+path[i]);
        }
    }
    public static void main(String args[]) {
      Graph g = new Graph(7);
      g.addEdge(0, 3);
      g.addEdge(0, 1);
      g.addEdge(1, 4);
      g.addEdge(1, 3);
      g.addEdge(2, 0);
      g.addEdge(2, 5);
      g.addEdge(3, 5);
      g.addEdge(3, 6);
      g.addEdge(4, 6);
      g.addEdge(6, 5);
     new UnWeightedShortestPathAlgorithm().unWeightedShortestPath(g,2);
      //g.DFS2();
  }
}
