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
public class AVLTreeRotations {

    //LL(Left Subtree - Left Node) Rottaion
    public static AVLTreeNode singleRotateLeft(AVLTreeNode X) {
        AVLTreeNode W = X.getLeft();
        X.setLeft(W.getRight());
        W.setRight(X);
        if (X.getLeft() != null && X.getRight() != null) {
            X.setHeight(Math.max(X.getLeft().getHeight(), X.getRight().getHeight()) + 1);
        } else if (X.getLeft() == null && X.getRight() == null) {
            X.setHeight(0);
        } else if (X.getLeft() == null) {
            X.setHeight(X.getRight().getHeight() + 1);
        } else {
            X.setHeight(X.getLeft().getHeight() + 1);
        }
        W.setHeight(Math.max(W.getLeft() == null ? 0 : W.getLeft().getHeight(), X.getHeight()) + 1);
        return W;
    }

    // RR(Right Subtree-Right Node) Rotation
    public static AVLTreeNode singleRotateRight(AVLTreeNode X) {
        AVLTreeNode Y = X.getRight();
        X.setRight(Y.getLeft());
        Y.setLeft(X);
        if (X.getLeft() != null && X.getRight() != null) {
            X.setHeight(Math.max(X.getLeft().getHeight(), X.getRight().getHeight()) + 1);
        } else if (X.getLeft() == null && X.getRight() == null) {
            X.setHeight(0);
        } else if (X.getLeft() == null) {
            X.setHeight(X.getRight().getHeight() + 1);
        } else {
            X.setHeight(X.getLeft().getHeight() + 1);
        }
        Y.setHeight(Math.max(X.getHeight(), Y.getRight() == null ? 0 : Y.getRight().getHeight()) + 1);
        return Y;
    }

    //LR(Left Subtree- Right Node) Rotation
    public static AVLTreeNode DoubleRotateLeftToRight(AVLTreeNode Z) {
        Z.setLeft(singleRotateRight(Z.getLeft()));
        return singleRotateLeft(Z);
    }

    //RL (Right Subtree- Left Node) Rotation
    public static AVLTreeNode DoubleRotateRightToLeft(AVLTreeNode Z) {
        Z.setRight(singleRotateLeft(Z.getRight()));
        return singleRotateRight(Z);
    }

}
