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
public class FindingHeightOfTree {

    public static int findingHeightOfTree(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = findingHeightOfTree(root.getLeft());
        int rightDepth = findingHeightOfTree(root.getRight());
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static int findingHeightOfTreeWithStack(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = Integer.MIN_VALUE;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode previousNode = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.peek();
            if (previousNode == null || previousNode.getLeft() == currentNode || previousNode.getRight() == currentNode) {
                if (currentNode.getLeft() != null) {
                    stack.push(currentNode.getLeft());
                } else if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
            } else if (currentNode.getLeft() == previousNode) {
                if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
            } else {
                stack.pop();
            }
            previousNode = currentNode;
            if (stack.size() > maxDepth) {
                maxDepth = stack.size();
            }
        }
        return maxDepth;
    }

    public static int findingHeightOfTreeWithQueue(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int count = 1;
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if (currentNode != null) {
//                if (currentNode.getLeft() == null && currentNode.getRight() == null) {
//                   // return count;
//                }
                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            } else if (currentNode == null) {
                if (!queue.isEmpty()) {
                    count++;
                    queue.offer(null);
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        //  tree.insert(8);
        //  tree.insert(9);
        System.out.println("Height of the tree is " + findingHeightOfTree(tree.getRoot()));
        System.out.println("Height of the tree is " + findingHeightOfTreeWithStack(tree.getRoot()));
        System.out.println("Height of the tree is " + findingHeightOfTreeWithQueue(tree.getRoot()));
    }
}
