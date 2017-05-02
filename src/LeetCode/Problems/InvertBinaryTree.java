/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
 /*
Solutions Hint : 
Approach #1 (Recursive) [Accepted]

This is a classic tree problem that is best-suited for a recursive approach.

Algorithm

The inverse of an empty tree is the empty tree. The inverse of a tree with root rr, and subtrees 
right
right and  left
left, is a tree with root rr, whose right subtree is the inverse of 
left
left, and whose left subtree is the inverse of 
right
right.
 */
 /*
Approach 2 : 

Approach #2 (Iterative) [Accepted]

Alternatively, we can solve the problem iteratively, in a manner similar to breadth-first search.

Algorithm

The idea is that we need to swap the left and right child of all nodes in the tree. 
So we create a queue to store nodes whose left and right child have not been swapped yet. 
Initially, only the root is in the queue. As long as the queue is not empty, 
remove the next node from the queue, swap its children, and add the children to the queue. 
Null nodes are not added to the queue. Eventually, the queue will be empty and all the children swapped, 
and we return the original root.
 */
public class InvertBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
    /*
    Complexity Analysis

Since each node in the tree is visited only once, the time complexity is O(n)O(n), 
    where nn is the number of nodes in the tree. We cannot do better than that, 
    since at the very least we have to visit each node to invert it.

  Because of recursion, O(h)O(h) function calls will be placed on the stack in the worst case, 
    where hh is the height of the tree. Because h\in O(n)h∈O(n), the space complexity is O(n)O(n).
     */

}
