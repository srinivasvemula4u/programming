/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Arrays;

/**
 *
 * @author srivemul What is Minimum Spanning Tree? Given a connected and
 * undirected graph, a spanning tree of that graph is a subgraph that is a tree
 * and connects all the vertices together. A single graph can have many
 * different spanning trees. A minimum spanning tree (MST) or minimum weight
 * spanning tree for a weighted, connected and undirected graph is a spanning
 * tree with weight less than or equal to the weight of every other spanning
 * tree. The weight of a spanning tree is the sum of weights given to each edge
 * of the spanning tree.
 *
 * How many edges does a minimum spanning tree has? A minimum spanning tree has
 * (V – 1) edges where V is the number of vertices in the given graph.
 *
 * 1. Sort all the edges in non-decreasing order of their weight.
 *
 * 2. Pick the smallest edge. Check if it forms a cycle with the spanning tree
 * formed so far. If cycle is not formed, include this edge. Else, discard it. *
 * 3. Repeat step#2 until there are (V-1) edges in the spanning tree.
 */
public class KruskalAlgorithm {
    // A class to represent a graph edge 

    class Edge implements Comparable<Edge> {

        int src, dest, weight;

        @Override
        public int compareTo(Edge t) {
            return this.weight - t.weight;
        }

    }
    // A class to represent a subset for union-find

    class Subset {

        int parent, rank;
    }
    int V, E;
    Edge[] edge;

    public KruskalAlgorithm(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }
    // A utility function to find set of an element i
    // (uses path compression technique)

    public int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }

        return subsets[i].parent;
    }

    // A function that does union of two sets of x and y
    // (uses union by rank)
    public void union(Subset[] subsets, int x, int y) {
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);
        // Attach smaller rank tree under root of high rank tree
        // (Union by Rank)
        if (subsets[xRoot].rank < subsets[yRoot].rank) {
            subsets[xRoot].parent = yRoot;
        } else if (subsets[xRoot].rank > subsets[yRoot].rank) {
            subsets[yRoot].parent = xRoot;
        } // If ranks are same, then make one as root and increment
        // its rank by one
        else {
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }

    }

    // The main function to construct MST using Kruskal's algorithm
    public void kruskalAlgo() {
        Edge[] result = new Edge[E];
        for (int i = 0; i < E; i++) {
            result[i] = new Edge();
        }
        // Tnis will store the resultant MST
        int e = 0;  // An index variable, used for result[]
        //   int i = 0;  // An index variable, used for sorted edges
        // Step 1:  Sort all the edges in non-decreasing order of their
        // weight.  If we are not allowed to change the given graph, we
        // can create a copy of array of edges
        Arrays.sort(edge);
        // Allocate memory for creating V ssubsets
        Subset subsets[] = new Subset[V];
        for (int i = 0; i < V; ++i) {
            subsets[i] = new Subset();
        }

        // Create V subsets with single elements
        for (int v = 0; v < V; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        int i = 0;  // Index used to pick next edge

        // Number of edges to be taken is equal to V-1
        while (e < V - 1) {
            // Step 2: Pick the smallest edge. And increment the index
            // for next iteration
            //Edge next_edge = new Edge();
            Edge next_edge = edge[i++];

            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            // If including this edge does't cause cycle, include it
            // in result and increment the index of result for next edge
            if (x != y) {
                result[e++] = next_edge;
                union(subsets, x, y);
            }
            // Else discard the next_edge
            // print the contents of result[] to display the built MST

        }
        System.out.println("Following are the edges in the constructed MST");
        for (i = 0; i < e; ++i) {
            System.out.println(result[i].src + " -- " + result[i].dest + " == "
                    + result[i].weight);
        }

    }
    // Driver Program

    public static void main(String[] args) {

        /* Let us create following weighted graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        KruskalAlgorithm graph = new KruskalAlgorithm(V, E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;

        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;

        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;

        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;

        graph.kruskalAlgo();
    }
}
