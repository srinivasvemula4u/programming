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
public class checkTwoTreesAreReflections {

    public static boolean checkTwoTreesAreReflections(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return checkTwoTreesAreReflections(root1.getLeft(), root2.getRight()) && checkTwoTreesAreReflections(root1.getRight(), root2.getLeft());
    }

    public static void main(String args[]) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        tree1.insert(1);
        tree1.insert(2);
        tree1.insert(3);
//        tree1.insert(4);
//        tree1.insert(5);
        tree2.insert(6);
        tree2.insert(7);
        tree2.insert(8);
//        tree2.insert(9);
//        tree2.insert(10);
        System.out.println("Structure of the trees is " + checkTwoTreesAreReflections(tree1.getRoot(), tree2.getRoot()));
    }
}
