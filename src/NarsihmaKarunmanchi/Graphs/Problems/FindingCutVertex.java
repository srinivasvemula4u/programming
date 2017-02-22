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
 * @author srivemul A connected, undirected graph is biconnected if the graph is
 * still connected after removing any one Vertex  I.e., when a “node” fails,
 * there is always an alternative route  If a graph is not biconnected, the
 * disconnecting vertices are called articulation points  Critical points of
 * interest in many applications From any Vertex v, perform DFS and number
 * vertices as they are visited  Num(v) is the visit number  Let Low(v) =
 * lowest-numbered Vertex reachable from v using 0 or more spanning tree edges
 * and then at most one back edge  Low(v) = minimum of  Num(v)  Lowest Num(w)
 * among all back edges (v,w)  Lowest Low(w) among all tree edges (v,w)  Can
 * compute Num(v) and Low(v) in O(|E|+|V|) tim
 */
// It is also known as articulation point
class Vertex {

    int id;
    char label;
    char parent;
    int num;
    int low; // holds low value
    boolean visited;

    public Vertex() {
        parent = Character.MIN_VALUE;
        num = 0;
        low = 0;
        visited = false;
        label = ' ';
        id = -1;
    }

    public Vertex(int id, char name) {
        this.label = name;
        this.id = id;
    }
}

public class FindingCutVertex {

    private int numVertices;
    Vertex[] vertex;
    LinkedList<Vertex>[] list;
    private int counter = 0;
    int intialvertex;

    public FindingCutVertex(int num) {
        numVertices = num;
        vertex = new Vertex[num];
        list = new LinkedList[num];
        // int intialvertex;
        for (int i = 0; i < numVertices; i++) {
            list[i] = new LinkedList<>();
            vertex[i] = new Vertex();
        }
    }

    public void addVertex(int id, char label) {
        Vertex v1 = new Vertex(id, label);
        vertex[id] = v1;
    }

    private Vertex getVertex(char label) {
        for (int i = 0; i < numVertices; i++) {
            if (vertex[i].label == label) {
                return vertex[i];
            }
        }
        return null;
    }

    public void addEdge(char src, char dest) {

        Vertex srcVertex = getVertex(src);
        Vertex destVertex = getVertex(dest);
        list[srcVertex.id].add(destVertex);
        list[destVertex.id].add(srcVertex);
    }

    public void assignNum(int v) {
        vertex[v].num = ++counter;
        vertex[v].visited = true;
        Iterator<Vertex> iterator = list[v].iterator();
        while (iterator.hasNext()) {
            Vertex w = iterator.next();
            w.parent = vertex[v].label;
            if (w.visited == false) {
                assignNum(w.id);
            }
        }

    }
    // Not working

    public void assignLow(int v) {
        vertex[v].low = vertex[v].num;
        Iterator<Vertex> iterator = list[v].iterator();
        while (iterator.hasNext()) {
            int w = iterator.next().id;
            if (vertex[w].num > vertex[v].num) { // forward edge
                assignLow(w);
                if (vertex[w].low >= vertex[v].num) {
                    System.out.println(vertex[v].label + " is an cut vertex");
                }
                vertex[v].low = Math.min(vertex[v].low, vertex[w].low);
            } else if (vertex[v].parent != vertex[w].label) { // back edge
                vertex[v].low = Math.min(vertex[v].low, vertex[w].num);
            }
        }
    }

    public void findArticulation(int v) {
        vertex[v].low = vertex[v].num = ++counter;
        vertex[v].visited = true;
        int childCount = 0;
        Iterator<Vertex> iterator = list[v].iterator();
        while (iterator.hasNext()) {
            Vertex w = iterator.next();
            if (w.visited == false) {
                childCount++;
                w.parent = vertex[v].label;
                findArticulation(w.id);

                if (vertex[v].parent != Character.MIN_VALUE && w.low >= vertex[v].num) {
                    System.out.println(vertex[v].label + " is an articulation point");
                }
                if (vertex[v].parent == Character.MIN_VALUE && childCount > 1) {
                    System.out.println(vertex[v].label + " is an articulation point");
                }
                vertex[v].low = Math.min(vertex[v].low, w.low);   // Check if the subtree rooted with v has a connection to
                // one of the ancestors of u
            } else if (vertex[v].parent != w.label) {
                vertex[v].low = Math.min(vertex[v].low, w.num); // Update low value of u for parent function calls.
            }
        }
    }

    public static void main(String args[]) {
        FindingCutVertex obj = new FindingCutVertex(7);
        obj.addVertex(0, 'A');
        obj.addVertex(1, 'B');
        obj.addVertex(2, 'C');
        obj.addVertex(3, 'D');
        obj.addVertex(4, 'E');
        obj.addVertex(5, 'F');
        obj.addVertex(6, 'G');
        obj.addEdge('A', 'B');
        obj.addEdge('A', 'D');
        obj.addEdge('B', 'C');
        obj.addEdge('C', 'D');
        obj.addEdge('C', 'G');
        obj.addEdge('D', 'E');
        obj.addEdge('D', 'F');
        obj.addEdge('E', 'F');
        // obj.intialvertex = 3;
        obj.findArticulation(6);
        //  obj.assignLow(0);
    }
}
