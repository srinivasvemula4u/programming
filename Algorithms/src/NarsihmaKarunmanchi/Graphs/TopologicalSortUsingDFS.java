/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
/*
Applications Of topological Sorting
1) Representing course prerequisties
2) In detecting deadlocks
3) Pipeline of computing jobs
4) Checking for symbolic link loop
5) Evaluating formulae in spreadsheet

*/
// Need to check this further
class TopologicalGraphDFS 
{
     private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // 
    public TopologicalGraphDFS(int num ) {
        numVertices = num;
        adjList = new LinkedList[num];
        for(int i=0; i < num; i++)
            adjList[i] = new LinkedList<>();
    }
     public void addEdge(int v,int w)
    {
        adjList[v].add(w);
    }
     void topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();
 
        // Mark all the vertices as not visited
        Boolean visited[] = new Boolean[numVertices];
        for (int i = 0; i < numVertices; i++)
            visited[i] = false;
 
        // Call the recursive helper function to store Topological
        // Sort starting from all vertices one by one
        for (int i = 0; i < numVertices; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
 
        // Print contents of stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }

    private void topologicalSortUtil(int v, Boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adjList[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        // Push current vertex to stack which stores result
        stack.push(new Integer(v));
    }
}
public class TopologicalSortUsingDFS {
     public static void main(String args[])
    {
        // Create a graph given in the above diagram
        TopologicalGraphDFS g = new TopologicalGraphDFS(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
    }
}
