/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import static NarsihmaKarunmanchi.Trees.TreeTravels.preOrderTraversal;

/**
 *
 * @author srivemul
 */
public class BuildBinaryTreeFromInOrderAndPostOrder {

    public static BinaryTreeNode buildBinaryTree(int[] postOrder, int[] inOrder) {
        if (postOrder.length == 0 || inOrder.length == 0 || inOrder.length != postOrder.length) {
            return null;
        }
        return buildBinaryTree(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode buildBinaryTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        int data = postOrder[postEnd];
        BinaryTreeNode current = new BinaryTreeNode(data);
        int offset = inStart;
        for (; offset < inEnd; offset++) {
            if (inOrder[offset] == data) {
                break;
            }
        }
        current.setLeft(buildBinaryTree(postOrder, postStart, postStart + offset - inStart - 1, inOrder, inStart, offset - 1));
        current.setRight(buildBinaryTree(postOrder, postStart + offset - inStart, postEnd - 1, inOrder, offset + 1, inEnd));
        return current;
    }

    public static void main(String args[]) {
        int[] postOrder = {4, 5, 2, 3, 1};
        int[] inOrder = {4, 2, 5, 1, 3};
        BinaryTreeNode root = buildBinaryTree(postOrder, inOrder);
        preOrderTraversal(root);
    }
}
