/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 *
 * /*
 * The main idea of the solution is while traversing BST from root to bottom the
 * first node we counter with value between x and y i.e x less than node.data
 * less than is the least common ancestor(LCA) of x and Y where (x less than
 * y).So just traverse the BST in pre order if we find a node with value in
 * between x and y then the node is LCA. If its value is greater than both x and
 * y then LCA lies on left side of the node and if its value is smaller than
 * both x and y then LCA lies on the right side
 */
public class LowestCommonAncestor {

    public static BinarySearchTreeNode LCA(BinarySearchTreeNode root, BinarySearchTreeNode x, BinarySearchTreeNode y) {
        if (root == null) {
            return null;
        }
        if (root.getData() == x.getData() || root.getData() == y.getData()) {
            return root;
        }
        if (root.equals(x) || root.equals(y)) {
            return root;
        }
        if (Math.max(x.getData(), y.getData()) < root.getData()) {
            return LCA(root.getLeft(), x, y);
        } else if (Math.min(x.getData(), y.getData()) > root.getData()) {
            return LCA(root.getRight(), x, y);
        } else {
            return root;
        }
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
        BinarySearchTreeNode node = LCA(tree.getRoot(), tree.getRoot().getLeft().getLeft(), tree.getRoot().getLeft().getRight());
        //   inOrderTraversal(tree.getRoot());
        System.out.println(node.getData());
        //    delete(tree.getRoot(),null,3);
        //       inOrderTraversal(tree.getRoot());
        System.out.println();

        //  postOrderTraversalIterative(tree.getRoot());
        // levelOrderTraversal(tree.getRoot());
    }
}
