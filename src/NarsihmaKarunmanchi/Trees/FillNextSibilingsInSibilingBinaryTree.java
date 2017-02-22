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
public class FillNextSibilingsInSibilingBinaryTree {

    public static void fillNextSibilings(SiblingBinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<SiblingBinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            SiblingBinaryTreeNode currentNode = queue.poll();
            if (currentNode != null) {
                currentNode.setNextSibiling(queue.peek());
                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            } else if (!queue.isEmpty()) {
                queue.offer(null);
            }

        }
    }
    public void fillNextSibilingsRecursive(SiblingBinaryTreeNode root)
    {
        if(root == null)
            return;
        if(root.getLeft() != null)
            root.getLeft().setNextSibiling(root.getRight());
        if(root.getRight() != null)
        {
            if(root.getNextSibiling() != null)
               root.getRight().setNextSibiling(root.getNextSibiling().getLeft());
            else 
                root.getRight().setNextSibiling(null);
        }
        fillNextSibilings(root.getLeft());
        fillNextSibilings(root.getRight());
    }
}
