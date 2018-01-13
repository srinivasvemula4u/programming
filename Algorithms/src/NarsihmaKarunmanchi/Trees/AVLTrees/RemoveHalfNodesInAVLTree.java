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
public class RemoveHalfNodesInAVLTree {
    public static AVLTreeNode removeHalfNodes(AVLTreeNode root) {
        if(root == null)
            return null;
        root.setLeft(removeHalfNodes(root.getLeft()));
        root.setRight(removeHalfNodes(root.getRight()));
        if(root.getLeft() == null && root.getRight() == null)
            return root;
        if(root.getLeft() == null) 
            return root.getRight();
        if(root.getRight() == null)
            return root.getLeft();
        return root;
    }
      public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        tree.insert(0);
        tree.insert(3);
        tree.insert(1);
       tree.insert(2);
       // tree.insert(5);
        //tree.insert(4);
       // tree.insert(6);
       // inOrderTraversal(tree.getRoot());
        removeHalfNodes(tree.getRoot());
        AVLTree.inOrderTraversal(tree.getRoot());
        System.out.println();
        System.out.println(tree.getRoot().getData());
              System.out.println(tree.getRoot().getLeft().getData());
                         System.out.println(tree.getRoot().getRight().getData());
       // System.out.println(isAVL(tree.getRoot()));
        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }
}
