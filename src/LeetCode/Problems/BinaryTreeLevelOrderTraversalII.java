/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.*;

/**
 *
 * @author srivemul
 */
/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevelOrderTraversalII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            stack.push(temp);
            if (temp != null) {
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                if (temp.left != null) {
                    queue.offer(temp.left);
                }

            } else // stack.push(null);
             if (!queue.isEmpty()) {
                    queue.offer(null);
                }

        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp == null) {
                if (list.size() != 0) {
                    res.add(list);
                    list = new ArrayList<>();
                }
            } else {
                list.add(temp.val);
            }
        }
        res.add(list);
        return res;

    }

}
