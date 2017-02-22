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
public class RemoveLeafNodesInAVLTree {
//    public static AVLTreeNode removeLeafNodes(AVLTreeNode root) {
//        if(root == null)
//            return null;
//        root.setLeft(removeLeafNodes(root.getLeft()));
//        root.setRight(removeLeafNodes(root.getRight()));
//        if(root.getLeft() == null && root.getRight() == null)
//            return null;
//        return root;
//    }
    // Above commented code always returns root node only.
        public static AVLTreeNode removeLeafNodes(AVLTreeNode root) {
        if(root == null)
            return null;
          if(root.getLeft() == null && root.getRight() == null)
            return null;
        root.setLeft(removeLeafNodes(root.getLeft()));
        root.setRight(removeLeafNodes(root.getRight()));
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
       // tree.insert(5);
        //tree.insert(4);
       // tree.insert(6);
       // inOrderTraversal(tree.getRoot());
        removeLeafNodes(tree.getRoot());
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
