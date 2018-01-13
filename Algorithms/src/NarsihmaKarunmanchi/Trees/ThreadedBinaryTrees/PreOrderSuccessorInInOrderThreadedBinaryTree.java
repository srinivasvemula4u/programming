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
public class PreOrderSuccessorInInOrderThreadedBinaryTree {
    
    public static ThreadedBinaryTreeNode preOrderSuccessor(ThreadedBinaryTreeNode p) {
        ThreadedBinaryTreeNode position;
        if(p.getLTag() == 1)
            return p.getLeft();
        else if(p.getRTag() == 1)
            return p.getRight();
        else 
        {
            position = p.getRight();
            while(position.getRTag() == 0)
                position = position.getRight();
            return position;
        }
    }
     public static ThreadedBinaryTreeNode preOrderSuccessor2(ThreadedBinaryTreeNode p) {
      //  ThreadedBinaryTreeNode position;
        if(p.getLTag() == 1)
            return p.getLeft();
        ThreadedBinaryTreeNode position = p;
        while(position.getRTag() == 0)
            position = position.getRight();
        return position;
    }
}
