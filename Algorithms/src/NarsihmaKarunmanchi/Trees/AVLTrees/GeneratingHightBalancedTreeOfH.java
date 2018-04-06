/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.AVLTrees;

/**
 *
 * @author srivemul
 */
// HB(0) is nothing but generating full binary tree.In full binary tree the number of nodes with height h are 2^(h+1) -1.
public class GeneratingHightBalancedTreeOfH {

    private static int count = 0;

    public static AVLTreeNode buildHightBalnacedTree(int h) {
        if (h == 0) {
            return null;
        }
        AVLTreeNode left = buildHightBalnacedTree(h - 1);
        AVLTreeNode newNode = new AVLTreeNode(count++);
        newNode.setLeft(left);
        newNode.setRight(buildHightBalnacedTree(h - 1));
        newNode.setHeight(Math.max(newNode.getLeft() == null ? 0 : newNode.getLeft().getHeight(), newNode.getRight() == null
                ? 0 : newNode.getRight().getHeight()));
        return newNode;
    }

    public static AVLTreeNode buildHBO(int l, int r) {
        AVLTreeNode temp;
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        AVLTreeNode newNode = new AVLTreeNode(mid);
        newNode.setLeft(buildHBO(l, mid - 1));
        newNode.setRight(buildHBO(mid + 1, r));
        newNode.setHeight(Math.max(newNode.getLeft() == null ? 0 : newNode.getLeft().getHeight(), newNode.getRight() == null
                ? 0 : newNode.getRight().getHeight()));
        return newNode;
    }

    public static void main(String args[]) {
        AVLTreeNode root = buildHightBalnacedTree(3);
        AVLTree.inOrderTraversal(root);
        root = buildHBO(0, 3);

    }
}
