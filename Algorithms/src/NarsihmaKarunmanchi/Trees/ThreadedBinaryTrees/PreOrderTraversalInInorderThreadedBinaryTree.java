/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.ThreadedBinaryTrees;

/**
 *
 * @author srivemul
 */
/*
 AS in PreOrder Traversal start with dummy Node and call PreOrderSuccessor() to visit each node untill we get dummy node 
again
 */
public class PreOrderTraversalInInorderThreadedBinaryTree {

    public static void preOrderTraversal(ThreadedBinaryTreeNode root) {
        ThreadedBinaryTreeNode P = PreOrderSuccessorInInOrderThreadedBinaryTree.preOrderSuccessor2(root);
        System.out.println(P.getData());
        while (P != root) {
            P = PreOrderSuccessorInInOrderThreadedBinaryTree.preOrderSuccessor2(P);
            System.out.println(P.getData());
        }
    }

    public static void preOrderTraversal2(ThreadedBinaryTreeNode root) {
        ThreadedBinaryTreeNode P = root;
        while (true) {
             P = PreOrderSuccessorInInOrderThreadedBinaryTree.preOrderSuccessor2(P);
             if( P == root)
                return;
           System.out.println(P.getData());
        }
    }
}
