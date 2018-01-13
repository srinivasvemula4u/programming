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
public class MirrorOfBinaryTree {
    public static void mirrorOfBinaryTree(BinaryTreeNode root) {
        BinaryTreeNode temp;
        if(root != null) 
        {
        
            mirrorOfBinaryTree(root.getLeft());
            mirrorOfBinaryTree(root.getRight());
            temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }
    } 
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
         preOrderTraversal(tree.getRoot());
         System.out.println();
        mirrorOfBinaryTree(tree.getRoot());
        preOrderTraversal(tree.getRoot());
    }
    
}
