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
public class FindingSumOfAllNodesInTree {
    public static int findingSumOfAllNodesInTree(BinaryTreeNode root) {
        if(root == null)
            return 0;
        else 
            return root.getData()+findingSumOfAllNodesInTree(root.getLeft())+findingSumOfAllNodesInTree(root.getRight());
    }
     public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        System.out.println("Tree has path Sum is " + findingSumOfAllNodesInTree(tree.getRoot()));
    }
}
