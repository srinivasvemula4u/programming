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
public class FindingElementInBinarySearchTree {

    public static BinarySearchTreeNode find(BinarySearchTreeNode root, int data) {
        if (root == null) {
            return null;
        }
        if (data == root.getData()) {
            return root;
        } else if (data < root.getData()) {
            return find(root.getLeft(), data);
        } else {
            return find(root.getRight(), data);
        }
    }

    public static BinarySearchTreeNode findIterative(BinarySearchTreeNode root, int data) {
        if (root == null) {
            return null;
        }
        while (root != null) {
            if (root.getData() == data) {
                return root;
            } else if (root.getData() > data) {
                root = root.getLeft();
            } else if (root.getData() < data) {
                root = root.getRight();
            }
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
        BinarySearchTreeNode node = find(tree.getRoot(), 7);
        System.out.println(node != null ? node.getData() : node);

    }
}
