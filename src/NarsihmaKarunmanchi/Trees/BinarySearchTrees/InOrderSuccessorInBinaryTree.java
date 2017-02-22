/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import NarsihmaKarunmanchi.Trees.BinaryTree;
import NarsihmaKarunmanchi.Trees.BinaryTreeNode;
import java.util.Stack;

/**
 *
 * @author srivemul This program is for Binary Tree(Not for BST)
 */
public class InOrderSuccessorInBinaryTree {

    private static Stack<BinaryTreeNode> stack = new Stack<>();

    public static BinaryTreeNode inorderSuccessorInBinaryTree(BinaryTreeNode root, BinaryTreeNode findingNode) {
        BinaryTreeNode node = findBinaryTreeNode(root, findingNode);
        if (node == null) {
            return null;
        }
        if (node.getRight() == null) {
            return stack.pop();
        } else if (node.getRight() != null) {
            BinaryTreeNode P = node.getRight();
            while (P.getLeft() != null) {
                stack.push(P);
                P = P.getLeft();
            }
            return P;
        }
        return null;

    }

    private static BinaryTreeNode findBinaryTreeNode(BinaryTreeNode root, BinaryTreeNode findingNode) {
        if (root == null) {
            stack.pop();
            return null;
        }
        if (root.getData() == findingNode.getData()) {
            return root;
        } else {
            stack.push(root);
            BinaryTreeNode left = findBinaryTreeNode(root.getLeft(), findingNode);
            if (left != null) {

                return left;
            }
            BinaryTreeNode right = findBinaryTreeNode(root.getRight(), findingNode);
            return right;
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
        tree.insert(-1);
        tree.insert(-1);
        tree.insert(-1);
        tree.insert(-1);
        tree.insert(8);
        tree.insert(9);
        System.out.println(inorderSuccessorInBinaryTree(tree.getRoot(), tree.getRoot().getRight().getLeft()).getData());
    }

    private static void print(Stack<BinaryTreeNode> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getData());
        }
    }
}
