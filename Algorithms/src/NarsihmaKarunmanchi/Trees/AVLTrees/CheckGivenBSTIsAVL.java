/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.AVLTrees;

import NarsihmaKarunmanchi.Trees.BinarySearchTrees.BinarySearchTree;
import static NarsihmaKarunmanchi.Trees.BinarySearchTrees.BinarySearchTree.inOrderTraversal;
import NarsihmaKarunmanchi.Trees.BinarySearchTrees.BinarySearchTreeNode;

/**
 *
 * @author srivemul
 */
public class CheckGivenBSTIsAVL {

    public static boolean isAVL(BinarySearchTreeNode root) {
        if (root == null) {
            return true;
        }
        return isAVL(root.getLeft()) && isAVL(root.getRight()) && (Math.abs(getHeight(root.getLeft()) - getHeight(root.getRight())) <= 1);
    }

    private static int getHeight(BinarySearchTreeNode root) {
        int left, right;
        if (root == null) {
            return 0;
        } else {
            left = getHeight(root.getLeft());
            right = getHeight(root.getRight());
            if(left > right) 
                return left+1;
            else 
                return right+1;
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
       // inOrderTraversal(tree.getRoot());
        System.out.println(isAVL(tree.getRoot()));
        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }

}
