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
public class SizeOfBinaryTree {

    public static int sizeOfBinaryTreeRecursive(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = root.getLeft() == null ? 0 : sizeOfBinaryTreeRecursive(root.getLeft());
        int rightCount = root.getRight() == null ? 0 : sizeOfBinaryTreeRecursive(root.getRight());
        return 1 + leftCount + rightCount;
    }

    public static int sizeOfBinaryTreeIterative(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            count++;
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
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
        System.out.println("Size of the tree is " + sizeOfBinaryTreeRecursive(tree.getRoot()));
        System.out.println("Size of the tree is " + sizeOfBinaryTreeIterative(tree.getRoot()));
    }
}
