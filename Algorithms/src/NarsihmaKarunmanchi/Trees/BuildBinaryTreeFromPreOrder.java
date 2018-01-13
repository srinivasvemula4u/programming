/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author srivemul
 */
public class BuildBinaryTreeFromPreOrder {
    public static BinaryTreeNode buildBinaryTreeFromPreOrder(char[] string,int index)
    {
        if(string == null)
            return null;
        if(string.length == index)
            return null;
        BinaryTreeNode root =new BinaryTreeNode(string[index]);
        if((char)root.getData() == 'L')
            return root;
        index = index + 1;
        root.setLeft(buildBinaryTreeFromPreOrder(string,index));
        index = index + 1;
        root.setRight(buildBinaryTreeFromPreOrder(string,index));
        return root;
    }
    public static void main(String args[]) {
        BinaryTreeNode root = buildBinaryTreeFromPreOrder(new char[]{'I','L','I','L','L'}, 0);
        TreeTravels.inOrderTraversal(root);
    }
}
