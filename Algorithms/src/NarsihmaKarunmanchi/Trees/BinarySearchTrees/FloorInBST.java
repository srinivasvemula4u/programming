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
public class FloorInBST {

    public static BinarySearchTreeNode prev = null; // For floorInBST2 method

    public static BinarySearchTreeNode floorInBST(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode prevNode = null;
        return floorInBSTUtil(root, prevNode, data);
    }

    public static BinarySearchTreeNode floorInBST2(BinarySearchTreeNode root, int data) {
        /*
             My own test logic need to think further
            in the main function tree if data = 11 it should return 10. So we need to calculate maximum data in the tree.
         */
        BinarySearchTreeNode maximumDataNode = FindingMaximumElementInBST.maximum(root);  // If data is not in the range of tree nodes data
        if (data >= maximumDataNode.getData()) {
            return maximumDataNode;
        }
        return floorInBSTUtil2(root, data);
    }

    /* This method  floorInBSTUtil doesnt work for the following tree
     BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(2);
       // tree.insert(1);
        tree.insert(0);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);
        BinarySearchTreeNode node = floorInBST(tree.getRoot(), 1);
    Output : null instead of 0
    reason is prevNode becoming null;   
     */
    private static BinarySearchTreeNode floorInBSTUtil(BinarySearchTreeNode root, BinarySearchTreeNode prevNode, int data) {
        if (root == null) {
            return null;
        }

        BinarySearchTreeNode left = floorInBSTUtil(root.getLeft(), prevNode, data);
        if (left != null) {
            return left;
        }
        if (root != null && root.getData() == data) {
            return root;
        }
        if (root.getData() > data) {
            return prevNode;
        }
        prevNode = root;
        return floorInBSTUtil(root.getRight(), prevNode, data);

    }

    private static BinarySearchTreeNode floorInBSTUtil2(BinarySearchTreeNode root, int data) {
        if (root == null) {
            return null;
        }
        BinarySearchTreeNode left = floorInBSTUtil2(root.getLeft(), data);
        if (left != null) {
            return left;
        }
        if (root != null && root.getData() == data) {
            return root;
        }
        if (root.getData() > data) {
            return prev;
        }
        prev = root;
        return floorInBSTUtil2(root.getRight(), data);
    }

    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(0);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);
        // BinarySearchTreeNode node = floorInBST(tree.getRoot(), 11);
        BinarySearchTreeNode node = floorInBST2(tree.getRoot(), 0);
        System.out.println(node != null ? node.getData() : node);
    }

}
