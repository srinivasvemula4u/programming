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
public class FindMaximumInBinaryTree {

    public static int findMaximumBinaryTreeRecursion(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int maxLeft = findMaximumBinaryTreeRecursion(root.getLeft());
            int maxRight = findMaximumBinaryTreeRecursion(root.getRight());
            if (maxLeft >= maxRight) {
                maxValue = maxLeft;
            } else {
                maxValue = maxRight;
            }
            if (maxValue < root.getData()) {
                maxValue = root.getData();
            }
        }
        return maxValue;
    }

    public static int findMaximumBinaryTreeIterative(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                BinaryTreeNode current = queue.poll();
                if (current.getData() > maxValue) {
                    maxValue = current.getData();
                }
                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());         
                }
                if(current.getRight() != null) {
                    queue.offer(current.getRight());
                }
            }
        }
        return maxValue;
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
        System.out.println("Maximum value in the tree is " + findMaximumBinaryTreeRecursion(tree.getRoot()));
         System.out.println("Maximum value in the tree is " + findMaximumBinaryTreeIterative(tree.getRoot()));
    }
}
