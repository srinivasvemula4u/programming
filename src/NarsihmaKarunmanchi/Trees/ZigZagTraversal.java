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
public class ZigZagTraversal {

    public static void zigZagTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        boolean RtoL = false;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        Stack<BinaryTreeNode> stack1 = new Stack<>();
        Stack<BinaryTreeNode> stack2 = new Stack<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current != null) {
                if (RtoL == false) {
                    list.add(current.getData());
                }
                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.offer(current.getRight());
                }
            } else {
                RtoL = RtoL != true;
                if (RtoL) {
                    while (!queue.isEmpty()) {
                        stack1.push(queue.poll());
                    }
                    while (!stack1.isEmpty()) {
                        list.add(stack1.peek().getData());
                        stack2.push(stack1.pop());
                    }
                    while (!stack2.isEmpty()) {
                        queue.offer(stack2.pop());
                    }
                }
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }

            }
        }
        for (int val : list) {
            System.out.print(val + " ");
        }

    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
//        tree.insert(6);
//        tree.insert(7);
//        tree.insert(8);
//        tree.insert(9);
//        tree.insert(10);
//        tree.insert(11);
//         tree.insert(12);
//        tree.insert(13);
//        tree.insert(14);
//        tree.insert(15);
//        tree.insert(16);
//        tree.insert(17);
        zigZagTraversal(tree.getRoot());
    }
}
