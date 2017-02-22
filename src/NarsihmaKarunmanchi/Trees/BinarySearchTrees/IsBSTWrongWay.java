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
/* This approach wrong as this will return true for binary tree below . Checking only at current node is not enough.
         6
         /\
        2  8
       /\
      1  9
 */
public class IsBSTWrongWay {

    public static boolean isBST(BinarySearchTreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.getLeft() != null && root.getLeft().getData() > root.getData()) {
            return false;
        }
        if (root.getRight() != null && root.getRight().getData() < root.getData()) {
            return false;
        }
        if (!isBST(root.getLeft()) || !isBST(root.getRight())) {
            return false;
        }
        return true;
    }
}
