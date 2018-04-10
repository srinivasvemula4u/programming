/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

/**
 *
 * @author srivemul
 */
public class FindingCycleInUndirectedGraphUsingUnionFind {

    class Edge {

        int src, dest;

        public Edge() {
            src = 0;
            dest = 0;
        }
    }
    private int nVertices, nEdges;
    Edge[] edges;

    public FindingCycleInUndirectedGraphUsingUnionFind(int v, int e) {
        nVertices = v;
        nEdges = e;
        edges = new Edge[e];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
        }
    }

    int find(int parent[], int i) {
        /* if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);*/

        if ((parent[i]) != -1) {
            parent[i] = find(parent, parent[i]);
        }

        return i;
    }

    void union(int[] parent, int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);
        parent[xSet] = ySet;
    }

    public boolean isCycle() {
        int[] parent = new int[nVertices];
        for (int i = 0; i < nVertices; i++) {
            parent[i] = -1;
        }
        for (int i = 0; i < nEdges; i++) {
            int srcSet = find(parent, edges[i].src);
            int dstSet = find(parent, edges[i].dest);
            if (srcSet == dstSet) {
                return true;
            }
            union(parent, srcSet, dstSet);
        }
        return false;
    }
    // Driver Method

    public static void main(String[] args) {
        /* Let us create following graph
         0
        |  \
        |    \
        1-----2 */
        int V = 3, E = 2;
        FindingCycleInUndirectedGraphUsingUnionFind graph = new FindingCycleInUndirectedGraphUsingUnionFind(V, E);

        // add edge 0-1
        graph.edges[0].src = 0;
        graph.edges[0].dest = 1;

        // add edge 1-2
        graph.edges[1].src = 1;
        graph.edges[1].dest = 2;

        // add edge 0-2
        //graph.edges[2].src = 0;
        //graph.edges[2].dest = 2;
        if (graph.isCycle() == true) {
            System.out.println("graph contains cycle");
        } else {
            System.out.println("graph doesn't contain cycle");
        }
    }

}
