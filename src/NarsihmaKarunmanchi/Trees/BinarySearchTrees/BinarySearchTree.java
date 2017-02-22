/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class BinarySearchTree {

    private BinarySearchTreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        BinarySearchTreeNode temp = new BinarySearchTreeNode(data);
        if (root == null) {
            root = temp;
            return;
        }
        Queue<BinarySearchTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinarySearchTreeNode current = queue.poll();
            if (temp.getData() < current.getData()) {
                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());
                } else if (current.getLeft() == null) {
                    current.setLeft(temp);
                    return;
                }
            } else if (temp.getData() >= current.getData()) {
                if (current.getRight() != null) {
                    queue.offer(current.getRight());
                } else if (current.getRight() == null) {
                    current.setRight(temp);
                    return;
                }
            }

        }
    }

    public static void inOrderTraversal(BinarySearchTreeNode root) {
        if (root != null) {
            inOrderTraversal(root.getLeft());
            System.out.print(" " + root.getData());
            inOrderTraversal(root.getRight());
        }

    }

    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        inOrderTraversal(tree.getRoot());
        System.out.println();
        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }
}
