/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author srivemul
 */
class Graph
{
    private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // 
    public Graph(int num ) {
        numVertices = num;
        adjList = new LinkedList[num];
        for(int i=0; i < num; i++)
            adjList[i] = new LinkedList<>();
    }

    public int getNumVertices() {
        return numVertices;
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }
    public void addEdge(int v,int w)
    {
        adjList[v].add(w);
    }
    public void DFS(int v) 
    {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(v,visited);
    }
    /* Note that above code traverses only the vertices are reachable from the given vertice.
    All the vertices may not be reachable from a given vertex.To do complete DFS travel of such graphs 
    we must call DFSUtil() from every vertex. Before calling we should also check whether that vertice is already 
    visited by previous DFSUtils or not. DFS2 is advanced version.
    */
    public void DFS2() {
          boolean[] visited = new boolean[numVertices];
          for(int i=0; i < numVertices; i++)
              if(visited[i] == false) {
                  DFSUtil(0,visited);
              }
    }

    private void DFSUtil(int v, boolean[] visited) {
       visited[v] = true;
       System.out.print(v+" ");
       Iterator<Integer> iterator = adjList[v].iterator();
       while(iterator.hasNext()) {
           int v1 = iterator.next();
           if(!visited[v1])
               DFSUtil(v1, visited);
       }
    }
}
public class DFSGraphUsingAdjacencyList {
  public static void main(String args[]) {
      Graph g = new Graph(4);
      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 3);
      g.DFS2();
  }
  }
