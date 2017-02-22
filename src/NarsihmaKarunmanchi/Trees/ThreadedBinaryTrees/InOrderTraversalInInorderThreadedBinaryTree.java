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
/* We can start with dummy node and call inorder Successor() to visit each node until we reach dummy node */
public class InOrderTraversalInInorderThreadedBinaryTree {
    public static void inOrderTraversal(ThreadedBinaryTreeNode root) {
        ThreadedBinaryTreeNode P = InOrderSuccessor.inOrderSuccessor(root);
        System.out.println(P.getData());
        while(P != root)
        {
            P = InOrderSuccessor.inOrderSuccessor(P);
             System.out.println(P.getData());
        }
        
    }
      public static void inOrderTraversal2(ThreadedBinaryTreeNode root) {
          ThreadedBinaryTreeNode P = root;
          while(true)
          {
              P = InOrderSuccessor.inOrderSuccessor(P);
              if( P == root)
                  return;
              System.out.println(P.getData());
          }
      }
      
}
