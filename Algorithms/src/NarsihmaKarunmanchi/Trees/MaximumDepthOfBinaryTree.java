/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class MaximumDepthOfBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static int maximumDepthOfBinaryTree(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = maximumDepthOfBinaryTree(root.getLeft());
        int maxRight = maximumDepthOfBinaryTree(root.getRight());
        return 1 + Math.max(maxLeft, maxRight);
    }

    public static int maximumDepthOfBinaryTreeWithStack(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        //Stack<BinaryTreeNode>  
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        int maxDepth = 0;
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.peek();
            if (prev == null || prev.getLeft() == current
                    || prev.getRight() == current) {
                if (current.getLeft() != null) {
                    stack.push(current.getLeft());
                } else if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
            } else if (current.getLeft() == prev) {
                if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
            } else {
                stack.pop();
            }
            prev = current;
            if (stack.size() > maxDepth) {
                maxDepth = stack.size();
            }
        }
        return maxDepth;

    }

    public static int maximumDepthOfBinaryTreeWithQueue(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int maxDepth = 1;
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current != null) {
                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.offer(current.getRight());
                }
            } else {
                if (!queue.isEmpty()) {
                    maxDepth++;
                    queue.offer(null);
                }
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        //  tree.insert(15);
        System.out.println("Height of the tree is " + maximumDepthOfBinaryTree(tree.getRoot()));
        System.out.println("Height of the tree is " + maximumDepthOfBinaryTreeWithStack(tree.getRoot()));
        System.out.println("Height of the tree is " + maximumDepthOfBinaryTreeWithQueue(tree.getRoot()));
    }

}
