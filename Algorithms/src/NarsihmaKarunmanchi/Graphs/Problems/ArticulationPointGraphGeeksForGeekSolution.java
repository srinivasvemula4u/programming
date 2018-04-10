/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs.Problems;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author srivemul
 * 
 * A vertex in an undirected connected graph is an articulation point (or cut vertex)
 * iff removing it (and edges through it) disconnects the graph. 
 * Articulation points represent vulnerabilities in a connected network – 
 * single points whose failure would split the network into 2 or more 
 * disconnected components. They are useful for designing reliable networks.
For a disconnected undirected graph, 
* an articulation point is a vertex removing which increases number of connected
* components.

Following are some example graphs with articulation points encircled with red color.
* 
* How to find all articulation points in a given graph?
A simple approach is to one by one remove all vertices and see if removal of a vertex causes disconnected graph. Following are steps of simple approach for connected graph.

1) For every vertex v, do following
…..a) Remove v from graph
..…b) See if the graph remains connected (We can either use BFS or DFS)
…..c) Add v back to the graph

Time complexity of above method is O(V*(V+E)) for a graph represented using adjacency list. Can we do better?

A O(V+E) algorithm to find all Articulation Points (APs)
The idea is to use DFS (Depth First Search). In DFS, we follow vertices in tree form called DFS tree. In DFS tree, a vertex u is parent of another vertex v, if v is discovered by u (obviously v is an adjacent of u in graph). In DFS tree, a vertex u is articulation point if one of the following two conditions is true.
1) u is root of DFS tree and it has at least two children.
2) u is not root of DFS tree and it has a child v such that no vertex in subtree rooted with v has a back edge to one of the ancestors (in DFS tree) of u.

We do DFS traversal of given graph with additional code to find out Articulation Points (APs). In DFS traversal, we maintain a parent[] array where parent[u] stores parent of vertex u. Among the above mentioned two cases, the first case is simple to detect. For every vertex, count children. If currently visited vertex u is root (parent[u] is NIL) and has more than two children, print it.
How to handle second case? The second case is trickier. We maintain an array disc[] to store discovery time of vertices. For every node u, we need to find out the earliest visited vertex (the vertex with minimum discovery time) that can be reached from subtree rooted with u. So we maintain an additional array low[] which is defined as follows.

Following figure shows same points as above with one additional point that a leaf in DFS Tree can never be an articulation point.
* low[u] = min(disc[u], disc[w]) 
where w is an ancestor of u and there is a back edge from 
some descendant of u to w.
 */
public class ArticulationPointGraphGeeksForGeekSolution {

    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;

    // Constructor
    ArticulationPointGraphGeeksForGeekSolution(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
        adj[w].add(v);  //Add v to w's list
    }

    // A recursive function that find articulation points using DFS
    // u --> The vertex to be visited next
    // visited[] --> keeps tract of visited vertices
    // disc[] --> Stores discovery times of visited vertices
    // parent[] --> Stores parent vertices in DFS tree
    // ap[] --> Store articulation points
    void APUtil(int u, boolean visited[], int disc[],
            int low[], int parent[], boolean ap[]) {

        // Count of children in DFS Tree
        int children = 0;

        // Mark the current node as visited
        visited[u] = true;

        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;

        // Go through all vertices aadjacent to this
        Iterator<Integer> i = adj[u].iterator();
        while (i.hasNext()) {
            int v = i.next();  // v is current adjacent of u

            // If v is not visited yet, then make it a child of u
            // in DFS tree and recur for it
            if (!visited[v]) {
                children++;
                parent[v] = u;
                APUtil(v, visited, disc, low, parent, ap);

                // Check if the subtree rooted with v has a connection to
                // one of the ancestors of u
                low[u] = Math.min(low[u], low[v]);

                // u is an articulation point in following cases
                // (1) u is root of DFS tree and has two or more chilren.
                if (parent[u] == NIL && children > 1) {
                    ap[u] = true;
                }

                // (2) If u is not root and low value of one of its child
                // is more than discovery value of u.
                if (parent[u] != NIL && low[v] >= disc[u]) {
                    ap[u] = true;
                }
            } // Update low value of u for parent function calls.
            else if (v != parent[u]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    // The function to do DFS traversal. It uses recursive function APUtil()
    void AP() {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
        boolean ap[] = new boolean[V]; // To store articulation points

        // Initialize parent and visited, and ap(articulation point)
        // arrays
        for (int i = 0; i < V; i++) {
            parent[i] = NIL;
            visited[i] = false;
            ap[i] = false;
        }

        // Call the recursive helper function to find articulation
        // points in DFS tree rooted with vertex 'i'
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                APUtil(i, visited, disc, low, parent, ap);
            }
        }

        // Now ap[] contains articulation points, print them
        for (int i = 0; i < V; i++) {
            if (ap[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver method
    public static void main(String args[]) {
        // Create graphs given in above diagrams
        System.out.println("Articulation points in first graph ");
        ArticulationPointGraphGeeksForGeekSolution g1 = new ArticulationPointGraphGeeksForGeekSolution(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.AP();
        System.out.println();

        System.out.println("Articulation points in Second graph");
        ArticulationPointGraphGeeksForGeekSolution g2 = new ArticulationPointGraphGeeksForGeekSolution(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.AP();
        System.out.println();

        System.out.println("Articulation points in Third graph ");
        ArticulationPointGraphGeeksForGeekSolution g3 = new ArticulationPointGraphGeeksForGeekSolution(7);
        g3.addEdge(0, 1);
        g3.addEdge(1, 2);
        g3.addEdge(2, 0);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(1, 6);
        g3.addEdge(3, 5);
        g3.addEdge(4, 5);
        g3.AP();
          System.out.println();
         System.out.println("Articulation points in Fourth graph ");
        ArticulationPointGraphGeeksForGeekSolution g4 = new ArticulationPointGraphGeeksForGeekSolution(7);
        g4.addEdge(0, 1);
        g4.addEdge(0, 3);
        g4.addEdge(1, 2);
        g4.addEdge(2, 3);
        g4.addEdge(2, 6);
        g4.addEdge(3, 4);
        g4.addEdge(3, 5);
        g4.addEdge(4, 5);
        g4.AP();
    }
}
// This code is contributed by Aakash Hasija
