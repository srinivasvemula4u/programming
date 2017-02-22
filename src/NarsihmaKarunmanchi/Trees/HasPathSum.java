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
public class HasPathSum {

    public static boolean hasPathSum(BinaryTreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.getLeft() == null && root.getRight() == null && root.getData() == sum) {
            return true;
        } else {
            return (hasPathSum(root.getLeft(), sum - root.getData()) || hasPathSum(root.getRight(), sum - root.getData()));
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
        System.out.println("Tree has path Sum is " + hasPathSum(tree.getRoot(), 11));
    }

}
