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
public class InOrderSuccessor {
    public static ThreadedBinaryTreeNode inOrderSuccessor(ThreadedBinaryTreeNode p)
    {
        ThreadedBinaryTreeNode position;
        if(p.getRTag() == 0)
          return p.getRight();
        position = p.getRight();
        while(position.getLTag() == 1)
            position = p.getLeft();
        return position;
    }
}

