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
/*
To get minimum number of nodes fill one level with h-1 and other with h-2
 */
public class GenerateAVLTreeWithMinimumNumberOfNodes {

    private static int count = 0;

    public static AVLTreeNode GenerateAVLTree(int h) {
        if (h <= 0) {
            return null;
        }
        AVLTreeNode left = GenerateAVLTree(h - 1);
        AVLTreeNode newNode = new AVLTreeNode(count++);
        newNode.setLeft(left);
        newNode.setRight(GenerateAVLTree(h - 2));
        newNode.setHeight(Math.max(newNode.getLeft() == null ? 0 : newNode.getLeft().getHeight(), newNode.getRight() == null
                ? 0 : newNode.getRight().getHeight()));
        return newNode;
    }

    public static void main(String args[]) {
        AVLTreeNode root = GenerateAVLTree(3);
        AVLTree.inOrderTraversal(root);

    }
}
