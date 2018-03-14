/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author sv186040
 */
public class InsertingNodeIntoTree {
    
    public static void insertingNodeIntoTree(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
            insertHelper(root, data);
        }
    }
    
    private static void insertHelper(BinaryTreeNode root, int data) {
        if (root != null && root.getData() >= data) {
            if (root.getLeft() == null) {
                root.setLeft(new BinaryTreeNode((data)));
            } else {
                insertHelper(root.getLeft(), data);
            }
        } else if (root != null && root.getData() < data) {
            if (root.getRight() == null) {
                root.setRight(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getRight(), data);
            }
        }
    }
}
