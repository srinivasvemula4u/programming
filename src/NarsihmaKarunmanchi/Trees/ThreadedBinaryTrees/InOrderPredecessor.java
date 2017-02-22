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
// Need to Verify this.
public class InOrderPredecessor {
    public static ThreadedBinaryTreeNode inOrderPredecessor (ThreadedBinaryTreeNode p)
    {
        if(p.getLTag() == 0)
            return p.getLeft();
        ThreadedBinaryTreeNode position;
        position = p.getLeft();
        while(position.getRTag() == 1)
            position = position.getRight();
        return position;
    }
}
