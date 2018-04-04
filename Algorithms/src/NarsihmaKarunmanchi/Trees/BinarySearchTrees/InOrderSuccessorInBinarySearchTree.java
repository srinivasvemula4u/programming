/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class InOrderSuccessorInBinarySearchTree {

    private static Stack<BinarySearchTreeNode> stack = new Stack<>();

    public static BinarySearchTreeNode inOrderSuccessorInBinarySearchTree(BinarySearchTreeNode findNode) {

        //return node;  
        if (findNode.getRight() == null) {
            if (stack.isEmpty()) {
                return null;
            } else {
                return stack.pop();
            }
        } else if (findNode.getRight() != null) {
            BinarySearchTreeNode P = findNode.getRight();
            while (P.getLeft() != null) {
                stack.push(P);
                P = P.getLeft();
            }
            return P;
        }
        return null;
    }

    public static BinarySearchTreeNode findBinarySearchTreeNode(BinarySearchTreeNode root, BinarySearchTreeNode findNode) {
        if (root == null) {
            stack.pop();
            return null;
        }
        if (root.getData() == findNode.getData()) {
            return root;
        } else if (root.getData() > findNode.getData()) {
            stack.push(root);
            BinarySearchTreeNode left = findBinarySearchTreeNode(root.getLeft(), findNode);
            if (left != null) {
                return left;
            }
        } else {
            stack.push(root);
            return findBinarySearchTreeNode(root.getRight(), findNode);
        }
        return null;
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
        //inOrderTraversal(tree.getRoot());
        BinarySearchTreeNode node = findBinarySearchTreeNode(tree.getRoot(), tree.getRoot().getRight().getLeft());
        System.out.println(inOrderSuccessorInBinarySearchTree(node).getData());
        System.out.println();
    }
}
