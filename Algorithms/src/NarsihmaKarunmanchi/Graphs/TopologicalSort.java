/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

/**
 *
 * @author srivemul
 */
/*
Kahn’s algorithm for Topological Sorting
Algorithm:
Steps involved in finding the topological ordering of a DAG:

Step-1: Compute in-degree (number of incoming edges) for each of the vertex present in the DAG and initialize the count of visited nodes as 0.

Step-2: Pick all the vertices with in-degree as 0 and add them into a queue (Enqueue operation)

Step-3: Remove a vertex from the queue (Dequeue operation) and then.

Increment count of visited nodes by 1.
Decrease in-degree by 1 for all its neighboring nodes.
If in-degree of a neighboring nodes is reduced to zero, then add it to the queue.
Step 5: Repeat Step 3 until the queue is empty.

Step 5: If count of visited nodes is not equal to the number of nodes in the graph then the topological sort is not possible for the given graph.

How to find in-degree of each node?
There are 2 ways to calculate in-degree of every vertex:
Take an in-degree array which will keep track of
1) Traverse the array of edges and simply increase the counter of the destination node by 1.

for each node in Nodes
	indegree[node] = 0;
for each edge(src,dest) in Edges
	indegree[dest]++
Time Complexity: O(V+E)

2) Traverse the list for every node and then increment the in-degree of all the nodes connected to it by 1.

	for each node in Nodes
		If (list[node].size()!=0) then
		for each dest in list
			indegree[dest]++;
Time Complexity: The outer for loop will be executed V number of times and the inner for loop will be executed E number of times, Thus overall time complexity is O(V+E).

The overall time complexity of the algorithm is O(V+E)
 */
class TopologicalGraph {

    int numVertices; // Number of vertices
    List<Integer>[] adjList; // Adjacency list

    public TopologicalGraph(int num) {
        numVertices = num;
        adjList = new ArrayList[num];
        for (int i = 0; i < num; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void toplogicalSort() {
        // Create an array for indegree
        int[] indegree = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            ArrayList<Integer> temp = (ArrayList< Integer>) adjList[i];
            for (int node : temp) {
                indegree[node]++;
            }
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numVertices; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        Vector<Integer> vectorTopologicalOrder = new Vector<>();
        while (!queue.isEmpty()) {
            int val = queue.poll();
            //  System.out.println(val + "");
            vectorTopologicalOrder.add(val);
            for (int node : adjList[val]) {
                if (--indegree[node] == 0) {
                    queue.add(node);
                }
            }
            count++;
        }
        if (count != numVertices) {
            System.out.println("There exists a cycle in the graph");
        }
        for (int i : vectorTopologicalOrder) {
            System.out.print(i + " ");
        }
    }
}

public class TopologicalSort {

    public static void main(String args[]) {
        // Create a graph given in the above diagram
        TopologicalGraph g = new TopologicalGraph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("Following is a Topological Sort");
        g.toplogicalSort();

    }
}
