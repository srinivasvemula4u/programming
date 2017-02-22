/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class MinimumDepthOfBinaryTree {

    // Need to Test for Stack
    // Its working properly for Queue and Recursive.
    public static int minimumDepthOfBinaryTreeRecursive(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int minLeft = minimumDepthOfBinaryTreeRecursive(root.getLeft());
        int minRight = minimumDepthOfBinaryTreeRecursive(root.getRight());
        return 1 + Math.min(minLeft, minRight);
    }
    // In progress.
    public static int minimumDepthOfBinaryTreeIterative(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<BinaryTreeNode> treeStack = new Stack<>();
        treeStack.push(root);
        int minHeight = Integer.MAX_VALUE;
        BinaryTreeNode previousNode = null;
        while (!treeStack.isEmpty()) {
            BinaryTreeNode currentNode = treeStack.peek();
            if (previousNode == null || previousNode.getLeft() == currentNode || previousNode.getRight() == currentNode) {
                if (currentNode.getLeft() != null) {
                    treeStack.push(currentNode.getLeft());
                } else if (currentNode.getRight() != null) {
                    treeStack.push(currentNode.getRight());
                }
                else
                        {
                            minHeight = treeStack.size();
                        }
            } else if (currentNode.getLeft() == previousNode) {
                if (currentNode.getRight() != null) {
                    treeStack.push(currentNode.getRight());
                }
            } else {
                treeStack.pop();
              //  if( root.getData() == )
               //  if(minHeight > treeStack.size())
               // minHeight = treeStack.size();
               // break;
            }
            previousNode = currentNode;
        //   if(minHeight > treeStack.size())
          //     minHeight = treeStack.size();
        }
        return minHeight;

    }
    public static int findingHeightOfTreeWithQueue(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int count = 1;
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if (currentNode != null) {
             if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                    return count;
               }
                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            } else if (currentNode == null) {
                if (!queue.isEmpty()) {
                    count++;
                    queue.offer(null);
                }
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
        tree.insert(14);
      //  tree.insert(15);
        System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeIterative(tree.getRoot()));
        System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
        System.out.println("Height of the tree is " + minimumDepthOfBinaryTreeRecursive(tree.getRoot()));
    }

}
