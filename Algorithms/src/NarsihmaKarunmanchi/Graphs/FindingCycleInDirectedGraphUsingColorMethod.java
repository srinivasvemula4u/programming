/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author srivemul HITE : Vertex is not processed yet. Initially all vertices
 * are WHITE.
 *
 * GRAY : Vertex is being processed (DFS for this vertex has started, but not
 * finished which means that all descendants (ind DFS tree) of this vertex are
 * not processed yet (or this vertex is in function call stack)
 *
 * BLACK : Vertex and all its descendants are processed.
 *
 * While doing DFS, if we encounter an edge from current vertex to a GRAY
 * vertex, then this edge is back edge and hence there is a cycle.
 */
public class FindingCycleInDirectedGraphUsingColorMethod {

    private final static int WHITE = 0;
    private final static int GREY = 1;
    private final static int BLACK = 2;
    private int V;
    private List<Integer>[] adjList;

    public FindingCycleInDirectedGraphUsingColorMethod(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    public boolean isCycle() {
        int[] colorArray = new int[V];
        for (int i = 0; i < V; i++) {
            colorArray[i] = WHITE;
        }
        for (int i = 0; i < V; i++) {
            if (colorArray[i] == WHITE) {
                if (isCycleUtil(i, colorArray) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycleUtil(int start, int[] colorArray) {
        colorArray[start] = GREY;
        Iterator<Integer> itr = adjList[start].iterator();
        while (itr.hasNext()) {
            int next = itr.next();
            if (colorArray[next] == GREY) {
                return true;
            }
            if (colorArray[next] == WHITE && isCycleUtil(next, colorArray)) {
                return true;
            }
        }
        colorArray[start] = BLACK;
        return false;
    }

    public static void main(String args[]) {
        // Create a graph given in the above diagram
        FindingCycleInDirectedGraphUsingColorMethod g = new FindingCycleInDirectedGraphUsingColorMethod(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        if (g.isCycle()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph does not contain cycle");
        }

        // return 0;
    }

}
