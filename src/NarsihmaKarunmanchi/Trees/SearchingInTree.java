/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class SearchingInTree {

    public static boolean searchRecursive(BinaryTreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.getData() == data) {
            return true;
        } else {
            return searchRecursive(root.getLeft(), data) || searchRecursive(root.getRight(), data);
        }
    }

    public static boolean searchIterative(BinaryTreeNode root, int data) {
        if (root == null) {
            return false;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current.getData() == data) {
                return true;
            }
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
        return false;

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
        // System.out.println("Maximum value in the tree is " + findMaximumBinaryTreeRecursion(tree.getRoot()));
        System.out.println("Value found " + searchRecursive(tree.getRoot(), 3));
        System.out.println("Value found " + searchIterative(tree.getRoot(), 3));
    }
}
