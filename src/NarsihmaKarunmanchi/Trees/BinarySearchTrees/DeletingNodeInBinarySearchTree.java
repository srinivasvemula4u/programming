/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import static NarsihmaKarunmanchi.Trees.BinarySearchTrees.BinarySearchTree.inOrderTraversal;

/**
 *
 * @author srivemul
 */
public class DeletingNodeInBinarySearchTree {

    public static void delete(BinarySearchTreeNode root, BinarySearchTreeNode previous, int data) {
        if (root == null) {
            return;
        }
        if (root.getData() > data) {
            previous = root;
            delete(root.getLeft(), previous, data);
        } else if (root.getData() < data) {
            previous = root;
            delete(root.getRight(), previous, data);
        } else if (root.getData() == data) {
            if (root.getLeft() != null && root.getRight() != null) {
               // previous = root;
                BinarySearchTreeNode temp = FindingMaximumElementInBST.maximum(root.getLeft());
                root.setData(temp.getData());
                previous = root;
                delete(root.getLeft(), previous, root.getData());
            } else if (root.getLeft() == null && root.getRight() == null) {
                if (root.getData() > previous.getData()) {
                    previous.setRight(null);
                } else {
                    previous.setLeft(null);
                }
            } else if (root.getLeft() != null) {
                if (root.getData() > previous.getData()) {
                    previous.setRight(root.getLeft());
                } else {
                    previous.setLeft(root.getLeft());
                }
            } else if (root.getRight() != null) {
                if (root.getData() > previous.getData()) {
                    previous.setRight(root.getRight());
                } else {
                    previous.setLeft(root.getRight());
                }
            }
        }
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
           inOrderTraversal(tree.getRoot());
           System.out.println();
           delete(tree.getRoot(),null,3);
              inOrderTraversal(tree.getRoot());
              System.out.println();
         
      //  postOrderTraversalIterative(tree.getRoot());
       // levelOrderTraversal(tree.getRoot());
    }
}

