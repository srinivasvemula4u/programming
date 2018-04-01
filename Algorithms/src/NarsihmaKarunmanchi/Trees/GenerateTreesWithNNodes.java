/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.ArrayList;

/**
 *
 * @author srivemul
 */
public class GenerateTreesWithNNodes {

    public static ArrayList<BinaryTreeNode> generateTreesWithNNodes(int n) {
        if (n == 0) {
            return generateTrees(1, 0);
        }
        return generateTrees(1, n);
    }

    private static ArrayList<BinaryTreeNode> generateTrees(int start, int end) {
        ArrayList<BinaryTreeNode> treeList = new ArrayList<>();
        if (start > end) {
            treeList.add(null);
            return treeList;
        }
        for (int i = start; i <= end; i++) {
            for (BinaryTreeNode left : generateTrees(start, i - 1)) {
                for (BinaryTreeNode right : generateTrees(i + 1, end)) {
                    BinaryTreeNode root = new BinaryTreeNode(i);
                    root.setLeft(left);
                    root.setRight(right);
                    treeList.add(root);
                }
            }
        }
        return treeList;
    }

    public static void main(String args[]) {

        ArrayList<BinaryTreeNode> treeList = generateTreesWithNNodes(3);
        System.out.println(treeList.size());
    }

}
