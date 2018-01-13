/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sun.awt.Win32GraphicsEnvironment;

/**
 *
 * @author srivemul
 */
public class FindingCyceInDirectedGraph {

    int V;    // No. of vertices
    List<Integer>[] adj;    //  array containing adjacency lists

    public FindingCyceInDirectedGraph(int v) {
        this.V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public boolean isCycle() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            recStack[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (isCycleUtil(i, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCycleUtil(int i, boolean[] visited, boolean[] recStack) {
        if (visited[i] == false) {
            visited[i] = true;
            recStack[i] = true;
            Iterator<Integer> iterator = adj[i].iterator();
            while (iterator.hasNext()) {
                int j = iterator.next();
                if (visited[j] == false && isCycleUtil(j, visited, recStack)) {
                    return true;
                } else if (recStack[i] == true) {
                    return true;
                }
            }
        }
        recStack[i] = false;
        return false;
    }
    public static void  main(String agrs[])
{
    // Create a graph given in the above diagram
    FindingCyceInDirectedGraph g = new FindingCyceInDirectedGraph(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
 
    if(g.isCycle())
       System.out.println("Graph contains cycle");
    else
       System.out.println("Graph doesn't contain cycle");
  //  return 0;
}
}
