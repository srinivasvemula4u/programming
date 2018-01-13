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
public class LeastCommonAncestor {
    public static BinaryTreeNode leastCommonAncestor(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        BinaryTreeNode left = null, right = null;
        if(root == null)
            return root;
        if(root == node1 || root == node2)
            return root;
        left = leastCommonAncestor(root.getLeft(), node1, node2);
        right = leastCommonAncestor(root.getRight(), node1, node2);
        if(left != null && right != null)
            return root;
        else
            return left != null ? left : right;
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
        BinaryTreeNode resultNode = leastCommonAncestor(tree.getRoot(), tree.getRoot().getLeft().getLeft(),tree.getRoot().getLeft().getRight()); 
        if(resultNode != null)
            System.out.println(resultNode.getData());
    }
}
