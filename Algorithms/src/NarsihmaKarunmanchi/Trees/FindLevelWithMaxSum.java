/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class FindLevelWithMaxSum {

    public static int findLevelWithMaxSum(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        queue.offer(root);
        queue.offer(null);
        int levelSum = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if (currentNode != null) {
                levelSum += currentNode.getData();
                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            } else {
                if (levelSum > maxSum) {
                    maxSum = levelSum;
                }
                levelSum = 0;
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
            }

        }
        return maxSum;
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
        System.out.println("level maxSum of the tree is " + findLevelWithMaxSum(tree.getRoot()));

    }
}
