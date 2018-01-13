/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class DepthOfAcyclicGraph {

    int numVetices;
    List<Integer>[] adjList;

    public DepthOfAcyclicGraph(int num) {
        adjList = new ArrayList[num];
        numVetices = num;
        for (int i = 0; i < num; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public int depthOfAcyclicGraph() {
        int[] indegree = new int[numVetices];
        for (int i = 0; i < numVetices; i++) {
            for (int temp : adjList[i]) {
                indegree[temp]++;
            }
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numVetices; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        queue.offer(-1);
        int count = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (v == -1) {
                count++;
                if (!queue.isEmpty()) {
                    queue.offer(-1);
                }
            } else {
                for (int node : adjList[v]) {
                    if (--indegree[node] == 0) {
                        queue.add(node);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // Create a graph given in the above diagram
        DepthOfAcyclicGraph g = new DepthOfAcyclicGraph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        //  System.out.println("Following is a Topological Sort");
        System.out.println(g.depthOfAcyclicGraph());

    }
}
