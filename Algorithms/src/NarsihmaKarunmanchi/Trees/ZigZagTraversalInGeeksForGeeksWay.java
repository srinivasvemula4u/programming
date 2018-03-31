/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.Stack;

/**
 *
 * @author sv186040
 *
 * Write a function to print ZigZag order traversal of a binary tree. For the
 * below binary tree the zigzag order traversal will be 1 3 2 7 6 5 4 This
 * problem can be solved using two stacks. Assume the two stacks are current:
 * currentlevel and nextlevel. We would also need a variable to keep track of
 * the current level order(whether it is left to right or right to left). We pop
 * from the currentlevel stack and print the nodes value. Whenever the current
 * level order is from left to right, push the nodes left child, then its right
 * child to the stack nextlevel. Since a stack is a LIFO(Last-In-First_out)
 * structure, next time when nodes are popped off nextlevel, it will be in the
 * reverse order. On the other hand, when the current level order is from right
 * to left, we would push the nodes right child first, then its left child.
 * Finally, do-not forget to swap those two stacks at the end of each
 * level(i.e., when current level is empty)
 *
 * Below is the implementation of the above approach:
 *
 *
 */
public class ZigZagTraversalInGeeksForGeeksWay {

    public static void zigZagTraversalGeeks(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> currentLevel = new Stack<>();
        Stack<BinaryTreeNode> nextLevel = new Stack<>();
        currentLevel.push(root);
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            BinaryTreeNode current = currentLevel.pop();
            System.out.println(current.getData());
            if (leftToRight) {
                if (current.getLeft() != null) {
                    nextLevel.push(current.getLeft());
                }
                if (current.getRight() != null) {
                    nextLevel.push(current.getRight());
                }
            } else {
                if (current.getRight() != null) {
                    nextLevel.push(current.getRight());
                }
                if (current.getLeft() != null) {
                    nextLevel.push(current.getLeft());
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<BinaryTreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(7);
        tree.insert(6);
        tree.insert(5);
        tree.insert(4);
        zigZagTraversalGeeks(tree.getRoot());
    }
}
