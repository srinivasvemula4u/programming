/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class TreeTravels {

    public static void preOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.getData());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    public static void inOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraversal(root.getLeft());
            System.out.print(" " + root.getData());
            inOrderTraversal(root.getRight());
        }

    }

    public static void postOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.print(" " + root.getData());
        }
    }

    public static void preOrderTraversalIterative(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.pop();
            list.add(current.getData());
            if (current.getRight() != null) {
                stack.push(current.getRight());
            }

            if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
        }
        for (int value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
    }

    public static void inOrderTraversalIterative(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode currentNode = root;
        Boolean isDone = false;
        while (!isDone) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else if (stack.isEmpty()) {
                isDone = true;
            } else {
                currentNode = stack.pop();
                list.add(currentNode.getData());
                currentNode = currentNode.getRight();
            }
        }
        for (int value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
    }

    public static void postOrderTraversalIterative(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return;
        }
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
                list.add(currentNode.getData());
                stack.pop();
            }
            previousNode = currentNode;
        }
        for (int value : list) {
            System.out.print(" " + value);
        }
        System.out.println();

    }

    public static void levelOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            //  root = temp;
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            list.add(current.getData());
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
        for (int value : list) {
            System.out.print(" " + value);
        }
        System.out.println();

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
        postOrderTraversal(tree.getRoot());
        System.out.println();
        postOrderTraversalIterative(tree.getRoot());
        levelOrderTraversal(tree.getRoot());
    }
}
