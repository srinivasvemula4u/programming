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
public class SiblingBinaryTree {

    SiblingBinaryTreeNode root;

    public SiblingBinaryTree() {
        this.root = null;
    }

    public SiblingBinaryTreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        SiblingBinaryTreeNode temp = new SiblingBinaryTreeNode(data);
        if (root == null) {
            root = temp;
            return;
        }
        Queue<SiblingBinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            SiblingBinaryTreeNode current = queue.poll();
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            } else if (current.getLeft() == null) {
                current.setLeft(temp);
                return;
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            } else if (current.getRight() == null) {
                current.setRight(temp);
                return;
            }
        }
    }
}
