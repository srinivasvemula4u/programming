/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.AVLTrees;

/**
 * AVLTreeNode
 *
 * @author srivemul
 */
public class AVLTree {

    private AVLTreeNode root;
    // private AVLTreeNode parent;

    public void setRoot(AVLTreeNode root) {
        this.root = root;
    }

    public AVLTree() {
        root = null;
        //  parent = null;
    }

    public AVLTreeNode getRoot() {
        return root;
    }

    public static int heightOfAVLTree(AVLTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftTreeHeight = heightOfAVLTree(root.getLeft());
        int rightTreeHeight = heightOfAVLTree(root.getRight());
        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }

    public void insert(int data) {
        if (root == null) {
            root = new AVLTreeNode(data);
            return;
        }
        setRoot(insertUtil(root, data));
    }

    private AVLTreeNode insertUtil(AVLTreeNode root, int data) {
        if (root == null) {
            root = new AVLTreeNode(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insertUtil(root.getLeft(), data));
            if (heightOfAVLTree(root.getLeft()) - heightOfAVLTree(root.getRight()) == 2) {
                if (data < root.getLeft().getData()) {
                    root = AVLTreeRotations.singleRotateLeft(root);
                } else {
                    root = AVLTreeRotations.DoubleRotateLeftToRight(root);
                }
                return root;
            }
        } else if (data >= root.getData()) {
            root.setRight(insertUtil(root.getRight(), data));
            if (heightOfAVLTree(root.getRight()) - heightOfAVLTree(root.getLeft()) == 2) {
                if (data > root.getRight().getData()) {
                    root = AVLTreeRotations.singleRotateRight(root);
                } else {
                    root = AVLTreeRotations.DoubleRotateRightToLeft(root);
                }
                return root;
            }
        }
        root.setHeight(Math.max(root.getLeft() == null ? 0 : root.getLeft().getHeight(),
                root.getRight() == null ? 0 : root.getRight().getHeight()) + 1);
        return root;

    }

    public static void inOrderTraversal(AVLTreeNode root) {
        if (root != null) {
            inOrderTraversal(root.getLeft());
            System.out.print(root.getData());
            inOrderTraversal(root.getRight());
        }
    }

    public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
//        tree.insert(0);
//        tree.insert(-1);
//        tree.insert(-2);
        tree.insert(5);
        tree.insert(4);
        tree.insert(2);
        inOrderTraversal(tree.getRoot());
        System.out.println();
        System.out.println(tree.getRoot().getData());
        System.out.println(tree.getRoot().getLeft().getData());
        System.out.println(tree.getRoot().getLeft().getRight().getData());
        System.out.println(tree.getRoot().getRight().getData());
        // System.out.println(tree.getRoot().getRight().getRight().getLeft().getData());
        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }

}
