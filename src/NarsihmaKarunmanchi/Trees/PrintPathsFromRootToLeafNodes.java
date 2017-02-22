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
public class PrintPathsFromRootToLeafNodes {

    public static void printPathsFromRootToLeafNodes(BinaryTreeNode root) {

        int[] path = new int[256];
        printPathsFromRootToLeafNodes(root, path, 0);

    }

    public static void printPathsFromRootToLeafNodes(BinaryTreeNode root, int[] path, int pathLength) {
        if (root == null) {
            return;
        }
        path[pathLength] = root.getData();
        pathLength++;
        if (root.getLeft() == null && root.getRight() == null) {
            printPath(path, pathLength);
            System.out.println();
        } else {
            printPathsFromRootToLeafNodes(root.getLeft(), path, pathLength);
            printPathsFromRootToLeafNodes(root.getRight(), path, pathLength);
        }
    }

    public static void printPath(int[] path, int pathLength) {
        for (int i = 0; i < pathLength; i++) {
            System.out.print(path[i] + " ");

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
        // tree.insert(7);
        printPathsFromRootToLeafNodes(tree.getRoot());
        //System.out.println("level maxSum of the tree is " + findLevelWithMaxSum(tree.getRoot()));

    }
}
