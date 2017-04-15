/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * not working need to look
 * @author srivemul
 */
public class RangePrinterUsingInorderSuccessor {

    public static void rangePrinterUsingInorderSuccessor(BinarySearchTreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }
        BinarySearchTreeNode node = new BinarySearchTreeNode(k1);
        BinarySearchTreeNode k1Node = InOrderSuccessorInBinarySearchTree.findBinarySearchTreeNode(root, node);
        if (k1Node != null) {
            System.out.println(k1Node.getData());
        }
        node = new BinarySearchTreeNode(k2);
        BinarySearchTreeNode k2Node = InOrderSuccessorInBinarySearchTree.inOrderSuccessorInBinarySearchTree(k1Node);
        System.out.println(k2Node.getData());
        while (k2Node.getData() != node.getData()) {
         //   System.out.println(k2Node.getData());
            k2Node = InOrderSuccessorInBinarySearchTree.inOrderSuccessorInBinarySearchTree(k2Node);
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
       // rangePrinterInBST(tree.getRoot(), 6, 11);
        rangePrinterUsingInorderSuccessor(tree.getRoot(), 6, 11);
        //  BinarySearchTreeNode node = floorInBST(tree.getRoot(), 11);
       // BinarySearchTreeNode node = floorInBST2(tree.getRoot(), 100);
        //System.out.println(node != null ? node.getData() : node);
    }
}
