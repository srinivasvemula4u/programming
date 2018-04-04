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
public class CeilingInBST {

    public static BinarySearchTreeNode prev = null;

    public static BinarySearchTreeNode ceilingInBST(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode prevNode = null;
        return ceilingInBSTUtils(root, prevNode, data);
    }

    public static BinarySearchTreeNode ceilingInBST2(BinarySearchTreeNode root, int data) {
        //BinarySearchTreeNode prevNode = null;
        /*
             My own test logic need to think further
            in the main function tree if data = -1 it should return 0. So we need to calculate minimum data in the tree.
         */
        BinarySearchTreeNode minimumDataNode = FindingMinimumElementInBST.minimum(root);
        if (data < minimumDataNode.getData()) {
            return minimumDataNode;
        }
        return ceilingInBSTUtils2(root, data);
    }

    /*
    This method  ceilingInBSTUtils doesnt work for the following tree
     BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);
        BinarySearchTreeNode node = ceilingInBST(tree.getRoot(), 4);
        System.out.println(node != null ? node.getData() : node);
    Output : null instead of 5.
    reason is prevNode becoming null;  
     */
    private static BinarySearchTreeNode ceilingInBSTUtils(BinarySearchTreeNode root, BinarySearchTreeNode prevNode, int data) {
        if (root == null) {
            return null;
        }
        BinarySearchTreeNode right = ceilingInBSTUtils(root.getRight(), prevNode, data);
        if (right != null) {
            return right;
        }
        if (root != null && root.getData() == data) {
            return root;
        }
        if (root.getData() < data) {
            return prevNode;
        }
        prevNode = root;
        return ceilingInBSTUtils(root.getLeft(), prevNode, data);
    }

    private static BinarySearchTreeNode ceilingInBSTUtils2(BinarySearchTreeNode root, int data) {
        if (root == null) {
            return null;
        }
        BinarySearchTreeNode right = ceilingInBSTUtils2(root.getRight(), data);
        if (right != null) {
            return right;
        }
        if (root != null && root.getData() == data) {
            return root;
        }
        if (root.getData() < data) {
            return prev;
        }
        prev = root;
        return ceilingInBSTUtils2(root.getLeft(), data);
    }

    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);
        //  BinarySearchTreeNode node = ceilingInBST(tree.getRoot(), 4);
        BinarySearchTreeNode node = ceilingInBST2(tree.getRoot(), -100);
        System.out.println(node != null ? node.getData() : node);
    }

}
