/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 * Constructing the binary search tree from sorted array
 */
public class ConvertArrayIntoBST {
    public static BinarySearchTreeNode buildBSTFromArray(int A[],int start,int end) {
        if(start > end)
            return null;
        BinarySearchTreeNode newNode;
       if(start == end) {
           newNode = new BinarySearchTreeNode(start);
           newNode.setLeft(null);
           newNode.setRight(null);
       }
       int mid = start + (end-start) / 2;
       newNode = new BinarySearchTreeNode(A[mid]);
       newNode.setLeft(buildBSTFromArray(A, start, mid-1));
       newNode.setRight(buildBSTFromArray(A, mid+1, end));
       return newNode;
    }
    public static void main(String args[]) {
       BinarySearchTreeNode root = buildBSTFromArray(new int[]{0,1,2,3,4,5,6,7},0,7);
       BinarySearchTree.inOrderTraversal(root);
    }
}
