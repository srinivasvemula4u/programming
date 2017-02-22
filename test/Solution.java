/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
import java.io.*;
import java.util.*;

class BinaryTreeNode {

    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public int getData() {
        return data;
    }

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}

class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        BinaryTreeNode temp = new BinaryTreeNode(data);
        if (root == null) {
            root = temp;
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            } else if ((current.getLeft() == null) && (current.getData() != -1)) {
                current.setLeft(temp);
                return;
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            } else if ((current.getRight() == null) && (current.getData() != -1)) {
                current.setRight(temp);
                return;
            }
        }
    }

    public void inOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraversal(root.getLeft());
            if (root.getData() != -1) {
                System.out.print(root.getData() + " ");
            }
            inOrderTraversal(root.getRight());
        }

    }

    public void swapNodes(BinaryTreeNode root, int level) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int treeLevel = 0;
        queue.offer(root);
        queue.offer(null);
        treeLevel = 1;
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if (currentNode != null) {
                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            } else if ((treeLevel % level) == 0) {
                Queue<BinaryTreeNode> tempQueue = new LinkedList<>();
                while (!queue.isEmpty()) {
                    tempQueue.offer(queue.poll());
                }
                while (!tempQueue.isEmpty()) {
                    BinaryTreeNode A = tempQueue.poll();
                    BinaryTreeNode B = tempQueue.poll();
                    BinaryTreeNode temp = new BinaryTreeNode(-1);
                    temp.setData(A.getData());
                    temp.setLeft(A.getLeft());
                    temp.setRight(A.getRight());
                    A.setLeft(B.getLeft());
                    A.setRight(B.getRight());
                    A.setData(B.getData());
                    B.setData(temp.getData());
                    B.setLeft(temp.getLeft());
                    B.setRight(temp.getRight());
                    queue.offer(A);
                    queue.offer(B);
                }
                if (!queue.isEmpty()) {
                    queue.offer(null);
                    treeLevel++;
                }
            } else if (!queue.isEmpty()) {
                queue.offer(null);
                treeLevel++;
            }
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        for (int i = 0; i < N; i++) {
            tree.insert(scanner.nextInt());
            tree.insert(scanner.nextInt());
        }
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            tree.swapNodes(tree.getRoot(), scanner.nextInt());
            tree.inOrderTraversal(tree.getRoot());
            System.out.println();
        }

    }
}
