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
public class MaximumDepthOfBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static int maximumDepthOfBinaryTree(BinaryTreeNode root) {
        if(root == null)
            return 0;
        int maxLeft = maximumDepthOfBinaryTree(root.getLeft());
        int maxRight = maximumDepthOfBinaryTree(root.getRight());
        return 1+Math.max(maxLeft, maxRight);
    }
    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
      //  tree.insert(15);
        System.out.println("Height of the tree is " + maximumDepthOfBinaryTree(tree.getRoot()));
     //   System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
      //  System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
    }
    
}
