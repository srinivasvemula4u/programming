/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public class FindingMaximumElementInBST {

    public static BinarySearchTreeNode maximum(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.getRight() == null) {
            return root;
        }
        return maximum(root.getRight());
    }

    public static BinarySearchTreeNode maximumIterative(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root;
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
        BinarySearchTreeNode node = maximumIterative(tree.getRoot());
        System.out.println(node != null ? node.getData() : node);

    }
}
