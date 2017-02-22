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
public class FindingMinimumElementInBST {

    public static BinarySearchTreeNode minimum(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.getLeft() == null) {
            return root;
        }
        return minimum(root.getLeft());
    }

    public static BinarySearchTreeNode minimumIterative(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
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
        BinarySearchTreeNode node = minimumIterative(tree.getRoot());
        System.out.println(node != null ? node.getData() : node);

    }

}
