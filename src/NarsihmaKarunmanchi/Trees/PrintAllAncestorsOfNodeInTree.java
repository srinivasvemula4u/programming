/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author srivemul
 */
public class PrintAllAncestorsOfNodeInTree {

    public static boolean printAllAncestorsOfNodeInTree(BinaryTreeNode root, BinaryTreeNode node) {
        if (root == null) {
            return false;
        }
        if (root.getLeft() == node || root.getRight() == node || printAllAncestorsOfNodeInTree(root.getLeft(), node) || printAllAncestorsOfNodeInTree(root.getRight(), node)) {
            System.out.println(root.getData());
            return true;
        }
        return false;
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
        printAllAncestorsOfNodeInTree(tree.getRoot(), tree.getRoot().getRight().getRight());  
    }
}
