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
public class NumberOfHalfNodesInBinaryTree {
   public static int numberOfHalfNodesInBinaryTree(BinaryTreeNode root)
   {
           Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //   queue.offer(null);
        int count = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();

            if ((currentNode.getLeft() != null && currentNode.getRight() == null)|| (currentNode.getLeft() == null && currentNode.getRight() != null)) {
                count++;
            }
            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }
        }
        return count;
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
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        //tree.insert(14);
          //tree.insert(15);
        System.out.println("Number of LeafNodes in a tree is " + numberOfHalfNodesInBinaryTree(tree.getRoot()));
        //  System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
        // System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
    }
}
