/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

/**
 *
 * @author srivemul We have discussed Kruskal’s algorithm for Minimum Spanning
 * Tree. Like Kruskal’s algorithm, Prim’s algorithm is also a Greedy algorithm.
 * It starts with an empty spanning tree. The idea is to maintain two sets of
 * vertices. The first set contains the vertices already included in the MST,
 * the other set contains the vertices not yet included. At every step, it
 * considers all the edges that connect the two sets, and picks the minimum
 * weight edge from these edges. After picking the edge, it moves the other
 * endpoint of the edge to the set containing MST. A group of edges that
 * connects two set of vertices in a graph is called cut in graph theory. So, at
 * every step of Prim’s algorithm, we find a cut (of two sets, one contains the
 * vertices already included in MST and other contains rest of the verices),
 * pick the minimum weight edge from the cut and include this vertex to MST Set
 * (the set that contains already included vertices).
 *
 * How does Prim’s Algorithm Work? The idea behind Prim’s algorithm is simple, a
 * spanning tree means all vertices must be connected. So the two disjoint
 * subsets (discussed above) of vertices must be connected to make a Spanning
 * Tree. And they must be connected with the minimum weight edge to make it a
 * Minimum Spanning Tree.
 *
 * Algorithm 1) Create a set mstSet that keeps track of vertices already
 * included in MST. 2) Assign a key value to all vertices in the input graph.
 * Initialize all key values as INFINITE. Assign key value as 0 for the first
 * vertex so that it is picked first. 3) While mstSet doesn’t include all
 * vertices ….a) Pick a vertex u which is not there in mstSet and has minimum
 * key value. ….b) Include u to mstSet. ….c) Update key value of all adjacent
 * vertices of u. To update the key values, iterate through all adjacent
 * vertices. For every adjacent vertex v, if weight of edge u-v is less than the
 * previous key value of v, update the key value as weight of u-v
 *
 * The idea of using key values is to pick the minimum weight edge from cut. The
 * key values are used only for vertices which are not yet included in MST, the
 * key value for these vertices indicate the minimum weight edges connecting
 * them to the set of vertices included in MST.
 */
public class PrimsAlgorithm {

    private int numVertices;

    public PrimsAlgorithm(int v) {
        numVertices = v;
    }

    private int getMinKey(int[] key, boolean[] minSpaSet) {
        int minValue = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < numVertices; i++) {
            if (minSpaSet[i] == false && key[i] < minValue) {
                minValue = key[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void printMST(int parent[], int graph[][]) {
        System.out.println("Edge   Weight");
        for (int i = 1; i < numVertices; i++) {
            System.out.println(parent[i] + " - " + i + "    "
                    + graph[i][parent[i]]);
        }
    }

    public void primsAlgorithm(int[][] graph, int start) {
        int[] key = new int[numVertices];
        int[] parent = new int[numVertices];
        boolean[] mstSpaSet = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
            mstSpaSet[i] = false;
        }
        key[start] = 0;
        for (int count = 0; count < numVertices - 1; count++) {
            int src = getMinKey(key, mstSpaSet);
            mstSpaSet[src] = true;
            for (int dest = 0; dest < numVertices; dest++) {
                if (mstSpaSet[dest] == false && graph[src][dest] != 0
                        && graph[src][dest] < key[dest]) {
                    key[dest] = graph[src][dest];
                    parent[dest] = src;
                }
            }

        }
        printMST(parent, graph);

    }

    public static void main(String[] args) {
        /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
        PrimsAlgorithm t = new PrimsAlgorithm(5);
        int graph[][] = new int[][]{{0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0},};

        // Print the solution
        t.primsAlgorithm(graph, 0);
    }
}
