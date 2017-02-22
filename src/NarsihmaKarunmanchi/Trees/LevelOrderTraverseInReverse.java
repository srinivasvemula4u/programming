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
public class LevelOrderTraverseInReverse {

    public static void levelOrderTraverseInReverse(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            stack.push(current);
        }
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop().getData());
        }
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
        levelOrderTraverseInReverse(tree.getRoot());
        //  System.out.println(levelOrderTraverseInReverse(tree.getRoot()));
    }

}
