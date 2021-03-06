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
public class IsBSTRightWay {

    public static boolean isBST(BinarySearchTreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.getLeft() != null && FindingMaximumElementInBST.maximum(root.getLeft()).getData() > root.getData()) {
            return false;
        }
        if (root.getRight() != null && FindingMinimumElementInBST.minimum(root.getRight()).getData() < root.getData()) {
            return false;
        }
        if (!isBST(root.getLeft()) || !isBST(root.getRight())) {
            return false;
        }
        return true;
    }

    public static boolean isBSTBestWay(BinarySearchTreeNode root) {
        if (root == null) {
            return true;
        }
        return isBSTBestWayUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBSTBestWayUtil(BinarySearchTreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.getData() < min || root.getData() > max) {
            return false;
        }
        return isBSTBestWayUtil(root.getLeft(), min, root.getData() - 1)
                && isBSTBestWayUtil(root.getRight(), root.getData() + 1, max);
    }

    public static boolean isBSTUsingInorder(BinarySearchTreeNode root) {
        BinarySearchTreeNode prev = null;
        return isBSTUsingInorderHelper(root, prev);
    }

    private static boolean isBSTUsingInorderHelper(BinarySearchTreeNode root, BinarySearchTreeNode prev) {
        if (root != null) {
            if (!isBST(root.getLeft())) {
                return false;
            }

            // allows only distinct values node
            if (prev != null && root.getData() <= prev.getData()) {
                return false;
            }
            prev = root;
            return isBST(root.getRight());
        }
        return true;
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
        System.out.println(isBST(tree.getRoot()));
        System.out.println(isBSTBestWay(tree.getRoot()));
        System.out.println(isBSTUsingInorder(tree.getRoot()));
    }

}
