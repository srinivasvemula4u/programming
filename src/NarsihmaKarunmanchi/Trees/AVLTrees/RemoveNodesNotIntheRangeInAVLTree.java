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
public class RemoveNodesNotIntheRangeInAVLTree {
    public static AVLTreeNode pruneNodesInAVL(AVLTreeNode root,int a,int b) {
        if(root == null)
            return null;
        root.setLeft(pruneNodesInAVL(root.getLeft(),a,b));
        root.setRight(pruneNodesInAVL(root.getRight(),a,b));
        if(a<=root.getData() && b>= root.getData()) 
            return root;
        if(root.getData() < a)
            return root.getRight();
        if(root.getData() > b) 
            return root.getLeft();
        return root;
    }
    public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(5);
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(6);
        pruneNodesInAVL(tree.getRoot(), 2, 7);
            AVLTree.inOrderTraversal(tree.getRoot());
        System.out.println();
       // System.out.println(tree.getRoot().getData());
        //      System.out.println(tree.getRoot().getLeft().getData());
                //         System.out.println(tree.getRoot().getRight().getData());
       // System.out.println(isAVL(tree.getRoot()));
        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }
}
