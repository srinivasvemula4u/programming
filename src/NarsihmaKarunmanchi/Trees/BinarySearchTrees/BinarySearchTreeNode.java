/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }
    
    /* The following operations are performed on BinarySearch Trees
    Main Operations:
    1) Find/ Find Minimum / Find Maximum in binary search trees
    2) Inserting an element into Biary Search tree
    3) Deleting an element from Binary Search tree
    
    Auxilary Operation:
    1) Checking whether the given tree is a binary search tree or not
    2) Fining the kth Smallest element in the tree
    3) Sorting the elements of binary Search tree and many more
    */
}
