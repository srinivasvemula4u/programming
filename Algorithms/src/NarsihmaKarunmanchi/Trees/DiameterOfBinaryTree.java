/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  iven a binary tree, you need to compute the length of the diameter of the tree. 
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author srivemul
 */
public class DiameterOfBinaryTree {

    // Todo
    int max = 0;

    public int diameterOfBinaryTree(BinaryTreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
