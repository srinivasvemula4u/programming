/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author sv186040
 */
public class LCA {

    public static BinarySearchTreeNode lca(BinarySearchTreeNode root, BinarySearchTreeNode a,
            BinarySearchTreeNode b) {
        if (root == null) {
            return null;
        }
        if (root.getData() == a.getData() || root.getData() == b.getData()) {
            return root;
        }

    }
}
