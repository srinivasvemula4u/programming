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
class BfsGraph {

    private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // 

    public BfsGraph(int num) {
        numVertices = num;
        adjList = new LinkedList[num];
        for (int i = 0; i < num; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void BFS(int v) {
        boolean[] visited = new boolean[numVertices];
        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int val = queue.poll();
            System.out.print(val);
            Iterator<Integer> it = adjList[val].iterator();
            while (it.hasNext()) {
                int n = it.next();
                if (visited[n] == false) {
                    visited[n] = true;
                    queue.offer(n);
                }

            }
        }
    }
}

public class BFSGraphUsingAdjacencyList {

    public static void main(String args[]) {
        BfsGraph g = new BfsGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "
                + "(starting from vertex 2)");

        g.BFS(2);
    }

}
