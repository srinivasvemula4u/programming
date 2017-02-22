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
For Simplicity lets assume that there are two nodes p and q and we want to attach Q to the right of p for this we will have
two cases
1) Node p does not have right child: In this case we just need to attach Q to P and change its left and right pointers
2) Node P has right child(Say R) In this case we need to traverse R's left subtree and find the left most node and then update the left
and thrn lrgt snf tight pointer of that node.
*/
public class InsertRightInInorderTBT {
    public static void insterRightInInorderTBT(ThreadedBinaryTreeNode P, ThreadedBinaryTreeNode Q) {
        ThreadedBinaryTreeNode temp;
        Q.setRight(P.getRight());
        Q.setRTag(P.getRTag());
        Q.setLTag(0);
        Q.setLeft(P);
        P.setRight(Q);
        P.setRTag(1);
        if(Q.getRTag() == 1) {
            temp = Q.getRight();
            while(temp.getLTag() == 1)
                temp = temp.getLeft();
            temp.setLeft(Q);
            
        }
        
    }
}
