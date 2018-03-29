/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import static NarsihmaKarunmanchi.Trees.TreeTravels.postOrderTraversal;

/**
 *
 * @author srivemul
 */
public class BuildBinaryTreeFromInOrderAndPreOrder {
    public static BinaryTreeNode buildBinaryTree(int[] preOrder,int[] inOrder) {
        if(preOrder.length == 0 || inOrder.length == 0 || inOrder.length != preOrder.length)
            return null;
        return buildBinaryTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }
    private static BinaryTreeNode buildBinaryTree(int[] preOrder, int preStart,int preEnd,int[] inOrder,int inStart,int inEnd) {
        if(preStart > preEnd || inStart > inEnd)
            return null;
        int data = preOrder[preStart];
        BinaryTreeNode current = new BinaryTreeNode(data);
        int offSet = inStart;
        for(; offSet < inEnd; offSet++)
        {
            if(inOrder[offSet] == data)
                break;
            
        }
        current.setLeft(buildBinaryTree(preOrder,preStart+1,preStart+offSet-inStart,inOrder,inStart,offSet-1));
        current.setRight(buildBinaryTree(preOrder,preStart+offSet-inStart+1,preEnd,inOrder,offSet+1,inEnd));
        return current;
    }
    public static void main(String args[]) {
        int[] preOrder = {1, 2, 4, 5, 3};
        int[] inOrder = {4, 2, 5, 1, 3};
        BinaryTreeNode root = buildBinaryTree(preOrder, inOrder);
        postOrderTraversal(root);
    }
}
