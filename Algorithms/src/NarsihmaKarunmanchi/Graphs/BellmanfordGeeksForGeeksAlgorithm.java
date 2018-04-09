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
public class BellmanfordGeeksForGeeksAlgorithm {

    class Edge {

        private int src, dest, weight;

        public Edge() {
            src = dest = weight = 0;
        }

        public int getSrc() {
            return src;
        }

        public int getDest() {
            return dest;
        }

        public int getWeight() {
            return weight;
        }

        public void setSrc(int src) {
            this.src = src;
        }

        public void setDest(int dest) {
            this.dest = dest;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
    private int numVertices, numEdges;
    Edge[] edges;
    private int[] dist;
    private int[] predecessors;

    public BellmanfordGeeksForGeeksAlgorithm(int V, int E) {
        this.numEdges = E;
        this.numVertices = V;
        edges = new Edge[E];
        for (int i = 0; i < E; i++) {
            edges[i] = new Edge();
        }
        dist = new int[V];
        predecessors = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            predecessors[i] = Integer.MIN_VALUE;
        }

    }

    public void bellmanFordAlgo(int start) {

        dist[start] = 0;
        for (int i = 1; i < numVertices; i++) {
            for (int j = 0; j < numEdges; j++) {
                int src = edges[j].getSrc();
                int dest = edges[j].getDest();
                int weight = edges[j].getWeight();
                if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]) {
                    dist[dest] = dist[src] + weight;
                    predecessors[dest] = src;
                }
            }
        }

        for (int i = 0; i < numEdges; i++) {
            int src = edges[i].getSrc();
            int dest = edges[i].getDest();
            int weight = edges[i].getWeight();
            if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        printResult();
    }

    private void printResult() {
        System.out.println("node" + " " + "distance" + " " + "path(From Prvious Node)");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "        " + dist[i] + "        " + predecessors[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;  // Number of vertices in graph
        int E = 8;  // Number of edges in graph

        BellmanfordGeeksForGeeksAlgorithm graph = new BellmanfordGeeksForGeeksAlgorithm(V, E);

        // add edge 0-1 (or A-B in above figure)
        graph.edges[0].src = 0;
        graph.edges[0].dest = 1;
        graph.edges[0].weight = -1;

        // add edge 0-2 (or A-C in above figure)
        graph.edges[1].src = 0;
        graph.edges[1].dest = 2;
        graph.edges[1].weight = 4;

        // add edge 1-2 (or B-C in above figure)
        graph.edges[2].src = 1;
        graph.edges[2].dest = 2;
        graph.edges[2].weight = 3;

        // add edge 1-3 (or B-D in above figure)
        graph.edges[3].src = 1;
        graph.edges[3].dest = 3;
        graph.edges[3].weight = 2;

        // add edge 1-4 (or A-E in above figure)
        graph.edges[4].src = 1;
        graph.edges[4].dest = 4;
        graph.edges[4].weight = 2;

        // add edge 3-2 (or D-C in above figure)
        graph.edges[5].src = 3;
        graph.edges[5].dest = 2;
        graph.edges[5].weight = 5;

        // add edge 3-1 (or D-B in above figure)
        graph.edges[6].src = 3;
        graph.edges[6].dest = 1;
        graph.edges[6].weight = 1;

        // add edge 4-3 (or E-D in above figure)
        graph.edges[7].src = 4;
        graph.edges[7].dest = 3;
        graph.edges[7].weight = -3;

        // Edge to cause cycle
        //graph.edges[8].src = 1;
        //graph.edges[8].dest = 0;
       // graph.edges[8].weight = 0;

        graph.bellmanFordAlgo(0);
    }
}
