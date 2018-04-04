/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class RangePrinterInBST {

    public static void rangePrinterInBST(BinarySearchTreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.getData() >= k1) {
            rangePrinterInBST(root.getLeft(), k1, k2);
        }
        if (k1 <= root.getData() && k2 >= root.getData()) {
            System.out.println(root.getData());
        }
        if (root.getData() <= k2) {
            rangePrinterInBST(root.getRight(), k1, k2);
        }
    }

    public static void rangePrinterUsingLevelOrder(BinarySearchTreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }
        Queue<BinarySearchTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinarySearchTreeNode currentNode = queue.poll();
            if (k1 <= currentNode.getData() && k2 >= currentNode.getData()) {
                System.out.println(currentNode.getData());
            }
            // if(currentNode.getLeft() != null)
            if (currentNode.getLeft() != null && currentNode.getData() >= k1) {
                queue.offer(currentNode.getLeft());
            }
            //if(currentNode.getRight() != null)
            if (currentNode.getRight() != null && currentNode.getData() <= k2) {
                queue.offer(currentNode.getRight());
            }
        }
    }

    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(2);
        tree.insert(6);
        tree.insert(12);
        tree.insert(11);
        tree.insert(17);
        rangePrinterInBST(tree.getRoot(), 6, 11);
        //rangePrinterUsingLevelOrder(tree.getRoot(), 6, 11);
        //  BinarySearchTreeNode node = floorInBST(tree.getRoot(), 11);
        // BinarySearchTreeNode node = floorInBST2(tree.getRoot(), 100);
        //System.out.println(node != null ? node.getData() : node);
    }

}
