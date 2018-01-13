/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public class KthSmallestElementInBST {

    static int count = 0;

    public static void kThSmallestElementInBST(BinarySearchTreeNode root, int k) {
        if (root == null) {
            return;
        }
        kThSmallestElementInBST(root.getLeft(), k);
        if ((++count) == k) {
            System.out.println(root.getData());
            return;
        }
        kThSmallestElementInBST(root.getRight(), k);
    }
    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
       // System.out.println();
        kThSmallestElementInBST(tree.getRoot(), 3);
      
    }
}
