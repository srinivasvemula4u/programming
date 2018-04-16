/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Trees;

/**
 *
 * @author sv186040
 * Given a binary tree, print it vertically. The following example illustrates vertical order traversal.

           1
        /    \
       2      3
      / \    / \
     4   5  6   7
             \   \
              8   9 
               
			  
The output of print this tree vertically will be:
4
2
1 5 6
3 8
7
9 
* The idea is to traverse the tree once and get the minimum and maximum 
* horizontal distance with respect to root. For the tree shown above, 
* minimum distance is -2 (for node with value 4) and maximum distance is 3 
* (For node with value 9).
Once we have maximum and minimum distances from root, we iterate for each 
* vertical line at distance minimum to maximum from root, and for each vertical 
* line traverse the tree and print the nodes which lie on that vertical line.
* 
 */
public class VerticalOrderTraversal {
    
}
